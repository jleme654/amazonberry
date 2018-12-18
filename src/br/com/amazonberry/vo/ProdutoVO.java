package br.com.amazonberry.vo;

import br.com.amazonberry.enums.TipoEmbalagem_Enum;
import br.com.amazonberry.enums.TipoProduto_Enum;

public class ProdutoVO {

	private Integer id;
	private TipoProduto_Enum tipoProduto;
	private TipoEmbalagem_Enum tipoEmbalagem;

	/**
	 * construtores
	 * 
	 * @return
	 */
	public ProdutoVO(Integer id, TipoProduto_Enum tipoProduto, TipoEmbalagem_Enum tipoEmbalagem) {
		super();
		this.id = id;
		this.tipoProduto = tipoProduto;
		this.tipoEmbalagem = tipoEmbalagem;
	}

	public ProdutoVO() {
	}

	/**
	 * getters and setters
	 * 
	 * @return
	 */
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
		return "ProdutoVO [id=" + id + ", tipoProduto=" + tipoProduto + ", tipoEmbalagem=" + tipoEmbalagem + "]";
	}

}
