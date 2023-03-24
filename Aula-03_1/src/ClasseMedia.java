
public class ClasseMedia extends ClasseOperacaoMatematica {
	

	public ClasseMedia(double valor1, double valor2) {
		super(valor1, valor2);
	}
		
	public double calculoMedia() {
		double resultado = super.valor1 + super.valor2;
		return resultado / 2;
	}
}
