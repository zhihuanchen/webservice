package com.jersey.exmaples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("helloworld")
public class HelloWorldResource {
	
	public static final String CLICHED_MESSAGE="hello wrold!";
	
	@GET
	@Produces("text/plain")
	public String getHello(){
		return CLICHED_MESSAGE;
	}

}
