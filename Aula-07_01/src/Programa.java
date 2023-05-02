import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	
	public static void main(String args[]) throws ParseException {
		Scanner sc = new Scanner(System.in);
		ArrayList<Continente> conjuntoDeContinente = new ArrayList<>();
		String nomeDosContinentes[] = {"Antartida", "Africa", "Europa", "Oceania", "Asia", "America"};
		int controle = 0;
		
		System.out.println("*** Exercicio - 01 ***");
		
		System.out.println("\n*** CADASTRANDO CONTINENTES ***");
		for(int i = 0; i < 6; i++) {
			conjuntoDeContinente.add(new Continente(nomeDosContinentes[i].toUpperCase()));
			System.out.println("ID: " + i + " - CONTINENTE: " + nomeDosContinentes[i] + " -- INSERIDO COM SUCESSO! --");
		}
		
		while(controle != -1) {
			System.out.println("\n*** CADASTRANDO PAIS ***");
			System.out.print("\nDigite o 'id' do continente: ");
			int id = sc.nextInt();
			try {
				conjuntoDeContinente.get(id);
			}
			catch(Exception e) {
				System.out.println("ERRO - ID não encontrado ou inválido.");
				break;
			}
			
			if(id != 0) {
				System.out.print("\nDigite o nome do pais: ");
				sc.nextLine();
				String nomePais = sc.nextLine();
					
				System.out.print("\nDigite a quantidade de habitantes: ");
				Integer populacao = sc.nextInt();
						
				System.out.print("\nDigite o tamanho do território em km²: ");
				Integer dimensao = sc.nextInt();
						
				Pais pais = new Pais(nomePais.toUpperCase(), populacao, dimensao);
				conjuntoDeContinente.get(id).adicionarPaisNoContinente(pais);
				System.out.println("\n*** PAÍS: " + nomePais + " - INSERIDO COM SUCESSO EM -> " + conjuntoDeContinente.get(id).getNome() + " ***");
						
				System.out.print("\nDeseja continuar? 1 - SIM ou 2 - NÃO\n\nDigite a opcao: ");
				id = sc.nextInt();
						
				if(id == 2) {
					controle = -1;
					System.out.println("\n*** SAINDO DO LOOP ***");
					break;
				}
				else if(id != 2) {
					System.out.println("\n*** REINICIANDO O LAÇO ***");
				}			
			}
			else if(id == 0) {
				System.out.println("\nContinente Antártida: É propriedade da humanidade não é possível cadastrar um país.");
			}
		}
		
		imprimindoContinentes(conjuntoDeContinente);
		String caminho = "Continente.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){
			for(int y = 0; y < conjuntoDeContinente.size(); y++) {
				bw.write(conjuntoDeContinente.get(y).relatorio());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n*** FIM ***");
		sc.close();
		
	}
	
	public static void imprimindoContinentes(ArrayList<Continente> listaDeContinente) {
		int totalDePaises[] = {0, 54, 50, 14, 49, 36};
		System.out.println("\n*** LISTA DE CONTINENTES ***");
		for(int x = 0; x < listaDeContinente.size(); x++) {
			System.out.println("ID: " + x + " - CONTINENTE: " + listaDeContinente.get(x).getNome() + " - PAÍSES: " + listaDeContinente.get(x).getQuantidadeDePaises() + "/" + totalDePaises[x]);
		}
	}
}
