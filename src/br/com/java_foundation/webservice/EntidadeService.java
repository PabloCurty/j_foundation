package br.com.java_foundation.webservice;

import java.util.List;

public interface EntidadeService {

	public List<Object> lista();
	public Object getEntidade(Long id);
}
