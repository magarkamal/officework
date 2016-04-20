package com.intech.macrohotel.user.model.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class of user role
 * @author rajendra
 *
 */
@Entity
@Table(name="roles")
public class Role{
	
	@Id
	@Column(name = "id", unique = true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "name")
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}