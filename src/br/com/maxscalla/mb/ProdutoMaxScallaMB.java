package br.com.maxscalla.mb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

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
	static final String fileName = "/home/julio/arquivos/lista_produtos_max.xls";
	

	public static void main(String[] args) {
		produtosMax = geraProdutosMaxScalla();
		for (ProdutoMaxScallaVO max : produtosMax) {
			System.out.println(max);
		}
		System.out.println("total de produtos: "+produtosMax.size());
		geraExcelProdutos(produtosMax);
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
	
	static void geraExcelProdutos(ArrayList<ProdutoMaxScallaVO> c) {
		HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheetClientes = workbook.createSheet("Produtos Max Scalla");
          
        int rownum = 0;
        for (ProdutoMaxScallaVO item : c) {
            Row row = sheetClientes.createRow(rownum++);
            int cellnum = 0;
            Cell cell1 = row.createCell(cellnum++);
            cell1.setCellValue(item.getDescricaoProduto());
            
            Cell cellRa = row.createCell(cellnum++);
            cellRa.setCellValue(item.getEmbalagem());
            
            Cell cellNota1 = row.createCell(cellnum++);
            cellNota1.setCellValue(item.getGrupo());
            
            Cell cellNota2 = row.createCell(cellnum++);
            cellNota2.setCellValue(item.getFabricante());
            
            Cell cellMedia = row.createCell(cellnum++);
            cellMedia.setCellValue(item.getCodigoFabricante());
            
            Cell cellAprovado =row.createCell(cellnum++);
            cellAprovado.setCellValue(item.getPrecoCusto());
            
            Cell cellAprovado2 =row.createCell(cellnum++);
            cellAprovado2.setCellValue(item.getPrecoVenda());
            
            Cell cellAprovado3 =row.createCell(cellnum++);
            cellAprovado3.setCellValue(item.getICMS());
            
            Cell cellAprovado4 =row.createCell(cellnum++);
            cellAprovado4.setCellValue(item.getMVA());
            
            Cell cellAprovado5 =row.createCell(cellnum++);
            cellAprovado5.setCellValue(item.getCST());
            
            Cell cellAprovado6 =row.createCell(cellnum++);
            cellAprovado6.setCellValue(item.getCSOSN());
            
            Cell cellAprovado7 =row.createCell(cellnum++);
            cellAprovado7.setCellValue(item.getNCM());
            
            Cell cellAprovado8 =row.createCell(cellnum++);
            cellAprovado8.setCellValue(item.getCodigoBarras());
        }
          
        try {
            FileOutputStream out = new FileOutputStream(new File(fileName));
            workbook.write(out);
            out.close();
            System.out.println("Arquivo Excel criado com sucesso!");
              
        } catch (FileNotFoundException e) {
            e.printStackTrace();
               System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            e.printStackTrace();
               System.out.println("Erro na edição do arquivo!");
        }
	}
}
