package br.com.java_foundation.controle;

import javax.ejb.Stateless;

@Stateless
public class EntidadeControle {

	public Object getEntidade(String id, String nomeEntidade) {
		
		Class<?> klass = new ClassForNameFactory().getClassForName(nomeEntidade);

		//TODO chamada hibernate, busca entidade.  Foundation.sendEntity(klass);

		return klass;
	}

}
