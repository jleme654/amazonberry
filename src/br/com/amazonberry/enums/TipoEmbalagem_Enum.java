package br.com.amazonberry.enums;

public enum TipoEmbalagem_Enum {

	BAG_10_KG(1, "SACO_BAG_10_KG"),
	ACUCAR_KILO_DEFAULT (2, "Acucar KILO Default"), 
	BAG_6_5_KG (3, "BAG 6.5 KG")
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
