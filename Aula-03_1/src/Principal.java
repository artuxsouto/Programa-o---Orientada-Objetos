import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double valor1 = 0;
		double valor2 = 0;
		
		System.out.println("*** Operacao Matematica ***");
		int loop = 1;
		
		System.out.print("1 - Soma\n2 - Subtracao\n3 - Divisao\n4 - Multiplicacao\n5 - Media\n6 - Media ponderada\n0 - Sair\nDigite a opcao: ");
		int menu = sc.nextInt();
		
		if (menu != 0) {
			System.out.print("\nInforme o valor 1: ");
			valor1 = sc.nextDouble();
			System.out.print("\nInforme o valor 2: ");
			valor2 = sc.nextDouble();
		}
			
		
		while(loop == 1 && menu != 0) {			
			if (menu == 1) {				
				ClasseSoma soma = new ClasseSoma(valor1, valor2);
				
				System.out.println("\nResultado: " + soma.soma());
			}
			else if (menu == 2) {
				ClasseSubtracao sub = new ClasseSubtracao(valor1, valor2);
				
				System.out.println("\nResultado: " + sub.sub());
				
			}
			else if (menu == 3) {
				ClasseDivisao divisao = new ClasseDivisao(valor1, valor2);
				
				System.out.println("\nResultado: " + divisao.divisao());
				
			}
			else if (menu == 4) {
				ClasseMultiplicacao multiplicacao = new ClasseMultiplicacao(valor1, valor2);
				
				System.out.println("\nResultado: " + multiplicacao.multiplicacao());
				
			}
			else if (menu == 5) {
				ClasseMedia media = new ClasseMedia(valor1, valor2);
				
				System.out.println("\nResultado: " + media.calculoMedia());
				
			}
			else if (menu == 6) {
				System.out.print("\nInforme o peso do valor 1: ");
				double peso1 = sc.nextDouble();
				System.out.print("\nInforme o peso do valor 2: ");
				double peso2 = sc.nextDouble();
				
				ClasseMediaPonderada mediaPonderada = new ClasseMediaPonderada(valor1, valor2, peso1, peso2);
				
				System.out.println("\nResultado: " + mediaPonderada.calculaMediaPonderada());
			}
			else if (menu == 0) {
				loop = 0;
			}
			
			System.out.print("1 - Soma\n2 - Subtracao\n3 - Divisao\n4 - Multiplicacao\n5 - Media\n6 - Media ponderada\n0 - Sair\nDigite a opcao: ");
			menu = sc.nextInt();
			System.out.print("\nInforme o valor 1: ");
			valor1 = sc.nextDouble();
			System.out.print("\nInforme o valor 2: ");
			valor2 = sc.nextDouble();	
		}
		
		System.out.println("***FIM***");
		
		sc.close();

	}

}
