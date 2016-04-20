package com.intech.macrohotel.user.model.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class of authenticate user 
 * @author rajendra
 *
 */
@Entity
@Table(name = "auth_users")
public class AuthUser{

	@Id
	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "password")
	private String password;

}
