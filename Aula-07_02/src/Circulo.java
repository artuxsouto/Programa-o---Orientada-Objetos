
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
		this.cor = cor;
	}

	@Override
	public String getCor() {
		return cor;
	}
	
	@Override
	public String toString() {
		return "triangulo\n" + "- cor: " + cor + "\n- raio: " + raio + "cm" + "\n- area: " + area() + "cm";
	}

	@Override
	public double area() {
		return (raio * raio) * 3.14;
	}
}
