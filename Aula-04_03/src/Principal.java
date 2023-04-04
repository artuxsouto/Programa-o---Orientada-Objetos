import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Fisica> arrayPessoaFisica = new ArrayList<>();
		ArrayList<Juridica> arrayPessoaJuridica = new ArrayList<>();
		ArrayList<Colaborador> arrayColaborador = new ArrayList<>();
		
		int controle = 0;
		
		System.out.println("*** Cadastrar pessoas - Fisica, Juridica ou Colaborador ***");
		
		while(controle != -1) {
			System.out.print("*** Menu ***\n1 - Pessoa Fisica\n2 - Pessoa Juridica\n3 - Colaborador\n4 - Sair\n\nDigite a opcao: ");
			controle = sc.nextInt();
			
			if(controle == 4) {
				controle = -1;
				break;
			}
			
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			
			Pessoa pessoa = new Pessoa();
			
			System.out.print("\nDigite o id: ");
			int id = sc.nextInt();
			pessoa.setId(id);
			System.out.print("\nDigite o nome: ");
			String nome = sc.nextLine();
			pessoa.setNome(nome);
			System.out.print("\nDigite o nome fantasia: ");
			String nomeFantasia = sc.nextLine();
			pessoa.setNomeFantasia(nomeFantasia);
			System.out.print("\nDigite o logradouro: ");
			String logradouro = sc.nextLine();
			pessoa.setLogradouro(logradouro);
			System.out.print("\nDigite o numero: ");
			int numero = sc.nextInt();
			pessoa.setNumero(numero);
			System.out.print("\nDigite o complemento: ");
			String complemento = sc.nextLine();
			pessoa.setComplemento(complemento);
			System.out.print("\nDigite o bairro: ");
			String bairro = sc.nextLine();
			pessoa.setBairro(bairro);
			System.out.print("\nDigite o CEP: ");
			String cep = sc.nextLine();
			pessoa.setCep(cep);
			System.out.print("\nDigite a cidade: ");
			String cidade = sc.nextLine();
			pessoa.setCidade(cidade);
			System.out.print("\nDigite o UF: ");
			String uf = sc.nextLine();
			pessoa.setUf(uf);
			
			
			if(controle == 1) {
				
			}
			else if(controle == 2) {
				
			}
			else if(controle == 3) {
				
			}
			
			
		}
		
		System.out.println("\n\n*** FIM ***");
		
		sc.close();
	}

}
