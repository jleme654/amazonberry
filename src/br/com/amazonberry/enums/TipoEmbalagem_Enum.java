package br.com.amazonberry.enums;

public enum TipoEmbalagem_Enum {

	ACUCAR_KILO_DEFAULT (2, "Acucar KILO Default"), 
	BAG_6_5_KG (3, "BAG 6.5 KG"),
	POTE_220ML (1, "Pote de 200 ml"),
	POTE_500ML (4,"Pote de 500 ml"),
	POTE_900ML (5, "Pote de 900 ml"),
	POTE_1LT (6,"Pote de 1 lt"),
	POTE_2LT(7,"Pote de 2 lt"),
	BALDE_3_6_LT (8, "Balde de 3.6 lt"), 
	BALDE_5LT(9, "Balde de 5lt"),
	BALDE_7LT(10, "Balde de 7 lt"),
	BALDE_10LT (11, "Balde de 10 lt"),
	CAIXA_5LT (12, "Caixa de 5 lt"),
	CAIXA_10LT (13, "Caixa de 10 lt"),
	POLPA_MD_1KG (14, "polpa media 1 kg"),
	POLPA_PPL_1KG (15, "Polpa popular 1 kg"),
	COPO_BASE_80GR (16, "Copo base de 80 gr"),
	BOMBONA_5LT (17, "Galao de 5 lt");

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
