package br.com.amazonberry.enums;

public enum TipoEmbalagem_Enum {

	EMB_10_LT(1, "SACO_BAG_10_KG"),
	EMB_05_LT (4, "EMBALAGEM DE 5 LITROS"),
	EMB_3_5_LT (5, "EMBALAGEM DE 3,5 LITROS"),
	EMB_2_LT (6, "EMBALAGEM DE 2 LITROS"),
	EMB_1_LT (7, "EMBALAGEM DE 1 LITRO"),
	EMB_500_ML (8, "EMBALAGEM DE 500 MILI LITROS"),
	EMB_220_ML (9, "EMBALAGEM DE 220 MILI LITROS"),
	ACUCAR_KILO_DEFAULT (2, "Acucar KILO Default"), 
	BAG_6_5_KG (3, "BAG 6.5 KG"),
	CX_5_LT (10, "Caixa de 5 litros"),
	CX_10_LT (11,"Caixa de 10 litros");

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
