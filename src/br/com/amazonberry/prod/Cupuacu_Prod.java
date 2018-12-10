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
	}
	
	public static Receita_VO getReceitaCupuacu() {
		ArrayList<IngredienteVO> receita = new ArrayList<IngredienteVO>();
		receita.add(getPolpa());
		receita.add(getAcucar());
		receita.add(getSaborizante());
		
		receitaCremeDeCupuacu = new Receita_VO();
		receitaCremeDeCupuacu.setReceita(receita );
		return receitaCremeDeCupuacu;
	}

	private static IngredienteVO getSaborizante() {
		IngredienteVO vo = new IngredienteVO();
		vo.setCustoUnitario(89);
		vo.setTipoEmbalagem(TipoEmbalagem_Enum.BAG_6_5_KG.getTipo());
		vo.setId(1);
		vo.setNome(Ingrediente_Enum.SABORIZANTE.getNome());
		vo.setQuantidade(1);
		vo.setCustoTotalIngrediente(vo.getQuantidade()*vo.getCustoUnitario());
		return vo;
	}

	private static IngredienteVO getAcucar() {
		IngredienteVO vo = new IngredienteVO();
		vo.setCustoUnitario(1.9);
		vo.setTipoEmbalagem(TipoEmbalagem_Enum.ACUCAR_KILO_DEFAULT.getTipo());
		vo.setId(1);
		vo.setNome(Ingrediente_Enum.ACUCAR.getNome());
		vo.setQuantidade(18);
		vo.setCustoTotalIngrediente(vo.getQuantidade()*vo.getCustoUnitario());
		return vo;
	}

	// polpa de cupuacu
	private static IngredienteVO getPolpa() {
		IngredienteVO vo = new IngredienteVO();
		vo.setCustoUnitario(130);
		vo.setTipoEmbalagem(TipoEmbalagem_Enum.BAG_10_KG.getTipo());
		vo.setId(2);
		vo.setNome(Ingrediente_Enum.POLPA_CUPUACU.getNome());
		vo.setQuantidade(3);
		vo.setCustoTotalIngrediente(vo.getQuantidade()*vo.getCustoUnitario());
		return vo;
	}

	public static double getCustoReceita_cremeCupuacu() {
		receitaCremeDeCupuacu = getReceitaCupuacu();
		for (IngredienteVO ingredienteVO : receitaCremeDeCupuacu.getReceita())
			custoReceita += ingredienteVO.getCustoTotalIngrediente();
		return custoReceita;
	}
	
}
