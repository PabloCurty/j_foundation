package br.com.java_foundation.webservice;

import java.util.List;

public interface EntidadeService_interface {

	public List<Object> lista();
	public Object getEntidade(String id, String nomeEntidade);
}
