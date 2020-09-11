package com.prueba.web.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "institutions_locations")
public class InstitutionsLocations implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter BigInteger id;
	
	
	@Column(name = "institution_id"  ,nullable = false)
	private @Getter @Setter BigInteger institutionId;
	
	
	
	
	@Column(name = "loc_element_id")
	private @Getter @Setter BigInteger locElementId;
	
	
	@Column(name = "isHeadquater")
	private @Getter @Setter String is_headquater;
	
	private @Getter@Setter  String city;
	
	
	
	@ManyToOne(optional=false)
	@JoinColumn(name="loc_element_id",insertable=false, updatable=false)
	@Getter @Setter LocElements country;
	
	
	
	@ManyToOne(optional=false)
	@JoinColumn(name="institution_id", insertable=false, updatable=false)
	@Getter @Setter Institutions institution;
}
