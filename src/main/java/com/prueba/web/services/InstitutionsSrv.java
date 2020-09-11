package com.prueba.web.services;

import java.math.BigInteger;

import org.springframework.stereotype.Service;

import com.prueba.web.model.Institutions;


@Service
public  interface InstitutionsSrv   extends GenericService<Institutions, BigInteger>  {

}
