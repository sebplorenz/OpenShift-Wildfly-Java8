package de.blogspot.sebplorenz;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class Test {
	
	@GET
	@Path("{userName}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getUserName(@PathParam("userName") String userName) {
		return "Hello user " + userName + ". Arrays.toString(\"" + userName + "\".chars().sorted().toArray()) returns " + Arrays.toString(userName.chars().sorted().toArray());
	}
	
}
