
public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa() {
		this.nome = "";
		this.idade = 0;
	}
	
	public void definirNome(String nome) {
		this.nome = nome;
	}
	
	public String retornarNome() {
		return nome;
	}
	
	public void definirIdade(int idade) {
		this.idade = idade;
	}
	
	public int retornarIdade() {
		return idade;
	}
}
