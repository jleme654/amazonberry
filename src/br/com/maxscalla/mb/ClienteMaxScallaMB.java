/**
 * 
 */
package br.com.maxscalla.mb;

import java.util.ArrayList;

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
	
	public static void main(String[] args) {
		clientesMax = geraListaClientesMax(clientes);
		for (ClienteMaxScallaVO max : clientesMax) {
			System.out.println(max);
		}
	}

}
