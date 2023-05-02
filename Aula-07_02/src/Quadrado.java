
public class Quadrado extends Retangulo {

	public Quadrado(double lado1, double lado2, String cor) {
		super(lado1, lado2, cor);
	}
	
	@Override
	public String toString() {
		return "quadrado\n" + "- cor: " + cor + "\n- lado1: " + lado1 + "cm" + "\n- lado2: " + lado2 + "cm" + "\n- area: " + area() + "cm";
	}
}
