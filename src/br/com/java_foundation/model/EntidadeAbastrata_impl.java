package br.com.java_foundation.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.google.common.base.Strings;

public abstract class EntidadeAbastrata_impl implements EntidadeAbstrata_interface{

	/**
	 * Em aplicações web o fluxo de rede é constante. Por conta disso é importante que os objetos sejam 
	 * serializados. serializar um objeto significa transformá-lo em um stream de bytes que pode ser 
	 * gravado ou transmitido. Usa-se serialização quando se quer gravar objetos em arquivos ou 
	 * transmití-los pela rede.Em projetos você pode serializar os beans e os managed beans caso esteja 
	 * usando JSF por exemplo.
	 */
	private static final long serialVersionUID = 1L;
	
	protected String oid;
	
	public EntidadeAbastrata_impl(String oid) {
		super();
		this.oid = oid;
	}

	@Override
	public String getOid() {
		return oid;
	}

	@Override
	public void setOid(String oid) {
		this.oid = oid;
	}

	@Override
	public String toString() {
		return oid;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(5, 11).append(oid).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj instanceof EntidadeAbastrata_impl) {
			EntidadeAbastrata_impl ae = (EntidadeAbastrata_impl) obj;

			result = ae.canEqual(this) && new EqualsBuilder().append(oid, ae.getOid()).isEquals();
		}

		return result;
	}

	@Override
	public boolean isNovo() {
		
		return Strings.isNullOrEmpty(oid);
	}

	/**
	 * EqualsVerifier.
	 * 
	 * @param obj
	 * @return canEqual
	 */
	public boolean canEqual(Object obj) {
		return obj instanceof EntidadeAbastrata_impl;
	}
	
}

