import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		//Permite capturar os Input(entrada) que o usuário digita no decorrer do programa. OBS: Lembrar de encerrar antes do final do programa. 
		Scanner sc = new Scanner(System.in);
		//Permite personalizar a saída do tipo Date(data) - Pra isso importe a java.text.SimpleDateFormat e instancie um objeto.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//Variável para controlar o laço de execução.
		int controle = 0;
		
		//Instanciando um vetor do tipo Pessoa com tamanho dinâmico.
		ArrayList<Pessoa> vetorPessoas = new ArrayList<>();
		
		System.out.println("*** Exercicio 3 - Relatório completo ***");
		
		while(controle != -1) {
			System.out.print("\nDigite o nome: ");
			//Capturando o tipo texto(String) digitado pelo usuário através do método "nextLine()" do objeto "sc"(Scanner).
			String nome = sc.nextLine();
			
			System.out.print("\nDigite a data de Nascimento(dd/MM/yyyy): ");
			//Variável dtNascimento recebe o método "parse" do objeto criado "sdf", onde o valor digitado pelo usuário é 
			//capturado pelo argumento "sc.nextLine()" seja salvo na memória com o valor já customizado(Dia/Mês/Ano).
			//OBS: Se digitado um padrão diferente de "dd/MM/yyyy" vai ocorrer erro de leitura.
			Date dtNascimento = sdf.parse(sc.nextLine());
			
			System.out.print("\nDigite o nome da Universidade que trabalha: ");
			String nomeUniversidade = sc.nextLine();
			
			//Instanciando um objeto e passando o seu argumento em uma única linha de comando.
			Universidade universidade = new Universidade(nomeUniversidade);
			
			//Usando o método "add" do objeto "vetorPessoas" para instancia em uma unica linha de comando um novo objeto e salvando no vetor.
			vetorPessoas.add(new Pessoa(nome, dtNascimento, universidade));
			
			System.out.print("\nDeseja continuar incluindo? 1 - Sim ou 2 - Não\n\nDigite a opcao: ");
			//Capturando o tipo inteiro(int) digitado pelo usuário através do método "nextInt()" do objeto "sc"(Scanner).
			controle = sc.nextInt();
			
			//Criando condições para manipular o comportamento do programa/aplicação.
			if(controle == 2) {
				//Alterando o valor da variável "controle" para impedir de cair no laço(loop) de repetição.
				controle = -1;
				//Instrução usada para sair do laço(loop).
				break;
			}
			//Condição criada para corrigir erro de captura do Scanner. Ocorre quando usa um método "sc.nextLine()" e em seguida o "sc.nextInt"
			//Por algum motivo esses métodos criam um conflito, sendo necessário usar a condição abaixo para corrigir as capturas de informação.
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
		}
		//Laço de repetição que permite percorrer o vetor do objeto - "foreach"
		for (Pessoa pessoa : vetorPessoas) {
			//Usando um método da linguagem java mas sobrescrito para este programa. OBS: Acesse a classe Pessoa para mais detalhes.
			System.out.println(pessoa.toString());
		}
		
		System.out.println("\n*** FIM ***");
		//Encerra o uso do Scanner no programa/aplicação.
		sc.close();

	}

}
