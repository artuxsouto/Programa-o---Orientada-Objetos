
public class Endereco {
	
	private String rua;
	private int numero;
	private String bairro;
	private String cep;
	private Cidade cidade;
	
	public Endereco() {
	}
	
	public Endereco(String r, int n, String b, String c, Cidade cid) {
		this.rua = r;
		this.numero = n;
		this.bairro = b;
		this.cep = c;
		this.cidade = cid;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public String toString() {
		return "\nNome da rua: " + rua + ", " 
				+ numero + "\nBairro: " + bairro + 
				"\nCEP: " + cep + "\n*** Cidade ***" + 
				cidade.toString();
	}
}
