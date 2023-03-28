
public class Onibus {
	
	private int assentos;
	private Veiculo veiculo;
	
	public Onibus() {
		
	}
	
	public Onibus(int a, Veiculo veiculo) {
		this.assentos = a;
		this.veiculo = veiculo;
	}
	
	public int getAssentos() {
		return assentos;
	}
	
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void exibirDados() {
		System.out.println("\n*** Dados veiculo - Onibus ***\nQuantidade de assentos: " + assentos);
	}
}
