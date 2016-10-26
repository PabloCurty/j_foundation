package br.com.java_foundation.model;

import java.io.Serializable;

public interface EntidadeAbstrata_interface extends Serializable, Cloneable{

	/**
	 *  CLONABLE permite uma clonagem bit a bit de um objeto, processo esse simplesmente chamado de "clonagem". 
	 *  Uma exce��o conhecida como "CloneNotSupportedException" � mostrada se a fun��o clone() � chamada 
	 *  ]numa classe em que n�o se implementou a interface Cloneable. No processo de clonagem o construtor 
	 *  do objeto n�o � chamado. Ent�o, clonar pode ser definido como uma exata c�pia do objeto original.
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
	 * � uma nova entidade?
	 * 
	 * @return isNovo
	 */
	boolean isNovo();
}
