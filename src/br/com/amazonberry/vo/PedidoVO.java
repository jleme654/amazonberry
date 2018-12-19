package br.com.amazonberry.vo;

import java.util.ArrayList;

public class PedidoVO {
	
    private Integer id;
	private ClienteVO cliente;
	private ArrayList<VendaVO> venda;
	private double valorTotalPedido;
	
	/** 
	 * encapsulamento
	 * @return
	 */
	
	public ClienteVO getCliente() {
		return cliente;
	}

	public double getValorTotalPedido() {
		return valorTotalPedido;
	}

	public void setValorTotalPedido(double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}

	public ArrayList<VendaVO> getVenda() {
		return venda;
	}

	public void setVenda(ArrayList<VendaVO> venda) {
		this.venda = venda;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pedido= ").append(id).append("\n");
		for (VendaVO vendaVO : venda) {
			sb.append(vendaVO).append("\n");
			valorTotalPedido += vendaVO.getValorTotal();
		}
		sb.append("Valor Total Pedido= "+valorTotalPedido);
		return sb.toString();
	}

}
