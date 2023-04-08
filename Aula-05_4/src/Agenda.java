import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		
		ArrayList<Contato> vetorContato = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int controle = 0;
		
		while(controle != -1) {
			System.out.print("*** Menu ***\n1 - Cadastrar Contato\n2 - Buscar Contato\n3 - Imprimir Agenda\n4 - Sair\n\nDigite a opcao: ");
			controle = sc.nextInt();
			
			if(controle == 4) {
				controle = -1;
				break;
			}
			else if(controle == 3) {
				for (Contato contato : vetorContato) {
					System.out.println("\nNome: " + contato.getNome() + "\nTelefone: " + contato.getTelefone());
				}
			}
			else if(controle == 2) {
				System.out.print("\nDigite o nome para busca: ");
				sc.nextLine();
				String busca = sc.nextLine();
				
				//Variável de controle do laço/loop
				boolean achou = false;
				//percorrendo o vetor de contatos
				for(int i = 0; i < vetorContato.size(); i++) {
					//Variável recebendo o retorno(true ou false) do método "equals" sobrescrito na classe Contato, 
					//onde faz a comparação entre nomes do tipo texto(String) digitado pelo usuário na variável "busca"
					//com a  posição "i" do vetor através do método "get(i).getNome()". Por fim, armazena na memória
					//o resultado para ser comparado posteriomente. 
					boolean procurando = vetorContato.get(i).getNome().equals(busca);
					//Se for verdadeiro altera o valor da váriavel "achou" para true e exibe na tela o contato procurado.
					if(procurando) {
						achou = true;
						System.out.println("*** Contato encontrado ***\nNome: " + vetorContato.get(i).getNome() + 
								"\nTelefone: " + vetorContato.get(i).getTelefone());
						//instrução para quebrar o laço/loop de repetição.
						break;
					}
				}
				//Se for falso exibe na tela a mensagem de "Contato inexistente".
				if(achou == false) {
					System.out.println("Contato inexistente");
				}
			}
			else if(controle == 1) {
				System.out.print("\nDigite o nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				
				System.out.print("\nDigite o telefone: ");
				String telefone = sc.nextLine();
				
				vetorContato.add(new Contato(nome, telefone));
				System.out.println("\nContato(" + nome + ") inserido com sucesso!");
			}
		}
		System.out.println("*** FIM ***");
		
		sc.close();
	}
}
