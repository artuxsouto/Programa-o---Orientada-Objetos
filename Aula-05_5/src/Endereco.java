
public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String cep;
	private Cidade cidade;
	
	public Endereco() {
		this.rua = "";
		this.numero = 0;
		this.bairro = "";
		this.cep = "";
		this.cidade = null;
	}
	
	public Endereco(String rua, int numero, String bairro, String cep, Cidade cidade) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public Cidade getCidade() {
		return cidade;
	}
	
	@Override
	public String toString() {
		return "\nNome da rua: " + rua + ", " + numero + "\nBairro: " + bairro + 
				"\nCEP: " + cep + "\n*** DADOS CIDADE ***" + cidade;
	}
}