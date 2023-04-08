import java.util.Date;

public class Funcionario {
	protected String nome;
	protected Date nascimento;
	protected String cpf;
	protected Endereco endereco;
	protected float salario;
	
	public Funcionario() {
		this.nome = "";
		this.nascimento = null;
		this.cpf = "";
		this.endereco = null;
		this.salario = 0;
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

	public float getSalario() {
		return salario;
	}
}
