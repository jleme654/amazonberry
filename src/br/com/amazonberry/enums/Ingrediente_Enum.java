package br.com.amazonberry.enums;

public enum Ingrediente_Enum {

	POLPA_CUPUACU(1, "POLPA_CUPUACU"),
	ACUCAR (2, "ACUCAR"), 
	SABORIZANTE (3, "SABORIZANTE"),
	IMPOSTOS(4, "IMPOSTOS"),
	ENERGIA (5, "ENERGIA"),
	AGUA (6, "AGUA"),
	EMBALAGEM(7, "EMBALAGEM"),
	FUNCIONARIO (8, "FUNCIONARIO");

	public int id;
	public String nome;

	Ingrediente_Enum(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
