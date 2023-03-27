
public class Estado {
	private String nome;
	private String sigla;
	
	public Estado() {
		
	}
	
	public Estado(String nome, String uf) {
		this.nome = nome;
		this.sigla = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String toString() {
		return "\nNome do estado: " + nome + "\nSigla(UF): " + sigla;
	}

}
