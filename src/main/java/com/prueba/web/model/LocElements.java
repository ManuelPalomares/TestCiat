package com.prueba.web.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "loc_elements")
public @Data class LocElements implements Serializable {

	/*Properties*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private @Getter @Setter BigInteger id;
	
	
	private @Getter @Setter String name;
	
	
	
	@Column(name = "iso_alpha_2")
	private @Getter @Setter String isoAlpha2;
	
	
	
	@Column(name = "parentId")
	private @Getter	@Setter Integer parent_id;
	
	
	
	@Column(name = "element_type_id")
	private @Getter	@Setter Integer elementTypeId;
	
	
	@Column(name = "is_active")
	private @Getter @Setter Integer isActive;
	
	
	
	@OneToMany(mappedBy = "country")
	private @Getter	@Setter Set<InstitutionsLocations> institutionLocalizations;
	
	
}
