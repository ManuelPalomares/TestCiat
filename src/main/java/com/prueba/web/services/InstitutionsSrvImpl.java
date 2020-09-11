package com.prueba.web.services;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.web.model.Institutions;
import com.prueba.web.repository.IRepInstitutions;

@Service
public class InstitutionsSrvImpl implements InstitutionsSrv {

	
	@Autowired
	private IRepInstitutions institutionsrepo;
	
	@Override
	public List<Institutions> findAll() {
		return institutionsrepo.findAll();
		
	}

	@Override
	public Institutions save(Institutions entity) throws Exception {
		
		return institutionsrepo.save(entity);
		
	}

	@Override
	public Institutions update(Institutions entity) throws Exception {
		
		return institutionsrepo.save(entity);
	}

	@Override
	public void delete(Institutions entity) throws Exception {
		
		institutionsrepo.delete(entity);
		
		
	}

	@Override
	public void deleteById(BigInteger id) throws Exception {
		// TODO Auto-generated method stub
		institutionsrepo.deleteById(id);
	}

	@Override
	public Optional<Institutions> findById(BigInteger clieId) throws Exception {
		return institutionsrepo.findById(clieId);
	}

	@Override
	public void validate(Institutions entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		return institutionsrepo.count();
	}
	

}
