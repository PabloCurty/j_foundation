package br.com.java_foundation.controle;

import javax.ejb.Stateless;

@Stateless
public class EntidadeControle {

	public Object getEntidade(Long id){
		
		return id + 1;
	}
}
