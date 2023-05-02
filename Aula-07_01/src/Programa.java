
public class Pais {
	
	private String nome;
	private Integer populacao;
	private Integer dimensao;
	
	public Pais() {
		this.nome = "";
		this.populacao = 0;
		this.dimensao = 0;
	}
	
	public Pais(String nomePais, Integer populacaoPais, Integer dimensaoPais) {
		this.nome = nomePais;
		this.populacao = populacaoPais;
		this.dimensao = dimensaoPais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPopulacao() {
		return populacao;
	}

	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}

	public Integer getDimensao() {
		return dimensao;
	}

	public void setDimensao(Integer dimensao) {
		this.dimensao = dimensao;
	}
}
