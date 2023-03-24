import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno []vetorObjetosAluno;

        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();

        vetorObjetosAluno = new Aluno[qtdAlunos];

        String nome;
        double nota1, nota2, nota3;

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("\n*** Dados do Aluno ***");
            System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("\nDigite a nota 1: ");
            nota1 = sc.nextDouble();
            System.out.print("\nDigite a nota 2: ");
            nota2 = sc.nextDouble();
            System.out.print("\nDigite a nota 3: ");
            nota3 = sc.nextDouble();

            vetorObjetosAluno[i] = new Aluno(nome, nota1, nota2, nota3);
        }

        System.out.println("\n*** Boletim final ***\n");

        for (int j = 0; j < qtdAlunos; j++) {
            System.out.println("Aluno: " + vetorObjetosAluno[j].retornaNome() + " está " + vetorObjetosAluno[j].resultadoFinal());
            System.out.println();
        }
        sc.close();
    }
}
