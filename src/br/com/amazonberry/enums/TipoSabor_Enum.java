package br.com.amazonberry.enums;

public enum TipoSabor_Enum {

	ABACAXI_AO_VINHO (1,"ABACAXI AO VINHO"),
	BANANA_COM_NUTELLA (2, "BANANA_COM_NUTELLA"),
	BEIJINHO (3,"BEIJINHO"),
	CUPUACU (4, "Cupuacu"),
	FERRERO (5, "Ferrero"),
	IOGURTE_FROZEN (6, "Iogurte Frozen"),
	IOGURTE_FRUTAS_VERMELHAS (7, "Iogurte com Frutas Vermelhas"),
	MAMAO (8, "Mamão"),
	MANGA (9, "Manga"),
	MARACUJA (10, "Maracuja"),
	MORANGURT (11, "Morangogurt"),
	MORANGO_TRUFADO (12,"Morango Trufado"),
	NUTELLA (13, "Nutella"),
	NINHO_TRUFADO (14, "Ninho Trufado"),
	OREO (15, "Oreo"),
	PASSA_AO_RUM (16, "Passas ao Rum"),
	TAPIOCA_COM_COCO (17, "Tapioca com coco"),
	PUDIM (18,"Pudim"),
	KIT_KAT (19, "Kit Kat"),
	IOGURTE_COM_AMARENA (20, "Iogurte com Amarena"),
	IOGURTE_ACAI (21, "Acai com Iogurte"),
	NINHO_NUTELLA (22, "Ninho com Nutella"),
	DANONE (23, "Danone"),
	AMENDOIM (24 , "Amendoim");

	public int id;
	public String tipo;

	TipoSabor_Enum(int id, String tipo) {
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
