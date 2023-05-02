import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Retangulo> vetorRetangulo = new ArrayList<>();
		ArrayList<Quadrado> vetorQuadrado = new ArrayList<>();
		ArrayList<Triangulo> vetorTriangulo = new ArrayList<>();
		ArrayList<Circulo> vetorCirculo = new ArrayList<>();
		int controle = 0;
		
		while(controle != -1) {
			System.out.print("*** MENU ***\n1 - Retângulo.\n2 - Quadrado.\n3 - Triangulo.\n4 - Circulo.\n5 - Sair.\n\nDigite a opcao: ");
			controle = sc.nextInt();
			
			if(controle > 0 && controle <= 5) {
				if(controle == 5) {
					controle = -1;
					System.out.println("\n*** SAINDO DO LOOP ***\nFIGURAS CADASTRADAS:\n- RETÂNGULO: " + vetorRetangulo.size() + 
							"\n- QUADRADO: " + vetorQuadrado.size() + "\n- TRIANGULO: " + vetorTriangulo.size() + "\n- CIRCULO: " + vetorCirculo.size());
					break;
				}
				
				System.out.print("\nDigite a cor: ");
				sc.nextLine();
				String cor = sc.nextLine();
				
				if(controle == 1) {
					System.out.println("\n*** CADASTRANDO UM RETÂNGULO ***");
					System.out.print("\nDigite o lado1: ");
					double lado1 = sc.nextDouble();
					
					System.out.print("\nDigite o lado2: ");
					double lado2 = sc.nextDouble();
					
					vetorRetangulo.add(new Retangulo(lado1, lado2, cor));
					System.out.println("\n*** RETÂNGULO CADASTRADO COM SUCESSO! ***\n");
				}
				else if(controle == 2) {
					System.out.println("\n*** CADASTRANDO UM QUADRADO ***");
					System.out.print("\nDigite o lado1: ");
					double lado1 = sc.nextDouble();
					
					System.out.print("\nDigite o lado2: ");
					double lado2 = sc.nextDouble();
					
					vetorQuadrado.add(new Quadrado(lado1, lado2, cor));
					System.out.println("\n*** QUADRADO CADASTRADO COM SUCESSO! ***\n");
				}
				else if(controle == 3) {
					System.out.println("\n*** CADASTRANDO UM TRIANGULO ***");
					System.out.print("\nDigite a base: ");
					double base = sc.nextDouble();
					
					System.out.print("\nDigite o altura: ");
					double altura = sc.nextDouble();
					
					vetorTriangulo.add(new Triangulo(base, altura, cor));
					System.out.println("\n*** TRIANGULO CADASTRADO COM SUCESSO! ***\n");
				}
				else if(controle == 4) {
					System.out.println("\n*** CADASTRANDO UM CIRCULO ***");
					System.out.print("\nDigite o raio: ");
					double raio = sc.nextDouble();
					
					vetorCirculo.add(new Circulo(raio, cor));
					System.out.println("\n*** CIRUCULO CADASTRADO COM SUCESSO! ***\n");
				}
			}
			else if(controle < 0 && controle > 5) {
				System.out.println("\nOpcao invalida.");
			}
		}
		String caminho = "Figuras.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
			for(int i = 0; i < vetorRetangulo.size(); i++) {
				bw.write((i + 1) + "° " + vetorRetangulo.get(i).toString().toLowerCase());
				bw.newLine();
			}
			for(int i = 0; i < vetorQuadrado.size(); i++) {
				bw.write((i + 1) + "° " + vetorQuadrado.get(i).toString().toLowerCase());
				bw.newLine();
			}
			for(int i = 0; i < vetorTriangulo.size(); i++) {
				bw.write((i + 1) + "° " + vetorTriangulo.get(i).toString().toLowerCase());
				bw.newLine();
			}
			for(int i = 0; i < vetorCirculo.size(); i++) {
				bw.write((i + 1) + "° " + vetorCirculo.get(i).toString().toLowerCase());
				bw.newLine();
			}
		}
		catch (IOException  e) {
			e.printStackTrace();
		}
		System.out.println("\n*** FIM ***");
		sc.close();
	}
}
