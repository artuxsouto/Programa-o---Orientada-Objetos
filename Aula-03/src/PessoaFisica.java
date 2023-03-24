
public class PessoaFisica extends Pessoa {
	
	private long cpf;

	public PessoaFisica(String nome, long cpf) {
		super(nome);
		this.cpf = cpf;
	}
	
	public String getNome() {
		return "Pessoa Fisica: " + super.getNome() + " - CPF: " + cpf;
	}
}
