
public class ClasseMultiplicacao extends ClasseOperacaoMatematica {

	public ClasseMultiplicacao(double valor1, double valor2) {
		super(valor1, valor2);
	}
	
	public double multiplicacao() {
		double resultado = valor1 + valor2;
		return resultado;
	}

}
