package br.com.amazonberry.vo;

public class EstoqueVO {

	private ProdutoVO produto;
	private Integer qtdeProduto;

	public ProdutoVO getProduto() {
		return produto;
	}

	public void setProduto(ProdutoVO produto) {
		this.produto = produto;
	}

	public Integer getQtdeProduto() {
		return qtdeProduto;
	}

	public void setQtdeProduto(Integer qtdeProduto) {
		this.qtdeProduto = qtdeProduto;
	}

	@Override
	public String toString() {
		return "EstoqueVO [produto=" + produto + ", qtdeProduto=" + qtdeProduto + "]";
	}

}
