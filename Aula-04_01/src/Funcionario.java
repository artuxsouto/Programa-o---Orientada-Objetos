import java.util.Date;
import java.text.SimpleDateFormat;

public class Funcionario {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	private String nome;
	private Date nascimento;
	private String cpf;
	private Endereco endereco;
	
	public Funcionario() {
	}
	
	public Funcionario(String n, Date nasc, String cpf, Endereco end) {
		this.nome = n;
		this.nascimento = nasc;
		this.cpf = cpf;
		this.endereco = end;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Date getNascimento() {
		return nascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public String toString() {
		return "\nNome do Funcionario: " + nome + "\nData de Nascimento: " + sdf.format(nascimento) + "\nCPF: " + cpf +
				"\n*** Endereco ***" + endereco.toString();
	}
}
