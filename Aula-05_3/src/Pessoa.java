
public class Pessoa {
	protected String nome;
	protected String cpf;
	protected static int contador;
	
	public Pessoa() {
		this.nome = "";
		this.cpf = "";		
	}
	
	public Pessoa(String n, String c) {
		this.nome = n;
		this.cpf = c;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void imprime() {
		System.out.println("\nNome: " + nome + "\nCPF: " + cpf);
	}
}
