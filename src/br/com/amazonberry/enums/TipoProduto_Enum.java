package br.com.amazonberry.enums;

public enum TipoProduto_Enum {

	ACAI(1, "ACAI"),
	CREME (2, "CREME");

	public int id;
	public String tipo;

	TipoProduto_Enum(int id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
