package br.com.amazonberry.mb.main;

import java.util.ArrayList;

import br.com.amazonberry.utils.HelperUtils;
import br.com.amazonberry.utils.LoaderUtils;
import br.com.amazonberry.vo.EstoqueVO;
import br.com.amazonberry.vo.VendaVO;

public class CompraVendaDiaMB {
	
	public static ArrayList<VendaVO> listaVendas;// = new ArrayList<>();
	public static ArrayList<EstoqueVO> produtosEstoque;// = new ArrayList<>();
	
	public static void main(String[] args) {
	    produtosEstoque = LoaderUtils.loadEstoque();
	    System.out.println("Produtos em estoque");
	    System.out.println("----------------------");
	    for (EstoqueVO estoque : produtosEstoque) {
	    	System.out.println(estoque);
		}
		
	    System.out.println();
	    System.out.println("Lista de Vendas");
	    System.out.println("---------------------");
		listaVendas = LoaderUtils.loadVendas();
		for (VendaVO venda : listaVendas) {
			System.out.println(venda);
		}
		
		System.out.println();
	    System.out.println("Estoque Final");
	    System.out.println("---------------------");
	    ArrayList<EstoqueVO>  estoqueFinal = calculaEstoqueAposVenda(produtosEstoque, listaVendas);
	    for (EstoqueVO estFinal : estoqueFinal) {
			System.out.println(estFinal);
		}
	}

	private static ArrayList<EstoqueVO> calculaEstoqueAposVenda(ArrayList<EstoqueVO> estoqueInicial,ArrayList<VendaVO> vendas) {
		ArrayList<EstoqueVO>  estoqueFinal = new ArrayList<>();
		for (EstoqueVO estoque : estoqueInicial) {
			for (VendaVO venda : vendas) {
				if (venda.getProduto().getId() == estoque.getProduto().getId()) {
					int qtdeInicial = estoque.getQtdeProduto();
					int qtdeVenda = venda.getQtdeProduto();
					int saldoFinal = qtdeInicial - qtdeVenda;
					
					EstoqueVO novoEstoque = new EstoqueVO();
					novoEstoque.setProduto(estoque.getProduto());
					novoEstoque.setDataContagem(HelperUtils.dataDeHoje);
					novoEstoque.setQtdeProduto(saldoFinal);
					estoqueFinal.add(novoEstoque);
				}
				
			}
			
		}
		return estoqueFinal;
	}
}
