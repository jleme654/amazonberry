package br.com.amazonberry.vo;

import br.com.amazonberry.enums.TipoEmbalagem_Enum;
import br.com.amazonberry.enums.TipoProduto_Enum;

public class ProdutoVO {

	private Integer id;
	private TipoEmbalagem_Enum tipoEmbalagem;
	private TipoProduto_Enum tipoProduto;
	private double precoUnitario;

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoEmbalagem_Enum getTipoEmbalagem() {
		return tipoEmbalagem;
	}

	public void setTipoEmbalagem(TipoEmbalagem_Enum tipoEmbalagem) {
		this.tipoEmbalagem = tipoEmbalagem;
	}

	public TipoProduto_Enum getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto_Enum tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	@Override
	public String toString() {
		return "ProdutoVO [id=" + id + ", tipoEmbalagem=" + tipoEmbalagem + ", tipoProduto=" + tipoProduto + "]";
	}

}
