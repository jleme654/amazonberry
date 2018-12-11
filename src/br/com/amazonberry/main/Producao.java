package br.com.amazonberry.main;

import java.util.Scanner;

import br.com.amazonberry.enums.Receita_Enum;
import br.com.amazonberry.prod.Cupuacu_Prod;

public class Producao {

	public static void main(String[] args) {

		for (Receita_Enum item : Receita_Enum.values()) {
			System.out.println(item.getId() + " - " + item.getNome());
		}
		Scanner in = new Scanner(System.in);
		int idReceita = in.nextInt();
		switch (idReceita) {
		case 1:
			Cupuacu_Prod.getCustoConvert();
			break;

		default:
			break;
		}
		{

		}

	}

}
