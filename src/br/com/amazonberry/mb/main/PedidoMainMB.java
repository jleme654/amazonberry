package br.com.amazonberry.mb.main;

import java.util.ArrayList;

import br.com.amazonberry.utils.LoaderUtils;
import br.com.amazonberry.vo.ClienteVO;
import br.com.amazonberry.vo.PedidoVO;
import br.com.amazonberry.vo.VendaVO;

public class PedidoMainMB {
	
	
	public static void main(String[] args) {
		System.out.println(geraPedido());
	}

	private static PedidoVO geraPedido() {
		PedidoVO pedido = new PedidoVO();
		pedido.setId(101);
		ClienteVO cliente = new ClienteVO();
		cliente = LoaderUtils.getAllClients().get(0);
		
		ArrayList<VendaVO> vendas = new ArrayList<>();
		VendaVO venda = new VendaVO();
		venda = LoaderUtils.getVendas().get(0);
		vendas.add(venda);
		
		VendaVO venda2 = new VendaVO();
		venda2 = LoaderUtils.getVendas().get(1);
		vendas.add(venda2);
		
		VendaVO venda3 = new VendaVO();
		venda3 = LoaderUtils.getVendas().get(2);
		vendas.add(venda3);
		
		pedido.setCliente(cliente);
		pedido.setVenda(vendas);
		return pedido; 		
	}

}
