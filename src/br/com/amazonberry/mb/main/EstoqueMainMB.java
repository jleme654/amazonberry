package br.com.amazonberry.mb.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.amazonberry.enums.TipoEmbalagem_Enum;
import br.com.amazonberry.enums.TipoProduto_Enum;
import br.com.amazonberry.mb.producao.CupuacuProducaoMB;
import br.com.amazonberry.vo.EstoqueVO;
import br.com.amazonberry.vo.ProdutoVO;

public class EstoqueMainMB {

	static ArrayList<ProdutoVO> listaProdutos = new ArrayList<ProdutoVO>();
	static ArrayList<EstoqueVO> listaEstoque = new ArrayList<EstoqueVO>();
	
	static void executa() {		
		loadProdutos();
		
		System.out.println("Digite o id do produto a ser contabilizado:");
		Scanner in = new Scanner(System.in);
		
		int idProduto = in.nextInt();
		switch (idProduto) {
		case 25:
			EstoqueVO estoque = new EstoqueVO();
			for (ProdutoVO produtoVO : listaProdutos) {
				if(produtoVO.getTipoProduto().getId() == idProduto) {
                    System.out.println("Digite a quantidade do produto: ");
					Scanner in2 = new Scanner(System.in);
					int qtdeProduto = in2.nextInt();
					estoque.setProduto(produtoVO);
					estoque.setQtdeProduto(qtdeProduto);
					listaEstoque.add(estoque);
					break;
				}
			}
			break;
			
		default:
			break;
		}
		// imprime estoque
		printEstoque(listaEstoque);
	}

	private static void printEstoque(ArrayList<EstoqueVO> listaEstoque2) {
		for (EstoqueVO estoqueVO : listaEstoque2) {
			System.out.println(estoqueVO.toString());
		}
	}

	private static void loadProdutos() {
		
		ProdutoVO vo = new ProdutoVO();
		vo.setTipoProduto(TipoProduto_Enum.ACAI);
		vo.setTipoEmbalagem(TipoEmbalagem_Enum.CAIXA_10LT);
		
		listaProdutos.add(vo);
		print(listaProdutos);
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
