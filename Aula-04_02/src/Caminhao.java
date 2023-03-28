
public class Caminhao {
	
	private int eixos;
	private Veiculo veiculo;
	
	public Caminhao() {
		
	}
	
	public Caminhao(int e, Veiculo v) {
		this.eixos = e;
		this.veiculo = v;
		
	}
	
	public int getEixos() {
		return eixos;
	}
	
	public void setEixos(int e) {
		this.eixos = e;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void exibirDados() {
		System.out.println("\n*** Dados Veiculo - Caminhao ***\nQuantidade de eixos: " + eixos);
	}
}
