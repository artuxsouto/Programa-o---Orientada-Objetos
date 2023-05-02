import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> vetorProduto = new ArrayList<>();
		int controle = 0;
		
		while(controle != -1) {
			System.out.print("*** MENU ***\n1 - Cadastrar Produto.\n2 - Sair.\n\nDigite a opcao: ");
			controle = sc.nextInt();
			
			if(controle == 2) {
				controle = -1;
				System.out.println("\n*** SAINDO DO LOOP ***\n- PRODUTOS CADASTRADOS: " + vetorProduto.size());
				break;
			}
			else if(controle == 1) {
				System.out.print("\nDigite o nome do produto: ");
				sc.nextLine();
				String nome = sc.nextLine();
				
				System.out.print("\nDigite o custo do produto: ");
				float custo = sc.nextFloat();
				
				vetorProduto.add(new Produto(nome, custo));
				System.out.println("\n*** PRODUTO CADASTRADO COM SUCESSO! ***\n");
			}
			else {
				System.out.println("\n*** OPCAO INVALIDA ***\n");
			}
		}
		String caminho = "Produtos.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){
			for(int i = 0; i < vetorProduto.size(); i++) {
				bw.write((i + 1) + "° " + vetorProduto.get(i).toString().toUpperCase());
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
