
public class Triangulo extends Figura {
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura, String cor) {
		this.base = base;
		this.altura = altura;
		this.cor = cor;
	}
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
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
