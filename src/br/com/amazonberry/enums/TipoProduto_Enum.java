package br.com.amazonberry.enums;

public enum TipoProduto_Enum {

	// Cremes
	CREME_ABACAXI_AO_VINHO (1,"Creme de Abacai ao Vinho"),
	CREME_BANANA_COM_NUTELLA (2, "Creme de Banana com Nutella"),
	CREME_BEIJINHO (3,"Creme de Beijinho"),
	CREME_CUPUACU (4, "Cupuacu"),
	CREME_FERRERO (5, "Ferrero"),
	CREME_IOGURTE_FROZEN (6, "Iogurte Frozen"),
	CREME_IOGURTE_FRUTAS_VERMELHAS (7, "Iogurte com Frutas Vermelhas"),
	CREME_MAMAO (8, "Creme de Mamão"),
	CREME_MANGA (9, "Creme de Manga"),
	CREME_MARACUJA (10, "Creme de Maracuja"),
	CREME_MORANGURT (11, "Creme de Morangogurt"),
	CREME_MORANGO_TRUFADO (12,"Creme de Morango Trufado"),
	CREME_NUTELLA (13, "Creme de Nutella"),
	CREME_NINHO_TRUFADO (14, "Creme de Ninho Trufado"),
	CREME_OREO (15, "Creme de Oreo"),
	CREME_PASSA_AO_RUM (16, "Creme de Passas ao Rum"),
	CREME_TAPIOCA_COM_COCO (17, "Tapioca com coco"),
	CREME_PUDIM (18,"Pudim"),
	CREME_KIT_KAT (19, "Kit Kat"),
	CREME_IOGURTE_COM_AMARENA (20, "Iogurte com Amarena"),
	CREME_IOGURTE_ACAI (21, "Acai com Iogurte"),
	CREME_NINHO_NUTELLA (22, "Ninho com Nutella"),
	CREME_DANONE (23, "Danone"),
	CREME_AMENDOIM (24 , "Creme de Amendoim"),
	
	//Acai
	ACAI (25, "Acai");

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
