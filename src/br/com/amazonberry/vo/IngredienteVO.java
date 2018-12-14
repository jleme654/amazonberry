package br.com.amazonberry.vo;

public class IngredienteVO {

	private int id;
	private String nome;
	private String tipoEmbalagem;
	private int quantidade;
	private double custoUnitario;
	private double custoTotalIngrediente;

	public double getCustoTotalIngrediente() {
		return custoTotalIngrediente;
	}																																																																																																																																																																																																																																	

	public void setCustoTotalIngrediente(double custoTotalIngrediente) {
		this.custoTotalIngrediente = custoTotalIngrediente;																																												
	}

	public String getTipoEmbalagem() {
		return tipoEmbalagem;
	}

	public void setTipoEmbalagem(String tipoEmbalagem) {
		this.tipoEmbalagem = tipoEmbalagem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getCustoUnitario() {
		return custoUnitario;
	}

	public void setCustoUnitario(double custoUnitario) {
		this.custoUnitario = custoUnitario;
	}

	@Override
	public String toString() {
		return "IngredienteVO [id=" + id + ", nome=" + nome + ", tipoEmbalagem=" + tipoEmbalagem + ", quantidade="
				+ quantidade + ", custoUnitario=" + custoUnitario + "]";
	}

}
