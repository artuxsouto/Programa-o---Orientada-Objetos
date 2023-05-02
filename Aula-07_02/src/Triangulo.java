
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
		this.cor = cor;
	}

	@Override
	public String getCor() {
		return cor;
	}
	
	@Override
	public String toString() {
		return "triangulo\n" + "- cor: " + cor + "\n- base: " + base + "cm" + "\n- altura: " + altura + "cm" + "\n- area: " + area() + "cm";
	}

	@Override
	public double area() {
		return (base * altura) / 2;
	}
}
