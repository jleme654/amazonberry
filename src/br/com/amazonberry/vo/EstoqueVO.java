package br.com.amazonberry.vo;

import java.sql.Timestamp;

public class EstoqueVO {

	private ProdutoVO produto;
	private Integer qtdeProduto;
	private Timestamp dataContagem; // dataDeHoje = new Timestamp(System.currentTimeMillis());

	public Timestamp getDataContagem() {
		return dataContagem;
	}

	public void setDataContagem(Timestamp dataContagem) {
		this.dataContagem = dataContagem;
	}

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
		return "EstoqueVO [produto=" + produto + ", qtdeProduto=" + qtdeProduto + ", dataContagem=" + dataContagem
				+ "]";
	}

}
