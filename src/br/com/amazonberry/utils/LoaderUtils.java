package br.com.amazonberry.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import br.com.amazonberry.enums.TipoEmbalagem_Enum;
import br.com.amazonberry.enums.TipoProduto_Enum;
import br.com.amazonberry.vo.ClienteVO;
import br.com.amazonberry.vo.EstoqueVO;
import br.com.amazonberry.vo.ProdutoVO;
import br.com.amazonberry.vo.VendaVO;

public class LoaderUtils {

	private static final String arquivoclientes = "/home/julio/arquivos/clientes_version.xls";// Lista-pop-rua-2018.xls";

	public static void main(String[] args) {
		ArrayList<ProdutoVO> lista = getAllProducts();
		for (ProdutoVO produtoVO : lista) {
			System.out.println(produtoVO);
		}
	}

	public static ArrayList<ClienteVO> getAllClients() {
		ArrayList<ClienteVO> listaClientes = new ArrayList<>();	
		try {
			FileInputStream arquivo = new FileInputStream(new File(LoaderUtils.arquivoclientes));
			HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
			HSSFSheet sheetAlunos = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheetAlunos.iterator();

			int id =0;
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				ClienteVO aluno = new ClienteVO();

				int count = 0;
				while (cellIterator.hasNext()) {
					count++;
			    //******		System.out.print(count+"\t");
					aluno.setId(count);
					Cell cell = cellIterator.next();
					
				//*****	System.out.println(cell + "\t");
				
					int index = count;//cell.getColumnIndex();
					if (index == 1) {
						aluno.setNome(cell.getStringCellValue());
					}else if (index == 2) {
						aluno.setCnpjCpf(cell.getStringCellValue());
					}else if(index == 3) {
						aluno.setEndereco(cell.getStringCellValue() == null ? "" : cell.getStringCellValue());
					}else if(index == 4) {
						aluno.setCidade(cell.getStringCellValue() == null ? "" : cell.getStringCellValue());
					}else if(index == 5) {
						aluno.setTelefone(String.valueOf(cell.getNumericCellValue() == 0 ? "" : cell.getNumericCellValue()));
					}else if(index ==6) {
						aluno.setContato(cell.getStringCellValue()== null ? "" : cell.getStringCellValue());
					}else if(index == 7) {
						aluno.setEmail(cell.getStringCellValue() == null ? "" : cell.getStringCellValue());
					}else if(index ==8) {
						aluno.setVendedor(cell.getStringCellValue() == null ? "" : cell.getStringCellValue());
					}
				}
				id++;
				aluno.setId(id);
				listaClientes.add(aluno);
				if (id == 343) {
					break;
				}
				System.out.println();
			}
			arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Arquivo Excel não encontrado!");
		}
		return listaClientes;
	}

	public static ArrayList<ProdutoVO> getAllProducts() {
		ArrayList<ProdutoVO> allProducts = new ArrayList<>();
		// Acai
		int count = 0;
		for (TipoEmbalagem_Enum tipoEmb : TipoEmbalagem_Enum.values()) {
			count++;
			// ProdutoVO(Integer id, TipoEmbalagem_Enum tipoEmbalagem, TipoProduto_Enum
			// tipoProduto) {
			ProdutoVO p = new ProdutoVO(count, TipoProduto_Enum.ACAI, tipoEmb);
			allProducts.add(p);
		}

		// Cremes
		for (TipoProduto_Enum tipoProd : TipoProduto_Enum.values()) {
			if (!tipoProd.equals(TipoProduto_Enum.ACAI)) {
				count++;
				ProdutoVO p = new ProdutoVO(count, tipoProd, TipoEmbalagem_Enum.POTE_2LT);
				allProducts.add(p);

				count++;
				ProdutoVO p2 = new ProdutoVO(count, tipoProd, TipoEmbalagem_Enum.CAIXA_5LT);
				allProducts.add(p2);

				count++;
				ProdutoVO p3 = new ProdutoVO(count, tipoProd, TipoEmbalagem_Enum.CAIXA_10LT);
				allProducts.add(p3);
			}
		}
		return allProducts;
	}

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

	public static ArrayList<EstoqueVO> loadEstoque() {
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
		int qtdeProduto = 51;
		double valorUnitarioProduto = 60;
		venda.setQtdeProduto(qtdeProduto);
		venda.setValorProduto(getValorProduto(qtdeProduto, valorUnitarioProduto));

		VendaVO venda2 = new VendaVO();
		venda2.setDataContagem(HelperUtils.dataDeHoje);
		venda2.setProduto(getProduto2());
		venda2.setQtdeProduto(8);
		venda2.setValorProduto(getValorProduto(8, 90));

		VendaVO venda3 = new VendaVO();
		venda3.setDataContagem(HelperUtils.dataDeHoje);
		venda3.setProduto(getProduto3());
		venda3.setQtdeProduto(10);
		venda3.setValorProduto(getValorProduto(10, 15));

		vendas.add(venda);
		vendas.add(venda2);
		vendas.add(venda3);
		return vendas;
	}

	private static double getValorProduto(int qtde, double valor) {
		return (qtde * valor);
	}

}
