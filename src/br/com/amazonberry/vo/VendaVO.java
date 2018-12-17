package br.com.amazonberry.vo;

public class VendaVO extends EstoqueVO {

	public VendaVO() {
		super();
	}

	private double valorProduto;

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	@Override
	public String toString() {
		return "VendaVO [produto=" + produto + ", qtdeProduto=" + qtdeProduto + ", dataContagem=" + dataContagem + "] valorProduto=" + valorProduto +" ]";
	}

}
