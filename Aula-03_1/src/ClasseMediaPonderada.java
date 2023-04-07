
public class ClasseMediaPonderada extends ClasseMedia {
	
	protected double peso1;
	protected double peso2;

	public ClasseMediaPonderada(double valor1, double valor2, double peso1, double peso2) {
		super(valor1, valor2);
		this.peso1 = peso1;
		this.peso2 = peso2;
	}
	
	public double calculaMediaPonderada() {
		double resultado = (super.valor1 + super.valor2) / (peso1 + peso2);
		return resultado;
	}
}
