import java.util.Date;
import java.text.SimpleDateFormat;

public class Fisica {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Pessoa pessoa;
	private String cpf;
	private String rg;
	private String genero;
	private Date nasc;
	
	public Fisica() {
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getNasc() {
		return nasc;
	}

	public void setNasc(Date nasc) {
		this.nasc = nasc;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {		
		return  "\n*** Dados Pessoa - Fisica ***" + pessoa.toString() + "\nCPF: " + cpf + "\nRG: " + rg + 
				"\nGenero: " + genero + "\nData de Nascimento: " + sdf.format(nasc);
	}
	
}
