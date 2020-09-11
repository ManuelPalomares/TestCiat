package com.prueba.web.services;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.web.model.InstitutionsTypes;
import com.prueba.web.repository.IRepInstitutionsTypes;

@Service
public class InstitutionsTypesSrvImpl implements InstitutionsTypesSrv {
	
	@Autowired
	private IRepInstitutionsTypes repInsTypes;
	
	@Override
	public List<InstitutionsTypes> findAll() {
		return repInsTypes.findAll();
	}

	@Override
	public InstitutionsTypes save(InstitutionsTypes entity) throws Exception {
		return repInsTypes.save(entity);

	}

	@Override
	public InstitutionsTypes update(InstitutionsTypes entity) throws Exception {
		return repInsTypes.save(entity);
	}

	@Override
	public void delete(InstitutionsTypes entity) throws Exception {
		repInsTypes.delete(entity);
		
	}

	@Override
	public void deleteById(BigInteger id) throws Exception {
		repInsTypes.deleteById(id);
		
	}

	@Override
	public Optional<InstitutionsTypes> findById(BigInteger clieId) throws Exception {
		return repInsTypes.findById(clieId);
		
	}

	@Override
	public void validate(InstitutionsTypes entity) throws Exception {
		
	}

	@Override
	public Long count() {
		return repInsTypes.count();

	}

}
