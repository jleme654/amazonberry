package br.com.maxscalla.vo;

/**
 * @author julio.leme@amazonberryacai.com.br
 * @since {date}
 * @version 1.0
 *
 */
public class ClienteMaxScallaVO {

	private String Fantasia;
	private String RazaoSocial;
	private String PessoaFisicaJuridica;
	private String CNPJ;
	private String InscricaoSocial;
	private String CPF;
	private String RG;
	private String TelefoneFixo;
	private String TelefoneCelular;
	private String Endereco;
	private String Numero;
	private String Bairro;
	private String Cidade;
	private String Estado;
	private String CEP;
	private String ComplementoEndereço;

	/**
	 * 
	 */
	public String getFantasia() {
		return Fantasia;
	}

	public void setFantasia(String fantasia) {
		Fantasia = fantasia;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	public String getPessoaFisicaJuridica() {
		return PessoaFisicaJuridica;
	}

	public void setPessoaFisicaJuridica(String pessoaFisicaJuridica) {
		PessoaFisicaJuridica = pessoaFisicaJuridica;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getInscricaoSocial() {
		return InscricaoSocial;
	}

	public void setInscricaoSocial(String inscricaoSocial) {
		InscricaoSocial = inscricaoSocial;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getTelefoneFixo() {
		return TelefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		TelefoneFixo = telefoneFixo;
	}

	public String getTelefoneCelular() {
		return TelefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		TelefoneCelular = telefoneCelular;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getComplementoEndereço() {
		return ComplementoEndereço;
	}

	public void setComplementoEndereço(String complementoEndereço) {
		ComplementoEndereço = complementoEndereço;
	}

	@Override
	public String toString() {
		return "ClienteMaxScallaVO [Fantasia=" + Fantasia + ", RazaoSocial=" + RazaoSocial + ", PessoaFisicaJuridica="
				+ PessoaFisicaJuridica + ", CNPJ=" + CNPJ + ", InscricaoSocial=" + InscricaoSocial + ", CPF=" + CPF
				+ ", RG=" + RG + ", TelefoneFixo=" + TelefoneFixo + ", TelefoneCelular=" + TelefoneCelular
				+ ", Endereco=" + Endereco + ", Numero=" + Numero + ", Bairro=" + Bairro + ", Cidade=" + Cidade
				+ ", Estado=" + Estado + ", CEP=" + CEP + ", ComplementoEndereço=" + ComplementoEndereço + "]";
	}

}
