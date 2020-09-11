package com.prueba.web.controllers;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prueba.web.model.Institutions;
import com.prueba.web.model.InstitutionsLocations;
import com.prueba.web.model.TO.InstitutionsLocationsTO;
import com.prueba.web.services.InstitutionsLocationsSrv;
import com.prueba.web.services.InstitutionsSrv;
import com.prueba.web.services.InstitutionsTypesSrv;
import com.prueba.web.services.LocElementsSrv;

@Controller
@CrossOrigin(origins = "*")
public class InstitutionsCtrl {

		@Autowired
		private InstitutionsSrv institutionsrv;
		
		@Autowired
		private InstitutionsLocationsSrv instlocationsrv;
		
		@Autowired
		private InstitutionsTypesSrv instypes;
		
		@Autowired
		private LocElementsSrv locElementSrv;
		
		@RequestMapping(path = "/institutions",method = RequestMethod.GET)
		public String index(Model model) {
			
			model.addAttribute("listInstitutions",institutionsrv.findAll());
			
			return "institutions";
			
		}
		
		
		@RequestMapping(path = "/editinstitutions/{idinstitution}",method = RequestMethod.GET)
		public String editInstitutions(@PathVariable(value="idinstitution") BigInteger id,Model model) {
			
			try {
				
				Optional<Institutions> institution;
				
				institution = 	institutionsrv.findById(id);
				model.addAttribute("institution",institution);
				
				Institutions  institutionobj = (Institutions) institution.get();
				
				BigInteger idins = institutionobj.getId();
				
				 List<InstitutionsLocations> locations = instlocationsrv.findByinstitution_id(idins);
				 
				 
				 
				 
				 model.addAttribute("locationslist",locations);
				 
				 model.addAttribute("listTypes",instypes.findAll());
				 
				 model.addAttribute("countrysList",locElementSrv.findAll());
				 model.addAttribute("institutionlocato",new InstitutionsLocationsTO());
				 
				
							return "editInstitutions";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	
			
		}
		
		@PostMapping(path = "/institutionsave")
		public String saveInstitution(@ModelAttribute Institutions institution,Model model) {
			
			try {
				
				
				institution.setAdded(new Date());
				
				
				 institutionsrv.save(institution);
				 
				
				 BigInteger idins = institution.getId();
				
				 List<InstitutionsLocations> locations = instlocationsrv.findByinstitution_id(idins);
				
				 model.addAttribute("institution",institution);
				 model.addAttribute("locationslist",locations);
				 
				 model.addAttribute("listTypes",instypes.findAll());
				 
				 model.addAttribute("countrysList",locElementSrv.findAll());
				 model.addAttribute("institutionlocato",new InstitutionsLocationsTO());
				 
				
				
				
				return "editInstitutions";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	
			
		}
		
		
		@PostMapping(path = "/institutionsLocationSave")
		public @ResponseBody String saveInstitutionLocation(@ModelAttribute InstitutionsLocationsTO institutionlocato,Model model) {
			
			try {
				
				
				
				 
				  
				 InstitutionsLocations instloca = new InstitutionsLocations();
				 
				 Institutions institution = institutionsrv.findById(institutionlocato.getIdInstitution()).get();
				 
				 instloca.setInstitutionId(institutionlocato.getIdInstitution());
				 instloca.setIs_headquater("1");
				 instloca.setLocElementId(institutionlocato.getIdLocElement());
				 instloca.setCity(instloca.getCity());
				 instloca.setInstitution(institution);
				 
				 
				 instlocationsrv.save(instloca);
				 
				 
				 
				
				
				return "ok";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	
			
		}
		
		
		

}
