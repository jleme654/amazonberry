package br.com.amazonberry.enums;

public enum Receita_Enum {

	CREME_CUPUACU(1, "CREME_CUPUACU");

	public int id;
	public String nome;

	Receita_Enum(int id, String nome) {
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
