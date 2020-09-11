package com.prueba.web.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "institution_types")
@Getter
@Setter
public @Data class InstitutionsTypes implements Serializable {
	
	
	/*Properties*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private @Getter @Setter BigInteger id;
	
	
	
	private @Getter	@Setter	 String name;
	
	
	private @Getter @Setter String acronym;

}
