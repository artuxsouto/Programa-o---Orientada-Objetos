import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ContaPoupanca> vetorContas = new ArrayList<>(5);
		int controle = 0;
		
		System.out.println("*** Exercicio-01 ***\nDigite 5 numeros double");
		
		while(controle < 5) {
			try {
				System.out.print("\nDigite o numero[" + (controle + 1) + "]: ");
				double valor = sc.nextDouble();
				
				ContaPoupanca contaP = new ContaPoupanca();
				contaP.setSalario(valor);
				vetorContas.add(controle, contaP);
			}
			
			catch(Exception e) {
				System.out.println("ERRO - Numero digitado não é double.");
				System.out.println(e);
				break;
			}
			
			controle++;
			
		}
		System.out.println("\n*** Imprimindo Extrato ***");
		for(int i = 0; i < vetorContas.size(); i++) {
			System.out.println("Conta[" + (i + 1) + "]: ");
			vetorContas.get(i).imprimeExtrato();
			System.out.println();
		}
		
		System.out.println("*** FIM ***");
		
		sc.close();
	}

}
