import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Caminhao> arrayCaminhao = new ArrayList<>();
		ArrayList<Onibus> arrayOnibus = new ArrayList<>();
		
		int controle = 0;
		
		while(controle != -1) {
			System.out.println("*** Cadastro de Veículos ***");
			System.out.print("\n1 - Cadastro de caminhao\n2 - Cadastro de onibus\n3 - Sair\n\nDigite a opcao: ");
			controle = sc.nextInt();
			
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			
			if(controle == 3) {
				controle = -1;
				break;
			}
			
			System.out.print("\nDigite a placa: ");
			String placa = sc.nextLine();
			System.out.print("\nDigite o ano: ");
			int ano = sc.nextInt();
			
			Veiculo veiculo = new Veiculo(placa, ano);
			
			if(controle == 1) {
				System.out.print("\nDigite a quantidade de eixos: ");
				int eixos = sc.nextInt();
				
				Caminhao caminhao = new Caminhao(eixos, veiculo);
				arrayCaminhao.add(caminhao);
			}
			else if(controle == 2) {
				System.out.print("\nDigite a quantidade dos assentos: ");
				int assentos = sc.nextInt();
				
				Onibus onibus = new Onibus(assentos, veiculo);
				arrayOnibus.add(onibus);
			}
		}
		
		for(Caminhao c : arrayCaminhao) {
			c.exibirDados();
			c.getVeiculo().exibirDados();
		}
		
		for(Onibus o : arrayOnibus) {
			o.exibirDados();
			o.getVeiculo().exibirDados();
		}
		sc.close();
	}
}
