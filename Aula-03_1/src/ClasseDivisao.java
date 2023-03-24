
public class ClasseDivisao extends ClasseOperacaoMatematica {

	public ClasseDivisao(double valor1, double valor2) {
		super(valor1, valor2);
	}
	
	public double divisao() {
		double resultado = 0;
		if (valor1 > valor2) {
			resultado = valor1 / valor2;
		}
		else if (valor2 > valor1) {
			resultado = valor2 / valor1;
		}
		return resultado;		
	}

}
