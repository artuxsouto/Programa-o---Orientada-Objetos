import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int loop = 1;
		int idade = 0;
		int menu = 0;
		String nome = "";
		String curso = "";
		String formacao = "";
		
		List<Aluno> listaAlunos = new ArrayList<>();
		List<Professor> listaProfessores = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** Cadastro de Professor/Aluno ***\n");
		
		System.out.print("\nMenu:\n1 - Cadastrar Aluno.\n2 - Cadastrar Professor.\n0 - Sair.\n\nDigite a opcao: ");
		menu = sc.nextInt();
		
		if(menu != 0) {
			System.out.print("\nDigite o nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.print("\nDigite a idade: ");
			idade = sc.nextInt();
		}
		
		while(loop == 1 && menu != 0) {
			if(menu == 1) {
				System.out.print("\nDigite o curso: ");
				sc.nextLine();
				curso = sc.nextLine();
				
				Aluno aluno = new Aluno();
				
				aluno.definirNome(nome);
				aluno.definirIdade(idade);
				aluno.definirCurso(curso);
				
				listaAlunos.add(aluno);
				
			}
			else if(menu == 2) {
				System.out.print("\nDigite a formacao: ");
				sc.nextLine();
				formacao = sc.nextLine();
				
				Professor professor = new Professor();
				
				professor.definirNome(nome);
				professor.definirIdade(idade);
				professor.definirFormacao(formacao);
				
				listaProfessores.add(professor);
				
			}
			else if(menu == 0) {
				loop = 0;
			}
			System.out.println("\n\n*** Cadastro de Professor/Aluno ***\n");
			
			System.out.print("\nMenu:\n1 - Cadastrar Aluno.\n2 - Cadastrar Professor.\n0 - Sair.\n\nDigite a opcao: ");
			menu = sc.nextInt();
			
			if(menu != 0) {
				System.out.print("\nDigite o nome: ");
				nome = sc.next();
				sc.nextLine();
				System.out.print("\nDigite a idade: ");
				idade = sc.nextInt();
			}
		}
		System.out.println("\nAlunos:\n");			
		for(Aluno i : listaAlunos) {
			System.out.println("Nome: " + i.retornarNome() + "\nIdade: " + i.retornarIdade() + "\nCurso: " + i.retornarCurso() + "\n\n");
		}
		System.out.println("\nProfessores:\n");
		for(Professor y : listaProfessores) {
			System.out.println("Nome: " + y.retornarNome() + "\nIdade: " + y.retornarIdade() + "\nFormacao: " + y.retornarFormacao() + "\n\n");
		}
		sc.close();
	}
}
