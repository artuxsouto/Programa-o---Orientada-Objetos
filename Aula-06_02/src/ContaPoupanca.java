
public class ContaPoupanca implements Conta {
	private double saldo;

	@Override
	public void depositar(double valor) {
		if(valor <= 0) {
			throw new Excecao("Valor(negativo ou zero) informado para operação em conta poupanca.");
		}
		this.saldo = saldo + valor;
	}

	@Override
	public void sacar(double valor) {
		if(saldo < valor) {
			throw new Excecao("Saldo indisponível em conta poupanca.");
		}
		this.saldo -= valor;
	}

	@Override
	public double getSaldo() {
		return saldo;
	}

	@Override
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;		
	}
}
