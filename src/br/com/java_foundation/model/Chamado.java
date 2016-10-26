package br.com.java_foundation.model;

import java.util.Date;

public class Chamado extends EntidadeAbastrata_impl{

	private static final long serialVersionUID = 1L;

	private Date data;
	private String text;
	private String nome;
	

	public Chamado(String oid) {
		super(oid);
	}

	public Chamado(String id, Date data, String text, String nome) {
		super(id);
		this.data = data;
		this.text = text;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


}
