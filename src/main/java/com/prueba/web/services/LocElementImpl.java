package com.prueba.web.services;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.web.model.LocElements;
import com.prueba.web.repository.IRepLocElements;

@Service
public class LocElementImpl implements LocElementsSrv {

	@Autowired
	IRepLocElements ireplocelem;

	@Override
	public List<LocElements> findAll() {
		return ireplocelem.findAll();
	}

	@Override
	public LocElements save(LocElements entity) throws Exception {
		return ireplocelem.save(entity);
	}

	@Override
	public LocElements update(LocElements entity) throws Exception {
		return ireplocelem.save(entity);
	}

	@Override
	public void delete(LocElements entity) throws Exception {
		ireplocelem.delete(entity);
		
	}

	@Override
	public void deleteById(BigInteger id) throws Exception {
		ireplocelem.deleteById(id);
		
		
	}

	@Override
	public Optional<LocElements> findById(BigInteger clieId) throws Exception {
		return ireplocelem.findById(clieId);
	}

	@Override
	public void validate(LocElements entity) throws Exception {
		
		
	}

	@Override
	public Long count() {
		return ireplocelem.count();
	}
	


}
