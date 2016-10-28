package br.com.java_foundation.webservice;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.java_foundation.controle.EntidadeControle;

@Path("/entidadeservice")
public class EntidadeServiceImpl implements EntidadeService_interface{

	//@Inject
	EntidadeControle entidadeControle = new EntidadeControle();
	
	@Override
	public List<Object> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	@GET
	@Path("get/{nomeEntidade}/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public Object getEntidade(@PathParam("nomeEntidade") String nomeEntidade, @PathParam("id") String id ) {
		return entidadeControle.getEntidade(id, nomeEntidade);
	}

}
