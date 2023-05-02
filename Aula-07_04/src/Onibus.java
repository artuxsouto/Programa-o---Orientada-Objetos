
public class Onibus extends Veiculo {
	private int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}
	
	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	@Override
	public String exibirDados() {
		return "Onibus\n- PLACA: " + placa + "\n- ANO: " + ano + "\n- ASSENTOS: " + assentos;		
	}
}
