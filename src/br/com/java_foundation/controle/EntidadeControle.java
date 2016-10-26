package br.com.java_foundation.controle;

import javax.ejb.Stateless;

@Stateless
public class EntidadeControle {

	public Object getEntidade(String id, String nomeEntidade){
		 
		return mockPegaNoBanco(id, nomeEntidade);
	}
	
	public Object mockPegaNoBanco(String id, String nomeEntidade) {
		
		Object obj =  new ClassFactory().getInstance(nomeEntidade, id);
		
		Object o = obj.getClass().cast(obj);		
		
		return o.getClass().getName();
				
	}
}
