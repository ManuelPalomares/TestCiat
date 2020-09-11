package com.prueba.web.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.web.model.LocElements;


@Repository
public interface IRepLocElements extends JpaRepository<LocElements, BigInteger> {
 
}
