package br.com.amazonberry.enums;

public enum TipoProduto_Enum {

	// Cremes
	CREME_ABACAXI_AO_VINHO (1,"ABACAXI AO VINHO"),
	CREME_BANANA_COM_NUTELLA (2, "BANANA_COM_NUTELLA"),
	CREME_BEIJINHO (3,"BEIJINHO"),
	CREME_CUPUACU (4, "Cupuacu"),
	CREME_FERRERO (5, "Ferrero"),
	CREME_IOGURTE_FROZEN (6, "Iogurte Frozen"),
	CREME_IOGURTE_FRUTAS_VERMELHAS (7, "Iogurte com Frutas Vermelhas"),
	CREME_MAMAO (8, "Mamão"),
	CREME_MANGA (9, "Manga"),
	CREME_MARACUJA (10, "Maracuja"),
	CREME_MORANGURT (11, "Morangogurt"),
	CREME_MORANGO_TRUFADO (12,"Morango Trufado"),
	CREME_NUTELLA (13, "Nutella"),
	CREME_NINHO_TRUFADO (14, "Ninho Trufado"),
	CREME_OREO (15, "Oreo"),
	CREME_PASSA_AO_RUM (16, "Passas ao Rum"),
	CREME_TAPIOCA_COM_COCO (17, "Tapioca com coco"),
	CREME_PUDIM (18,"Pudim"),
	CREME_KIT_KAT (19, "Kit Kat"),
	CREME_IOGURTE_COM_AMARENA (20, "Iogurte com Amarena"),
	CREME_IOGURTE_ACAI (21, "Acai com Iogurte"),
	CREME_NINHO_NUTELLA (22, "Ninho com Nutella"),
	CREME_DANONE (23, "Danone"),
	CREME_AMENDOIM (24 , "Amendoim"),
	
	//Acai
	ACAI (25, "Acai Base");

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
