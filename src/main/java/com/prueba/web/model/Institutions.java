package com.prueba.web.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Institutions")
public @Data class Institutions implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private @Getter @Setter BigInteger id;
	
	
	 private @Getter @Setter String name;
	
	
	 private @Getter @Setter String acronym;
	
	
	@Column(name = "website_link")
	private @Getter @Setter  String websiteLink;
	
	
	@Column(name = "program_id")
	private @Getter @Setter BigInteger programId ;
	
	
	private @Getter @Setter BigInteger institutionTypeId;
	
	
	private @Getter @Setter Date added;
	
	
	/*relation type institution*/
	@OneToOne
    @PrimaryKeyJoinColumn(name = "institutionTypeId")
	private @Getter @Setter InstitutionsTypes type;
	
	
	
	
	
	@OneToMany(mappedBy ="institution")
	private @Getter	@Setter Set<InstitutionsLocations> locations;




	
	
	
	
	
}
