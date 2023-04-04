import java.util.Date;
import java.text.SimpleDateFormat;

public class Juridica {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Pessoa pessoa;
	private String cnpj;
	private String inscricaoEstadual;
	private Date fundacao;
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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

	public String toString() {
		return "\nID: " + pessoa.getId() + "\nNome: " + pessoa.getNome() + "\nNome fantasia: " + 
				pessoa.getNomeFantasia() + "\nLogradouro: " + pessoa.getLogradouro() + 	", " + 
				pessoa.getNumero() + "\nComplemento: " + pessoa.getComplemento() + "\nBairro: " + 
				pessoa.getBairro() + "\nCEP: " + pessoa.getCep() + "\nUF: " + pessoa.getUf() + 
				"\nCNPJ: " + cnpj + "\nInscricao Estadual: " + inscricaoEstadual + "\nFundacao: " + 
				sdf.format(fundacao);
	}
}
