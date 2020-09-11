package com.prueba.web.services;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.web.model.InstitutionsLocations;
import com.prueba.web.repository.IRepInstitutionsLocations;

@Service
public class InstitutionsLocationsSrvImpl implements InstitutionsLocationsSrv {

	
	@Autowired
	IRepInstitutionsLocations irepInstloca;
	
	@Override
	public List<InstitutionsLocations> findAll() {
		return irepInstloca.findAll();
	}

	@Override
	public InstitutionsLocations save(InstitutionsLocations entity) throws Exception {
		
		
		return irepInstloca.save(entity);
	}

	@Override
	public InstitutionsLocations update(InstitutionsLocations entity) throws Exception {
		return irepInstloca.save(entity);
	}

	@Override
	public void delete(InstitutionsLocations entity) throws Exception {
		irepInstloca.delete(entity);
		

	}

	@Override
	public void deleteById(BigInteger id) throws Exception {
		irepInstloca.deleteById(id);

	}

	@Override
	public Optional<InstitutionsLocations> findById(BigInteger clieId) throws Exception {
		return irepInstloca.findById(clieId);
	}

	@Override
	public void validate(InstitutionsLocations entity) throws Exception {

	}

	@Override
	public Long count() {
		return irepInstloca.count();
		
	}
	
	public List<InstitutionsLocations> findByinstitution_id(BigInteger id){
		return irepInstloca.findByinstitutionId(id);
		
	}

}
