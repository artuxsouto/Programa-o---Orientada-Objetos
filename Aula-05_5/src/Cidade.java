
public class Cidade {
	private String nomeCidade;
	private Estado estado;
	
	public Cidade() {
		this.nomeCidade = "";
		this.estado = null;
	}
	
	public Cidade(String nome, Estado estado) {
		this.nomeCidade = nome;
		this.estado = estado;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public Estado getEstado() {
		return estado;
	}
	
	@Override
	public String toString() {
		return "\nNome da Cidade: " + nomeCidade + "\n*** DADOS ESTADO ***" + estado.toString();
	}
}