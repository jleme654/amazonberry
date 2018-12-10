package br.com.amazonberry.enums;

public enum TipoEmbalagem_Enum {

	SACO_BAG_10_KG(1, "SACO_BAG_10_KG"),
	ACUCAR (2, "Acucar")
	;

	public int id;
	public String tipo;

	TipoEmbalagem_Enum(int id, String tipo) {
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
