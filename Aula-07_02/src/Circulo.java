
public class Circulo extends Figura {
	private double raio;
	
	public Circulo(double raio, String cor) {
		this.cor = cor;
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getDiametro() {
		return 0.0;
	}

	@Override
	public void setCor(String cor) {
		
	}

	@Override
	public String getCor() {
		return null;
	}
	
	@Override
	public String toString() {
		return "";
	}

	@Override
	public double area() {
		return 0;
	}
}
