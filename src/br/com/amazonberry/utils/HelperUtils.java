package br.com.amazonberry.utils;

import java.sql.Timestamp;

public class HelperUtils {

	public static Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());
	public static String lineSeparator = "---------------------------";

	public static double getValorProduto(int qtde, double valor) {
		return (qtde * valor);
	}

	/**
	 * @param cnpjCpf
	 * @return
	 */
	public static boolean isCPF(String cnpjCpf) {
		if (cnpjCpf.toString().length() == 15 || cnpjCpf.equals("")) { 
			return true;
		}
		return false;
	}

}
