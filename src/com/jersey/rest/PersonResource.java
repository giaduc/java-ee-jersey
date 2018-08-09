package com.jersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
public class PersonResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Person getPerson() {
		Person p = new Person("giaduc", 21);

		return p;
	}
}
