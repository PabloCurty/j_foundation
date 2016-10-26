package br.com.java_foundation.model;


public class Pessoa extends EntidadeAbastrata_impl{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String genero;
	private String localizacao;
	private String userName;
	private String senha;
	
	/*
	 * "pessoa" : {
		"id" : "1111",
		"nome" : "Pablo Curty",
		"genero" : "masculino",
		"localizacao" : "brasil",
		"userName" : "pfcfp",
		"senha" : "123456"
		}
	 */
	
	/*----------------Construtor-----------------------*/
	
	
	
	public Pessoa(String id, String nome, String genero, String localizacao, String userName, String senha) {
		super(id);
		this.nome = nome;
		this.genero = genero;
		this.localizacao = localizacao;
		this.userName = userName;
		this.senha = senha;
	}

	public Pessoa(String id) {
		super(id);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
