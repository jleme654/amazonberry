package br.com.amazonberry.vo;

import java.sql.Timestamp;

public class EstoqueVO {

	protected ProdutoVO produto;
	protected Integer qtdeProduto;
	protected Timestamp dataContagem; // dataDeHoje = new Timestamp(System.currentTimeMillis());

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

	public Timestamp getDataContagem() {
		return dataContagem;
	}

	public void setDataContagem(Timestamp dataContagem) {
		this.dataContagem = dataContagem;
	}

	@Override
	public String toString() {
		return "EstoqueVO [produto=" + produto + ", qtdeProduto=" + qtdeProduto + ", dataContagem=" + dataContagem
				+ "]";
	}

}
