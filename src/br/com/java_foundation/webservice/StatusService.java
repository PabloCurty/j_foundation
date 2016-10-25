package br.com.java_foundation.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/statusservice")
public class StatusService {

	@GET
	@Path("/status")
	public String getStatus() {
		return "webService on";
	}
}
