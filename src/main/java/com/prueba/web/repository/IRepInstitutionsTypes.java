package com.prueba.web.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.web.model.InstitutionsTypes;


@Repository
public interface IRepInstitutionsTypes extends JpaRepository<InstitutionsTypes, BigInteger> {

}
