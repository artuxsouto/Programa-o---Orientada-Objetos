
public abstract class Conta {
	protected double saldo;
	
	public Conta() {
		this.saldo = 0;
	}
	
	public double getSalario() {
		return saldo;
	}
	
	public void setSalario(double valor) {
		this.saldo = valor;
	}
	
	public abstract void imprimeExtrato();
}
