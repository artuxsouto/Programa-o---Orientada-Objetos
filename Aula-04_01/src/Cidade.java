
public class Cidade {
	
	private String nome;
	private Estado estado;

	public Cidade() {	
	}

	public Cidade(String n, Estado e) {
		this.nome = n;
		this.estado = e;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public String toString() {
		return "\nNome da cidade: " + nome +
				"\n*** Estado ***" + estado.toString();
	}
}
