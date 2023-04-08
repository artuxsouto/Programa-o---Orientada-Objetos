
public class Estado {
	private String nomeEstado;
	private String sigla;
	
	public Estado() {
		this.nomeEstado = "";
		this.sigla = "";
	}
	
	public Estado(String nome, String uf) {
		this.nomeEstado = nome;
		this.sigla = uf;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public String getSigla() {
		return sigla;
	}
	
	@Override
	public String toString() {
		return "\nNome estado: " + nomeEstado + "\nSigla(UF): " + sigla;
	}
}