import java.util.Objects;

public class Contato {
	
	private String nome;
	private String telefone;
	
	public Contato() {
		this.nome = "";
		this.telefone = "";
	}
	
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	///Métodos "equals" da linguagem Java sobreescrito "@Override" para comparar 
	//nomes do tipo texto(String) onde retorna o valor "true" ou "false".
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}
	
}
