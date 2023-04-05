
public class Universidade {
	
	private String nomeDaUniversidade;
	
	//Construtor vazio - Usado para instanciar(reservar um espaço na memória) com valores vazios ou null(nulo).
	public Universidade() {
		this.nomeDaUniversidade = "";
	}
	
	//Construtor - Atribuindo(Alimentando) valores com variável através dos argumento("String nome") passado.
	public Universidade(String nome) {
		this.nomeDaUniversidade = nome;
	}
	
	public String retornaNomeUniversidade() {
		return nomeDaUniversidade;
	}
	
}
