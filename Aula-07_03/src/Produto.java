
public class Produto implements IProduto {
	private String nome;
	private float custo;
	
	public Produto() {
		this.nome = "";
		this.custo = 0;
	}
	
	public Produto(String nome, float custo) {
		this.nome = nome;
		this.custo = custo;
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public float getCusto() {
		return custo;
	}
	
	@Override
	public String toString() {
		return "produto: " + nome + "\ncusto: R$ " + String.format("%.2f", custo);
	}
}
