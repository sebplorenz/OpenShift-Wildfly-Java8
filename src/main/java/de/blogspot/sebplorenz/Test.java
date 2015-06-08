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
	public String getBadges(@PathParam("userName") String userName) {
		return "Hello user " + userName + ". Your sorted characters: " + Arrays.asList(userName.toCharArray()).stream().sorted();
	}

}
