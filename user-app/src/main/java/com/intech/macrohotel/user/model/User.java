package com.intech.macrohotel.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.intech.macrohotel.user.model.auth.AuthUser;

/**
 * Entity class for authenticate user details
 * @author rajendra
 *
 */
@Entity
@Table(name="users")
public class User{

	@Id
	@Column(name = "id", unique = true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
		
	@Column(name="code")
	private String code;
	
	@OneToOne
	private AuthUser authUser;
	

}
