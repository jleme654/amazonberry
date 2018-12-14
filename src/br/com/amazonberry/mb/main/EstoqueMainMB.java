package br.com.amazonberry.mb.main;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.amazonberry.enums.TipoEmbalagem_Enum;
import br.com.amazonberry.enums.TipoProduto_Enum;
import br.com.amazonberry.vo.EstoqueVO;
import br.com.amazonberry.vo.ProdutoVO;

public class EstoqueMainMB {

	static ArrayList<ProdutoVO> listaProdutos = new ArrayList<ProdutoVO>();
	static ArrayList<EstoqueVO> listaEstoque = new ArrayList<EstoqueVO>();
	static Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());

	static void executa() {
		listaProdutos = loadProdutos();

		// imprime lista de produtos cadastrados
		System.out.println("----------------------------------------------");
		loadEstoque();
		
		// imprime estoque
		System.out.println("----------------------------------------------");
		printEstoque(listaEstoque);
	}

	private static ArrayList<EstoqueVO> loadEstoque() {
		for (ProdutoVO vo : listaProdutos) {
			System.out.println("Digite a quantidade do produto  { " + vo + " } : ");
			Scanner in2 = new Scanner(System.in);
			int qtdeProduto = in2.nextInt();

			EstoqueVO estoque = new EstoqueVO();
			estoque.setProduto(vo);
			estoque.setQtdeProduto(qtdeProduto);
			estoque.setDataContagem(dataDeHoje);
			
			listaEstoque.add(estoque);
		}
		return listaEstoque;
	}

	private static void printEstoque(ArrayList<EstoqueVO> listaEstoque2) {
		for (EstoqueVO estoqueVO : listaEstoque2) {
			System.out.println(estoqueVO.toString());
		}
	}

	private static ArrayList<ProdutoVO> loadProdutos() {
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

		print(listaProdutos);
		return listaProdutos;
	}

	private static void print(ArrayList<ProdutoVO> listaProdutos) {
		for (ProdutoVO vo : listaProdutos) {
			System.out.println(vo);
		}

	}

	public static void main(String[] args) {
		executa();
	}
}
