import java.text.SimpleDateFormat;
import java.util.Date;

public class Juridica extends Pessoa {
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String cnpj;
	private String inscricaoEstadual;
	private Date fundacao;
	
	public Juridica() {
		this.id = 0;
		this.nomeFantasia = "";
		this.logradouro = "";
		this.numero = 0;
		this.complemento = "";
		this.bairro = "";
		this.cep = "";
		this.cidade = "";
		this.uf = "";
		this.cnpj = "";
		this.inscricaoEstadual = "";
		this.fundacao = null;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public Date getFundacao() {
		return fundacao;
	}
	
	public void setFundacao(Date fundacao) {
		this.fundacao = fundacao;
	}
	
	@Override
	public String toString() {
		return "\n*** Dados Pessoa - Juridica ***\nID: " + id + "\nNome Fantasia: " + nomeFantasia + "\nLogradouro: " + logradouro + 
				", " + numero + "\nComplemento: " + complemento + "\nBairro: " + bairro + "\nCEP: " + cep + "\nCidade: " + cidade + 
				"\nSigla(UF): " + uf + "\nCNPJ: " + cnpj + "\nInscricao Estadual: " + inscricaoEstadual + "\nFundacao: " + sdf.format(fundacao);
	}
}
