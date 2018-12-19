package br.com.amazonberry.utils;

import java.sql.Timestamp;

public class HelperUtils {

	public static Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());

	public static double getValorProduto(int qtde, double valor) {
		return (qtde * valor);
	}

}
