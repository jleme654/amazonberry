package br.com.amazonberry.mb.main;

import java.util.Scanner;

import br.com.amazonberry.enums.Receita_Enum;
import br.com.amazonberry.mb.producao.CupuacuProducaoMB;

public class ProducaoMainMB {
	
	static void executa() {		
		for (Receita_Enum item : Receita_Enum.values()) {
			System.out.println(item.getId() + " - " + item.getNome());
		}
		Scanner in = new Scanner(System.in);
		int idReceita = in.nextInt();
		switch (idReceita) {
		case 1:
			CupuacuProducaoMB.getCustoConvert();
			break;
			
		default:
			break;
		}
	}

	public static void main(String[] args) {
		executa();
	}
}
