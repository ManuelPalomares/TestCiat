package com.prueba.web.services;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.web.model.InstitutionsLocations;

@Service
public interface InstitutionsLocationsSrv extends  GenericService<InstitutionsLocations, BigInteger> {

	List<InstitutionsLocations> findByinstitution_id(BigInteger idInstitution);

}
