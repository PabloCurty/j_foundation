package br.com.java_foundation.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/statusservice")
public class StatusService {

	@GET
	@Path("/status")
	@Produces(MediaType.APPLICATION_JSON)
	public String getStatus() {
		return "webService on";
	}
}
