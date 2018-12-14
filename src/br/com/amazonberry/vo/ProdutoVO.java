package br.com.amazonberry.vo;

import br.com.amazonberry.enums.TipoEmbalagem_Enum;
import br.com.amazonberry.enums.TipoProduto_Enum;

public class ProdutoVO {

	private TipoEmbalagem_Enum tipoEmbalagem;
	private TipoProduto_Enum tipoProduto;

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
		return "ProdutoVO [tipoEmbalagem=" + tipoEmbalagem.getTipo() + ", tipoProduto=" + tipoProduto.getTipo() + ", idProduto=" + tipoProduto.getId() +"]";
	}

}
