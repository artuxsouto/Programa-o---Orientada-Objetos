import java.util.Scanner;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//instanciando os objetos do tipo vetor.
		ArrayList<Professor> vetorProfessor = new ArrayList<>();
		ArrayList<Coordenador> vetorCoordenador = new ArrayList<>();
		//variavél de controle do laço(loop).
		int controle = 0;
		
		System.out.println("*** Aula-05 | Exercicio-04 ***");
		
		while(controle != -1) {
			System.out.print("\n1 - Cadastrar Professor/Coordenador\n2 - Sair\n\nDigite a opcao: ");
			controle = sc.nextInt();
			
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			
			if(controle == 2) {
				controle = -1;
				break;
			}
			
			System.out.print("\nDigite o nome: ");
			String nome = sc.nextLine();
									
			System.out.print("\nDigite o CPF(XXX.XXX.XXX-XX): ");
			String cpf = sc.nextLine();
						
			System.out.print("\n1 - Professor\n2 - Coordenador\n\nDigite a opcao: ");
			controle = sc.nextInt();
			
			if(controle == 1) {
				System.out.print("\nDigite o salario do Professor: ");
				double salario = sc.nextDouble();
				//instanciando um novo objeto em uma única linha de comando e inserindo no objeto vetorProfessor
				//através do método "add" da linguagem java(ArrayList).
				vetorProfessor.add(new Professor(nome, cpf, salario));
				System.out.println("Professor(" + nome  + ") inserido com sucesso!");
			}
			else if(controle == 2) {
				System.out.print("\nDigite o salario do Coordenador: ");
				double salario = sc.nextDouble();
				
				if(sc.hasNextLine()) {
					sc.nextLine();
				}
				
				System.out.print("\nDigite o curso: ");
				String curso = sc.nextLine();
				//instanciando um novo objeto em uma única linha de comando e inserindo no objeto vetorCoordenador
				//através do método "add" da linguagem java(ArrayList).
				vetorCoordenador.add(new Coordenador(nome, cpf, salario, curso));
				
				System.out.println("Coordenador(" + nome +") inserido com sucesso!");
				
			}
		}
		System.out.print("\n*** Professores ***");
		//Percorrendo o vetor de objetos(Professor) - "foreach"
		for (Professor professor : vetorProfessor) {
			professor.imprime();			
		}
		System.out.println("\n*** Coordenadores ***");
		//Percorrendo o vetor de objetos(Coordenador) - "foreach"
		for (Coordenador coordenador : vetorCoordenador) {
			coordenador.imprime();			
		}
		sc.close();
	}
}
