package com.prueba.web.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.web.model.Institutions;

@Repository
public interface IRepInstitutions extends JpaRepository<Institutions, BigInteger>{

}
