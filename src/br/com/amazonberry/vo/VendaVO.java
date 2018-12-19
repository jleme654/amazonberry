package br.com.amazonberry.vo;

public class VendaVO extends EstoqueVO {

	public VendaVO() {
		super();
	}

	private double valorUnitario;
	private double valorTotal;

	/***
	 * getters and setters
	 * @return
	 */
	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitarioVenda) {
		this.valorUnitario = valorUnitarioVenda;
	}

	public double getValorTotal() {
		if(qtdeProduto != null && qtdeProduto >0 ) {
			return qtdeProduto*valorUnitario;
		}
		return valorTotal;
	}

	public void setValorTotal(double valorTotalProduto) {
		this.valorTotal = valorTotalProduto;
	}

	@Override
	public String toString() {
		return "VendaVO [produto=" + produto + ", qtdeProduto="
				+ qtdeProduto + ", valorUniario=" +valorUnitario +", valorTotal="+valorTotal 
				+ ", dataContagem=" + dataContagem + "]";
	}

}
