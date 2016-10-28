package br.com.java_foundation.model;

import java.io.Serializable;

public interface EntidadeAbstrata_interface extends Serializable, Cloneable{

	/**
	 *  CLONABLE permite uma clonagem bit a bit de um objeto, processo esse simplesmente chamado de "clonagem". 
	 *  Uma exceção conhecida como "CloneNotSupportedException" é mostrada se a função clone() é chamada 
	 *  ]numa classe em que não se implementou a interface Cloneable. No processo de clonagem o construtor 
	 *  do objeto não é chamado. Então, clonar pode ser definido como uma exata cópia do objeto original.
	 */
	
	/**
	 * Recupera o identificador da entidade.
	 * 
	 * @return Identificador da entidade
	 */
	String getOid();

	/**
	 * Define o identificador da entidade.
	 * 
	 * @param id Novo identificador da entidade
	 */
	void setOid(String id);

	/**
	 * É uma nova entidade?
	 * 
	 * @return isNovo
	 */
	boolean isNovo();
}
