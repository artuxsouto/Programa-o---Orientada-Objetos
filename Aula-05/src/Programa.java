import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Contador contador = new Contador();
		
		int controle = 0;
		
		while(controle != -1) {
			System.out.print("*** MENU ***\n1 - Incrementar contador\n2 - Zerar contador\n3 - Mostrar o valor do contador\n0 - Sair.\n\nDigite a opcao: ");
			controle = sc.nextInt();
			
			if(controle == 0) {
				controle = -1;
				break;
			}
			
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			
			if(controle == 1) {
				contador.incrementarContador();
				System.out.println("Valor incrementado com sucesso!\n");
			}
			else if(controle == 2) {
				contador.zerarContador();
				System.out.println("Contador reiniciado\nValor atual é 0.\n");
			}
			else if(controle == 3) {
				contador.retornarOValorDoContador();
				System.out.println();
			}
		}
		
		sc.close();
	}

}
