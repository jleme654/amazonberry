package br.com.amazonberry.utils;

import java.util.ArrayList;

import br.com.amazonberry.enums.TipoEmbalagem_Enum;
import br.com.amazonberry.enums.TipoProduto_Enum;
import br.com.amazonberry.vo.EstoqueVO;
import br.com.amazonberry.vo.ProdutoVO;
import br.com.amazonberry.vo.VendaVO;

public class LoaderUtils {
	
	public static ProdutoVO getProduto1() {
		ProdutoVO produto = new ProdutoVO();
		produto.setId(1);
		produto.setTipoEmbalagem(TipoEmbalagem_Enum.BALDE_10LT);
		produto.setTipoProduto(TipoProduto_Enum.ACAI);
		return produto;
	}
	
	public static ProdutoVO getProduto2() {
		ProdutoVO produto = new ProdutoVO();
		produto.setId(2);
		produto.setTipoEmbalagem(TipoEmbalagem_Enum.BALDE_5LT);
		produto.setTipoProduto(TipoProduto_Enum.CREME_ABACAXI_AO_VINHO);
		return produto;
	}
	
	public static ProdutoVO getProduto3() {
		ProdutoVO produto = new ProdutoVO();
		produto.setId(30);
		produto.setTipoEmbalagem(TipoEmbalagem_Enum.POTE_1LT);
		produto.setTipoProduto(TipoProduto_Enum.ACAI);
		return produto;
	}

	public static ArrayList<EstoqueVO> loadEstoque(){
		ArrayList<EstoqueVO> listaestoque = new ArrayList<>();
		
		EstoqueVO estoque = new EstoqueVO();
		estoque.setDataContagem(HelperUtils.dataDeHoje);
		estoque.setProduto(getProduto1());
		estoque.setQtdeProduto(50);
		
		EstoqueVO estoque2 = new EstoqueVO();
		estoque2.setDataContagem(HelperUtils.dataDeHoje);
		estoque2.setProduto(getProduto2());
		estoque2.setQtdeProduto(70);
		
		EstoqueVO estoque3 = new EstoqueVO();
		estoque3.setDataContagem(HelperUtils.dataDeHoje);
		estoque3.setProduto(getProduto3());
		estoque3.setQtdeProduto(90);
		
		listaestoque.add(estoque);
		listaestoque.add(estoque2);
		listaestoque.add(estoque3);
		return listaestoque;
	}
	
	public static ArrayList<ProdutoVO> loadProdutos() {
		ArrayList<ProdutoVO> listaProdutos = new ArrayList<>();
		ProdutoVO vo = new ProdutoVO();
		vo.setId(1);
		vo.setTipoProduto(TipoProduto_Enum.ACAI);
		vo.setTipoEmbalagem(TipoEmbalagem_Enum.CAIXA_10LT);
	
		ProdutoVO vo2 = new ProdutoVO();
		vo2.setId(2);
		vo2.setTipoProduto(TipoProduto_Enum.ACAI);
		vo2.setTipoEmbalagem(TipoEmbalagem_Enum.CAIXA_5LT);

		ProdutoVO vo3 = new ProdutoVO();
		vo3.setId(3);
		vo3.setTipoProduto(TipoProduto_Enum.CREME_ABACAXI_AO_VINHO);
		vo3.setTipoEmbalagem(TipoEmbalagem_Enum.CAIXA_5LT);

		listaProdutos.add(vo);
		listaProdutos.add(vo2);
		listaProdutos.add(vo3);

		return listaProdutos;
	}
	
	public static ArrayList<VendaVO> loadVendas() {
		ArrayList<VendaVO> vendas = new ArrayList<>();
		
		VendaVO venda = new VendaVO();
		venda.setDataContagem(HelperUtils.dataDeHoje);
		venda.setProduto(getProduto1());
		venda.setQtdeProduto(2);
		venda.setValorProduto(getValorProduto(2,60));
		
		VendaVO venda2 = new VendaVO();
		venda2.setDataContagem(HelperUtils.dataDeHoje);
		venda2.setProduto(getProduto2());
		venda2.setQtdeProduto(8);
		venda2.setValorProduto(getValorProduto(8,90));
		
		VendaVO venda3 = new VendaVO();
		venda3.setDataContagem(HelperUtils.dataDeHoje);
		venda3.setProduto(getProduto3());
		venda3.setQtdeProduto(10);
		venda3.setValorProduto(getValorProduto(10,15));
			
		vendas.add(venda);
		vendas.add(venda2);
		vendas.add(venda3);
		return vendas;
	}

	private static double getValorProduto(int qtde, double valor) {
		return (qtde*valor);
	}

}
