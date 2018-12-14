package br.com.amazonberry.prod;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.amazonberry.enums.Ingrediente_Enum;
import br.com.amazonberry.enums.TipoEmbalagem_Enum;
import br.com.amazonberry.vo.IngredienteVO;
import br.com.amazonberry.vo.ReceitaVO;

public class Cupuacu_Prod {

	private static ReceitaVO receitaCremeDeCupuacu;
	private static ArrayList<IngredienteVO> receita;// = new ArrayList<IngredienteVO>();
	private static double custoReceita;

	public Cupuacu_Prod(ReceitaVO receita) {
		super();
	}

	public static ReceitaVO getReceitaCupuacu() {
	    receita = new ArrayList<IngredienteVO>();
		receita.add(getCustoPolpa());//1
		receita.add(getCustoAcucar());//2
		receita.add(getCustoSaborizante());//3
		receita.add(getCustoAgua());//4
		receita.add(getCustoEmbalagem());//5
		receita.add(getCustoFuncionario());//6
		receita.add(getCustoEnergia());//7
		receita.add(getCustoImposto());//8

		receitaCremeDeCupuacu = new ReceitaVO();
		receitaCremeDeCupuacu.setReceita(receita);
		return receitaCremeDeCupuacu;
	}

	private static IngredienteVO getCustoImposto() {
		double custo = 50;
		System.out.print((receita.size()+1) +" custo unitario imposto:\t" + custo + "\n");
		//
		IngredienteVO vo = new IngredienteVO();
		vo.setNome(Ingrediente_Enum.IMPOSTOS.getNome());
		vo.setCustoTotalIngrediente(custo);
		return vo;
	}

	private static IngredienteVO getCustoEnergia() {
		double custo = 4;
		System.out.print((receita.size()+1)  +" custo unitario energia:\t" + custo + "\n");
		//
		IngredienteVO vo = new IngredienteVO();
		vo.setNome(Ingrediente_Enum.ENERGIA.getNome());
		vo.setCustoTotalIngrediente(custo);
		return vo;
	}

	private static IngredienteVO getCustoFuncionario() {
		double custo = 12;
		System.out.print((receita.size()+1)  +" custo unitario funcionario:\t" + custo + "\n");
		//
		IngredienteVO vo = new IngredienteVO();
		vo.setNome(Ingrediente_Enum.FUNCIONARIO.getNome());
		vo.setCustoTotalIngrediente(custo);
		return vo;
	}

	private static IngredienteVO getCustoEmbalagem() {
		System.out.print((receita.size()+1)  +" custo unitario embalagem:\t");
		//
		IngredienteVO vo = new IngredienteVO();
		vo.setNome(Ingrediente_Enum.EMBALAGEM.getNome());
		vo.setCustoUnitario(getCustoUnitario());
		vo.setQuantidade(10);
		vo.setCustoTotalIngrediente(vo.getQuantidade() * vo.getCustoUnitario());
		return vo;
	}

	private static IngredienteVO getCustoAgua() {
		double custo = 1;
		System.out.print((receita.size()+1)  +" custo unitario agua:\t" + custo + "\n");
		//
		IngredienteVO vo = new IngredienteVO();
		vo.setNome(Ingrediente_Enum.AGUA.getNome());
		vo.setCustoTotalIngrediente(custo);
		return vo;
	}

	private static IngredienteVO getCustoSaborizante() {
		System.out.print((receita.size()+1)  +" custo unitario saborizante:\t" );
		//
		IngredienteVO vo = new IngredienteVO();
		vo.setCustoUnitario(getCustoUnitario());
		vo.setTipoEmbalagem(TipoEmbalagem_Enum.BAG_6_5_KG.getTipo());
		vo.setId(1);
		vo.setNome(Ingrediente_Enum.SABORIZANTE.getNome());
		vo.setQuantidade(1);
		vo.setCustoTotalIngrediente(vo.getQuantidade() * vo.getCustoUnitario());
		return vo;
	}

	private static IngredienteVO getCustoAcucar() {
		System.out.print((receita.size()+1)  +" custo unitario acucar:\t" );
		//
		IngredienteVO vo = new IngredienteVO();
		vo.setCustoUnitario(getCustoUnitario());
		vo.setTipoEmbalagem(TipoEmbalagem_Enum.ACUCAR_KILO_DEFAULT.getTipo());
		vo.setId(1);
		vo.setNome(Ingrediente_Enum.ACUCAR.getNome());
		vo.setQuantidade(18);
		vo.setCustoTotalIngrediente(vo.getQuantidade() * vo.getCustoUnitario());
		return vo;
	}

	// polpa de cupuacu
	private static IngredienteVO getCustoPolpa() {
		System.out.print((receita.size()+1)  +" custo unitario polpa:\t" );
		//
		IngredienteVO vo = new IngredienteVO();
		vo.setCustoUnitario(getCustoUnitario());
		vo.setTipoEmbalagem(TipoEmbalagem_Enum.EMB_10_LT.getTipo());
		vo.setId(2);
		vo.setNome(Ingrediente_Enum.POLPA_CUPUACU.getNome());
		vo.setQuantidade(3);
		vo.setCustoTotalIngrediente(vo.getQuantidade() * vo.getCustoUnitario());
		return vo;
	}

	private static double getCustoUnitario() {
		Scanner in = new Scanner(System.in);
		double custoUnitario = in.nextDouble();
		return custoUnitario;
	}
	
	public static String getCustoConvert() {
		String custoStr = String.valueOf(getCustoReceita_cremeCupuacu());
		custoStr = custoStr.replace(".", ":");
		String[] arr = new String[2];
		arr = custoStr.split(":");
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append(".").append(arr[1].substring(0, 2));
		System.out.println("custo total da producao: " + sb.toString());
		return sb.toString();
	}

	private static double getCustoReceita_cremeCupuacu() {
		System.out.println("producao de creme de cupuacu:");
		System.out.println("----------------------------");

		receitaCremeDeCupuacu = getReceitaCupuacu();
		for (IngredienteVO ingredienteVO : receitaCremeDeCupuacu.getReceita())
			custoReceita += ingredienteVO.getCustoTotalIngrediente();
		
		return custoReceita;
	}
	
//	public static void main(String[] args) {
//		String custoStr = String.valueOf(568.00000005);
//		custoStr = custoStr.replace(".", ":");
//		System.out.println(custoStr);
//		String[] arr = new String[2];
//		arr = custoStr.split(":");
//		System.out.println(arr[0]);
//		StringBuilder sb = new StringBuilder();
//		sb.append(arr[0]).append(".").append(arr[1].substring(0, 2));
//		System.out.println(sb.toString());
//	}

}
