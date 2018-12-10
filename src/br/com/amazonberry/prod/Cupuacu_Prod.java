package br.com.amazonberry.prod;

import java.util.ArrayList;

import br.com.amazonberry.enums.Ingrediente_Enum;
import br.com.amazonberry.enums.TipoEmbalagem_Enum;
import br.com.amazonberry.vo.IngredienteVO;
import br.com.amazonberry.vo.Receita_VO;

public class Cupuacu_Prod {
	
	private static Receita_VO receitaCremeDeCupuacu;
	private static double custoReceita;
	
	public Cupuacu_Prod(Receita_VO receita) {
		super();
		receitaCremeDeCupuacu = new Receita_VO();
	}
	
	public static Receita_VO getReceitaCupuacu() {
		ArrayList<IngredienteVO> receita = new ArrayList<IngredienteVO>();
		receita.add(getPolpa());
		receita.add(getAcucar());
		
		receitaCremeDeCupuacu.setReceita(receita );
		return receitaCremeDeCupuacu;
	}

	private static IngredienteVO getAcucar() {
		IngredienteVO vo = new IngredienteVO();
		vo.setCustoUnitario(1.9);
		vo.setTipoEmbalagem(TipoEmbalagem_Enum.SACO_BAG_10_KG.getTipo());
		vo.setId(1);
		vo.setNome(Ingrediente_Enum.CREME_CUPUACU.getNome());
		vo.setQuantidade(3);
		vo.setCustoTotalIngrediente(vo.getQuantidade()*vo.getCustoUnitario());
		return vo;
	}

	private static IngredienteVO getPolpa() {
		IngredienteVO vo = new IngredienteVO();
		vo.setCustoUnitario(130);
		vo.setTipoEmbalagem(TipoEmbalagem_Enum.SACO_BAG_10_KG.getTipo());
		vo.setId(1);
		vo.setNome(Ingrediente_Enum.CREME_CUPUACU.getNome());
		vo.setQuantidade(3);
		vo.setCustoTotalIngrediente(vo.getQuantidade()*vo.getCustoUnitario());
		return vo;
	}

	public static double getCustoReceita_cremeCupuacu() {
		ArrayList<IngredienteVO> receita = receitaCremeDeCupuacu.getReceita();
		for (IngredienteVO ingredienteVO : receita) {
			custoReceita += ingredienteVO.getCustoTotalIngrediente();
		}
		return custoReceita;
	}



	
}
