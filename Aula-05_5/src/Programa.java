import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ArrayList<Vendedor> vetorVendedor = new ArrayList<>();
		ArrayList<Gerente> vetorGerente = new ArrayList<>();
		
		int controle = 0;
		
		while(controle != -1) {
			System.out.print("*** MENU ***\n1 - Cadastrar Vendedor\n2 - Cadastrar Gerente\n3 - Sair.\n\nDigite opcao: ");
			controle = sc.nextInt();
			
			if(controle == 3) {
				controle = -1;
				break;
			}
			
			System.out.print("\nDigite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("\nDigite a data de nascimento(dd/MM/yyyy): ");
			Date dtNascimento = sdf.parse(sc.nextLine());
			
			System.out.print("\nDigite o cpf: ");
			String cpf = sc.nextLine();
			
			System.out.println("\n*** Dados endereco ***");
			System.out.print("\nDigite nome da rua: ");
			String nomeRua = sc.nextLine();
			
			System.out.print("\nDigite o numero: ");
			int numero = sc.nextInt();
			
			System.out.print("\nDigite o bairro: ");
			sc.nextLine();
			String bairro = sc.nextLine();
			
			System.out.print("\nDigite o CEP: ");
			String cep = sc.nextLine();
						
			System.out.print("\nDigite o nome da cidade: ");
			String nomeCidade = sc.nextLine();
			
			System.out.print("\nDigite o nome do estado: ");
			String nomeEstado = sc.nextLine();
			
			System.out.print("\nDigite a sigla do estado: ");
			String uf = sc.nextLine();
			
			Estado estado = new Estado(nomeEstado, uf);
			Cidade cidade = new Cidade(nomeCidade, estado);
			Endereco endereco = new Endereco(nomeRua, numero, bairro, cep, cidade);
			
			if(controle == 1) {
				System.out.print("\nDigite o salario: ");
				float salario = sc.nextFloat();
				
				System.out.print("\nDigite o nome da equipe: ");
				sc.nextLine();
				String nomeEquipe = sc.nextLine();
				
				EquipeVenda equipe = new EquipeVenda(nomeEquipe);
				vetorVendedor.add(new Vendedor(nome, dtNascimento, cpf, endereco, salario, equipe));
			}
			else if(controle == 2) {
				System.out.print("\nDigite o salario: ");
				float salario = sc.nextFloat();
				
				vetorGerente.add(new Gerente(nome, dtNascimento, cpf, endereco, salario));
			}
		}
		for (Vendedor vendedor : vetorVendedor) {
			System.out.println("*** Dados Vendedor ***");
			vendedor.imprimirDadosVendedor();
		}
		
		for (Gerente gerente : vetorGerente) {
			System.out.println("\n\n*** Dados Gerente ***");
			gerente.imprimirDadosGerente();
		}
		System.out.println("\n*** FIM ***");
		sc.close();
	}
}
