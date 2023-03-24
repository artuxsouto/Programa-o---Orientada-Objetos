
public class ClasseSoma extends ClasseOperacaoMatematica {

	public ClasseSoma(double valor1, double valor2) {
		super(valor1, valor2);
	}
	
	public double soma() {
		double resultado = 0;
		
		if (valor1 > valor2) {
			resultado = valor1 + valor2;
		}
		else if (valor2 > valor1) {
			resultado = valor2 + valor1;
		}
		return resultado;
	}

}
