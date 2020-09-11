package com.prueba.web.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.web.model.LocElemenType;


@Repository
public interface IRepLocElemenType extends JpaRepository<LocElemenType, BigInteger> {
	

}
