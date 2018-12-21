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
	private static final String fileName = "/home/julio/arquivos/lista_clientes_max.xls";
	
	static ArrayList<ClienteMaxScallaVO> geraListaClientesMax (ArrayList<ClienteVO> c){
		for (ClienteVO item : c) {
			boolean isCPF = HelperUtils.isCPF(item.getCnpjCpf());
			ClienteMaxScallaVO vomax = new ClienteMaxScallaVO();
			vomax.setBairro("");
			vomax.setCEP("");
			vomax.setCidade(item.getCidade());
			if(!isCPF)
				vomax.setCNPJ(item.getCnpjCpf());
			vomax.setComplementoEndereço("");
			if (isCPF) 
				vomax.setCPF(item.getCnpjCpf());
			vomax.setEndereco(item.getEndereco());
			vomax.setEstado("SP");
			vomax.setFantasia(item.getNome());
			vomax.setInscricaoSocial("");
			vomax.setNumero("");
			if(!isCPF)
				vomax.setPessoaFisicaJuridica(item.getNome());
			else
				vomax.setPessoaFisicaJuridica("");
			vomax.setRazaoSocial(item.getNome());
			vomax.setRG("");
			vomax.setTelefoneCelular(item.getTelefone());
			vomax.setTelefoneFixo("");
			clientesMax.add(vomax);
		}
		
		return clientesMax;
	}
	
	static void geraExcelClientes(ArrayList<ClienteMaxScallaVO> c) {
		  HSSFWorkbook workbook = new HSSFWorkbook();
          HSSFSheet sheetAlunos = workbook.createSheet("Clientes Max Scalla");
            
//          List<Aluno> listaAlunos = new ArrayList<Aluno>();
//          listaAlunos.add(new Aluno("Eduardo", "9876525", 7, 8, 0, false));
//          listaAlunos.add(new Aluno("Luiz", "1234466", 5, 8, 0, false));
//          listaAlunos.add(new Aluno("Bruna", "6545657", 7, 6, 0, false));
//          listaAlunos.add(new Aluno("Carlos", "3456558", 10, 3, 0, false));
//          listaAlunos.add(new Aluno("Sonia", "6544546", 7, 8, 0, false));
//          listaAlunos.add(new Aluno("Brianda", "3234535", 6, 5, 0, false));
//          listaAlunos.add(new Aluno("Pedro", "4234524", 7, 5, 0, false));
//          listaAlunos.add(new Aluno("Julio", "5434513", 7, 2, 0, false));
//          listaAlunos.add(new Aluno("Henrique", "6543452", 7, 8, 0, false));
//          listaAlunos.add(new Aluno("Fernando", "4345651", 5, 8, 0, false)); 
//          listaAlunos.add(new Aluno("Vitor", "4332341", 7, 9, 0, false));                  
            
//          int rownum = 0;
//          for (Aluno aluno : listaAlunos) {
//              Row row = sheetAlunos.createRow(rownum++);
//              int cellnum = 0;
//              Cell cellNome = row.createCell(cellnum++);
//              cellNome.setCellValue(aluno.getNome());
//              Cell cellRa = row.createCell(cellnum++);
//              cellRa.setCellValue(aluno.getRa());
//              Cell cellNota1 = row.createCell(cellnum++);
//              cellNota1.setCellValue(aluno.getNota1());
//              Cell cellNota2 = row.createCell(cellnum++);
//              cellNota2.setCellValue(aluno.getNota2());
//              Cell cellMedia = row.createCell(cellnum++);
//              cellMedia.setCellValue((aluno.getNota1() + aluno.getNota2()) / 2);
//              Cell cellAprovado =row.createCell(cellnum++);
//              cellAprovado.setCellValue(cellMedia.getNumericCellValue() >= 6);
//          }
            
          try {
              FileOutputStream out = new FileOutputStream(new File(ClienteMaxScallaMB.fileName));
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
