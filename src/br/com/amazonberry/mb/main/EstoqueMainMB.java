package br.com.amazonberry.mb.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.amazonberry.utils.HelperUtils;
import br.com.amazonberry.utils.LoaderUtils;
import br.com.amazonberry.vo.EstoqueVO;
import br.com.amazonberry.vo.ProdutoVO;

public class EstoqueMainMB {

	static ArrayList<ProdutoVO> listaProdutos;// = new ArrayList<ProdutoVO>();
	static ArrayList<EstoqueVO> listaEstoque = new ArrayList<EstoqueVO>();
	//static Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());

	static void executa() {
		listaProdutos = LoaderUtils.loadProdutos();

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
			estoque.setDataContagem(HelperUtils.dataDeHoje);
			
			listaEstoque.add(estoque);
		}
		return listaEstoque;
	}

	private static void printEstoque(ArrayList<EstoqueVO> listaEstoque2) {
		for (EstoqueVO estoqueVO : listaEstoque2) {
			System.out.println(estoqueVO.toString());
		}
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
