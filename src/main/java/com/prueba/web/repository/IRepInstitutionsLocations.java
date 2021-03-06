package com.prueba.web.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.web.model.InstitutionsLocations;

@Repository
public interface IRepInstitutionsLocations  extends JpaRepository<InstitutionsLocations, BigInteger> {

	public List<InstitutionsLocations> findByinstitutionId(BigInteger id);
}
