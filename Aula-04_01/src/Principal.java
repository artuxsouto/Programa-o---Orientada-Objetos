import java.util.Scanner;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		ArrayList<Vendedor> arrayVendedor = new ArrayList<>();
		ArrayList<Gerente> arrayGerente = new ArrayList<>();
		int controle = 0;
		
		while(controle != -1) {
			System.out.println("*** Cadastro de Funcionarios ***");
			System.out.print("\n1 - Cadastro de vendedor\n2 - Cadastro de gerente\n3 - Sair\n\nDigite a opcao: ");
			controle = sc.nextInt();
			
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			
			if(controle == 3) {
				controle = -1;
				break;
			}
			
			System.out.print("\nDigite o nome: ");
			String nome = sc.nextLine();
			
			System.out.print("\nDigite a data de nascimento(dd/MM/yyyy): ");
			Date nascimento = sdf.parse(sc.next());
			
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			
			System.out.print("\nDigite o CPF: ");
			String cpf = sc.nextLine();
			
			System.out.println("\n*** Cadastro de Endereco ***");
			
			System.out.print("\nDigite a Rua/Avenida(Logradouro): ");
			String rua = sc.nextLine();
			
			System.out.print("\nDigite o numero: ");
			int numero = sc.nextInt();
			
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			
			System.out.print("\nDigite o bairro: ");
			String bairro = sc.nextLine();
			
			System.out.print("\nDigite o cep: ");
			String cep = sc.nextLine();
			
			System.out.println("\n*** Cadastro de Cidade ***");
			
			System.out.print("\nDigite o nome da cidade: ");
			String nomeCidade = sc.nextLine();
			
			System.out.println("\n*** Cadastro do Estado ***");
			
			System.out.print("\nDigite o nome do estado: ");
			String nomeEstado = sc.nextLine();
			
			System.out.print("\nDigite a sigla do estado: ");
			String uf = sc.nextLine();
			
			Estado estado = new Estado(nomeEstado, uf);
			Cidade cidade = new Cidade(nomeCidade, estado);
			Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade);
			Funcionario funcionario = new Funcionario(nome, nascimento, cpf, endereco);
			
			if(controle == 1) {
				System.out.println("\n*** Cadastro de equipe vendas ***");
				System.out.print("\nEm qual equipe vendedor está?\nDigite o nome da equipe: ");
				String nomeEquipe = sc.nextLine();				
				
				EquipeVenda equipeVendas = new EquipeVenda(nomeEquipe);
				Vendedor vendedor = new Vendedor(funcionario, equipeVendas);
				arrayVendedor.add(vendedor);
				
			}
			else if(controle == 2) {
				Gerente gerente = new Gerente(funcionario);
				arrayGerente.add(gerente);
			}
			
		}
		
		for (Vendedor v : arrayVendedor) {
			System.out.println("\n*** Dados Funcionario - Vendedor ***\n" + v.getFuncionario().toString() +
					"\n*** Endereco ***\n" + v.getFuncionario().getEndereco().toString() + 
					"\nNome da Cidade: " + v.getFuncionario().getEndereco().getCidade().getNome() + 
					"\n*** Estado ***\n" + v.getFuncionario().getEndereco().getCidade().getEstado().toString() + 
					"\n*** Equipe ***\n" + v.getEquipeVenda().getNome());
		}
		
		for (Gerente g : arrayGerente) {
			System.out.println("\n*** Dados Funcionario - Gerente ***\n" + g.getFuncionario().toString() +
					"\n*** Endereco ***\n" + g.getFuncionario().getEndereco().toString() + 
					"\nNome da Cidade: " + g.getFuncionario().getEndereco().getCidade().getNome() + 
					"\n*** Estado ***\n" + g.getFuncionario().getEndereco().getCidade().getEstado().toString());
		}
		sc.close();
	}
}
