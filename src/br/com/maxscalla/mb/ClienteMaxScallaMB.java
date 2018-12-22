/**
 * 
 */
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

import br.com.amazonberry.utils.HelperUtils;
import br.com.amazonberry.utils.LoaderUtils;
import br.com.amazonberry.vo.ClienteVO;
import br.com.maxscalla.vo.ClienteMaxScallaVO;

/**
 * @author julio.leme@amazonberryacai.com.br
 * @since {date}
 * @version 1.0
 *
 */
public class ClienteMaxScallaMB {
	
	static ArrayList<ClienteVO> clientes = LoaderUtils.getAllClients();
	static ArrayList<ClienteMaxScallaVO> clientesMax = new ArrayList<>();
	static final String fileName = "/home/julio/arquivos/lista_clientes_max.xls";
	
	static ArrayList<ClienteMaxScallaVO> geraListaClientesMax (ArrayList<ClienteVO> c){
		for (ClienteVO item : c) {
			boolean isCPF = HelperUtils.isCPF(item.getCnpjCpf());
			ClienteMaxScallaVO vomax = new ClienteMaxScallaVO();
			vomax.setBairro("");
			vomax.setCEP("");
			vomax.setCidade(item.getCidade());
			vomax.setComplementoEndereço("");
			if (isCPF) { 
				vomax.setCPF(item.getCnpjCpf().replace("a", ""));
				vomax.setCNPJ("");
				vomax.setPessoaFisicaJuridica("F");
				vomax.setRazaoSocial("");
			}else {
				vomax.setCPF("");
				vomax.setCNPJ(item.getCnpjCpf().replace("a", ""));
				vomax.setPessoaFisicaJuridica("J");
				vomax.setRazaoSocial("");
			}
			vomax.setEndereco(item.getEndereco());
			vomax.setEstado("SP");
			vomax.setFantasia(item.getNome());
			vomax.setInscricaoSocial("");
			vomax.setNumero("");
			vomax.setRG("");
			if (!item.getTelefone().equals("")) {				
				vomax.setTelefoneCelular(item.getTelefone().replace(".", "").substring(0, (item.getTelefone().length()-3)));
			}else {
				vomax.setTelefoneCelular("");
			}
			vomax.setTelefoneFixo("");
			clientesMax.add(vomax);
		}
		
		return clientesMax;
	}
	
	static void geraExcelClientes(ArrayList<ClienteMaxScallaVO> c) {
		  HSSFWorkbook workbook = new HSSFWorkbook();
          HSSFSheet sheetClientes = workbook.createSheet("Clientes Max Scalla");
            
          int rownum = 0;
          for (ClienteMaxScallaVO item : c) {
              Row row = sheetClientes.createRow(rownum++);
              int cellnum = 0;
              Cell cell1 = row.createCell(cellnum++);
              cell1.setCellValue(item.getFantasia());
              
              Cell cellRa = row.createCell(cellnum++);
              cellRa.setCellValue(item.getRazaoSocial());
              
              Cell cellNota1 = row.createCell(cellnum++);
              cellNota1.setCellValue(item.getPessoaFisicaJuridica());
              
              Cell cellNota2 = row.createCell(cellnum++);
              cellNota2.setCellValue(item.getCNPJ());
              
              Cell cellMedia = row.createCell(cellnum++);
              cellMedia.setCellValue(item.getInscricaoSocial());
              
              Cell cellAprovado =row.createCell(cellnum++);
              cellAprovado.setCellValue(item.getCPF());
              
              Cell cellAprovado2 =row.createCell(cellnum++);
              cellAprovado2.setCellValue(item.getRG());
              
              Cell cellAprovado3 =row.createCell(cellnum++);
              cellAprovado3.setCellValue(item.getTelefoneFixo());
              
              Cell cellAprovado4 =row.createCell(cellnum++);
              cellAprovado4.setCellValue(item.getTelefoneCelular());
              
              Cell cellAprovado5 =row.createCell(cellnum++);
              cellAprovado5.setCellValue(item.getEndereco());
              
              Cell cellAprovado6 =row.createCell(cellnum++);
              cellAprovado6.setCellValue(item.getNumero());
              
              Cell cellAprovado7 =row.createCell(cellnum++);
              cellAprovado7.setCellValue(item.getBairro());
              
              Cell cellAprovado8 =row.createCell(cellnum++);
              cellAprovado8.setCellValue(item.getCidade());
              
              Cell cellAprovado9 =row.createCell(cellnum++);
              cellAprovado9.setCellValue(item.getEstado());
              
              Cell cellAprovado10 =row.createCell(cellnum++);
              cellAprovado10.setCellValue(item.getCEP());
              
              Cell cellAprovado11 =row.createCell(cellnum++);
              cellAprovado11.setCellValue(item.getComplementoEndereço());
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
	
	public static void main(String[] args) {
		clientesMax = geraListaClientesMax(clientes);
		for (ClienteMaxScallaVO max : clientesMax) {
			System.out.println(max);
		}
		geraExcelClientes(clientesMax);
	}

}
