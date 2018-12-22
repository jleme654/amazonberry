package br.com.maxscalla.mb;

import java.util.ArrayList;

import br.com.amazonberry.utils.LoaderUtils;
import br.com.amazonberry.vo.ProdutoVO;
import br.com.maxscalla.vo.ProdutoMaxScallaVO;

/**
 * @author julio.leme@amazonberryacai.com.br
 * @since {date}
 * @version 1.0
 *
 */
public class ProdutoMaxScallaMB {
	
	static ArrayList<ProdutoMaxScallaVO>  produtosMax = new ArrayList<>();

	public static void main(String[] args) {
		produtosMax = geraProdutosMaxScalla();
		for (ProdutoMaxScallaVO max : produtosMax) {
			System.out.println(max);
		}
		System.out.println("total de produtos: "+produtosMax.size());
	}

	/**
	 * 
	 */
	private static ArrayList<ProdutoMaxScallaVO> geraProdutosMaxScalla() {
		ArrayList<ProdutoVO> produtosAmazon = LoaderUtils.getAllProducts();
		for (ProdutoVO item : produtosAmazon) {
			ProdutoMaxScallaVO vomax = new ProdutoMaxScallaVO();
			vomax.setCodigoBarras("");
			vomax.setCodigoFabricante("");
			vomax.setCSOSN("");
			vomax.setCST("");
			vomax.setDescricaoProduto(item.getTipoProduto().getTipo() + " " +item.getTipoEmbalagem().getTipo());
			vomax.setEmbalagem(item.getTipoEmbalagem().getTipo());
			vomax.setFabricante("Amazon Berry Ltda");
			String tipoGrupo = item.getTipoProduto().getTipo();
			if(tipoGrupo.equals("Acai")) {
				vomax.setGrupo(item.getTipoProduto().getTipo().toUpperCase());
			}else {
				vomax.setGrupo("Creme".toUpperCase());
			}
			vomax.setICMS("");
			vomax.setMVA("");
			vomax.setNCM("");
			vomax.setPrecoCusto("");
			vomax.setPrecoVenda("");
			produtosMax.add(vomax);
		}
		return produtosMax;
	}
}
