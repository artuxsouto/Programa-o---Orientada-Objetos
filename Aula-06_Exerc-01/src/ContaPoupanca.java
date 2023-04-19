
public class ContaPoupanca extends Conta {

	@Override
	public void imprimeExtrato() {
		System.out.printf("SALDO ATUAL: %.2f", saldo);
	}
}
