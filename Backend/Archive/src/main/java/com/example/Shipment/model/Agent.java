package com.example.Shipment.model;

import javax.persistence.*;

@Entity
@Table(name = "Agent")
public class Agent {

	@Override
	public String toString() {
		return "Agent{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				'}';
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email_id")
	private String email;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Agent(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Agent() {

	}
}
