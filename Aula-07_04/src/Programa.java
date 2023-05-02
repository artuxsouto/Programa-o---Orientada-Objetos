import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Caminhao> vetorCaminhao = new ArrayList<>();
		ArrayList<Onibus> vetorOnibus = new ArrayList<>();
		int controle = 0;
		
		while(controle != -1) {
			System.out.print("*** MENU ***\n1 - Cadastrar Caminhao.\n2 - Cadastrar Onibus.\n3 - Sair.\n\nDigite a opcao: ");
			controle = sc.nextInt();
			
			if(controle == 3) {
				controle = -1;
				System.out.println("\n*** SAINDO DO LOOP - VEICULOS CADASTRADOS ***\n- CAMINHAO: " + 
						vetorCaminhao.size() + "\n- ONIBUS: " + vetorOnibus.size());
				break;
			}
			System.out.print("\nDigite a placa: ");
			sc.nextLine();
			String placa = sc.nextLine();
			
			System.out.print("\nDigite o ano: ");
			int ano = sc.nextInt();
			
			if(controle == 2) {
				System.out.print("\nDigite a quantidade de assentos: ");
				int assentos = sc.nextInt();
				
				vetorOnibus.add(new Onibus(placa, ano, assentos));
				System.out.println("\n*** ONIBUS CADASTRADO COM SUCESSO! ***\n");
			}
			else if(controle == 1) {
				System.out.print("\nDigite a quantidade de eixos: ");
				int eixos = sc.nextInt();
				
				vetorCaminhao.add(new Caminhao(placa, ano, eixos));
				System.out.println("\n*** CAMINHAO CADASTRADO COM SUCESSO! ***\n");
			}
			else if(controle <= 0 || controle > 3) {
				System.out.println("\n*** OPCAO INVALIDA ***");
			}
		}
		String caminho = "veiculo.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){
			for(int i = 0; i < vetorCaminhao.size(); i ++) {
				bw.write((i + 1) + "° " + vetorCaminhao.get(i).exibirDados());
				bw.newLine();
			}
			for(int j = 0; j < vetorOnibus.size(); j ++) {
				bw.write((j + 1) + "° " + vetorOnibus.get(j).exibirDados());
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n*** FIM ***");
		sc.close();
	}
}
