import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		ArrayList<Usuario> vetorUsuario = new ArrayList<>();
		ArrayList<Juridica> vetorJuridica = new ArrayList<>();
		
		int controle = 0;
		int idUsuario = 1;
		int idJuridica = 1;

		
		while(controle != -1) {
			System.out.print("\n*** MENU ***\n1 - Cadastrar um usuário\n2 - Cadastrar um Juridico\n3 - Sair\n\nDigite a opcao: ");
			controle = sc.nextInt();
			
			if(controle == 3) {
				controle = -1;
				break;
			}
			
			System.out.print("\nDigite o logradouro: ");
			sc.nextLine();
			String logradouro = sc.nextLine();
			
			System.out.print("\nDigite o numero: ");
			int numero = sc.nextInt();
			
			System.out.print("\nDigite o complemento: ");
			sc.nextLine();
			String complemento = sc.nextLine();
			
			System.out.print("\nDigite o bairro: ");
			String bairro = sc.nextLine();
			
			System.out.print("\nDigite o CEP: ");
			String cep = sc.nextLine();
			
			System.out.print("\nDigite a cidade: ");
			String cidade = sc.nextLine();
			
			System.out.print("\nDigite o uf: ");
			String uf = sc.nextLine();
			
			if(controle == 2) {
				System.out.print("\nDigite o nome fantasia: ");
				String nomeFantasia = sc.nextLine();
				
				System.out.print("\nDigite o CNPJ: ");
				String cnpj = sc.nextLine();
				
				System.out.print("\nDigite a inscricao estadual: ");
				String inscricaoEstadual = sc.nextLine();
				
				System.out.print("\nDigite a fundacao(dd/MM/yyyy): ");
				Date fundacao = sdf.parse(sc.nextLine());
				
				Juridica pessoaJuridica = new Juridica();
				pessoaJuridica.setId(idJuridica);
				pessoaJuridica.setNomeFantasia(nomeFantasia);
				pessoaJuridica.setLogradouro(logradouro);
				pessoaJuridica.setNumero(numero);
				pessoaJuridica.setComplemento(complemento);
				pessoaJuridica.setBairro(bairro);
				pessoaJuridica.setCep(cep);
				pessoaJuridica.setCidade(cidade);
				pessoaJuridica.setUf(uf);
				pessoaJuridica.setCnpj(cnpj);
				pessoaJuridica.setInscricaoEstadual(inscricaoEstadual);
				pessoaJuridica.setFundacao(fundacao);
				
				vetorJuridica.add(pessoaJuridica);
				idJuridica++;
				
			}
			else if(controle == 1) {
				Colaborador colaborador = new Colaborador();
				Usuario usuario = new Usuario();
				
				System.out.print("\nDigite o nome: ");
				String nome = sc.nextLine();
				
				System.out.print("\nDigite o CPF: ");
				String cpf = sc.nextLine();
				
				System.out.print("\nDigite o RG: ");
				String rg = sc.nextLine();
				
				System.out.print("\nDigite o genero: ");
				String genero = sc.nextLine();
				
				System.out.print("\nDigite a data de nascimento(dd/MM/yyyy): ");
				Date dtNascimento = sdf.parse(sc.nextLine());
				
				System.out.print("\nDigite a CTPS: ");
				String ctps = sc.nextLine();
				
				System.out.print("\nDigite o PIS: ");
				String pis = sc.nextLine();
				
				System.out.print("\nDigite o titulo de eleitor: ");
				String tituloEleitor = sc.nextLine();
				
				System.out.print("\nPossui reservista? 1 - Sim ou 2 - Não\nDigite a opcao: ");
				int controleBoolean = sc.nextInt();
				boolean reservista = false;
				
				if(controleBoolean == 1) {
					reservista = true;
				}
				
				System.out.print("\nDigite o estado civil: ");
				sc.nextLine();
				String estadoCivil = sc.nextLine();
				
				System.out.print("\nDigite a quantida de dependentes: ");
				int numDependentes = sc.nextInt();
				
				System.out.print("\nQual o status? 1 - Ativo ou 2 - Inativo\nDigite a opcao: ");
				controleBoolean = sc.nextInt();
				
				if(controleBoolean == 1) {
					colaborador.admitir();
				}
				else if(controleBoolean != 1) {
					colaborador.demitir();
				}
				
				System.out.print("\nDigite o setor: ");
				sc.nextLine();
				String setor = sc.nextLine();
				
				System.out.print("\nDigite o cargo: ");
				String cargo = sc.nextLine();
				
				System.out.print("\nDigite o salario: ");
				float salario = sc.nextFloat();
				
				System.out.print("\nDigite o Telefone 1: ");
				sc.nextLine();
				String telefone1 = sc.nextLine();
				
				System.out.print("\nDigite o Telefone 2: ");
				String telefone2 = sc.nextLine();
				
				System.out.print("\nDigite o E-mail pessoal: ");
				String emailPessoal = sc.nextLine();
				
				System.out.print("\nDigite o E-mail corporativo: ");
				String emailCorporativo = sc.nextLine();
				
				System.out.print("\nDigite o Login: ");
				String login = sc.nextLine();
				
				System.out.print("\nDigite a senha: ");
				String senha = sc.nextLine();
				
				colaborador.setId(idUsuario);
				colaborador.setNome(nome);
				colaborador.setCpf(cpf);
				colaborador.setRg(rg);
				colaborador.setGenero(genero);
				colaborador.setDtNascimento(dtNascimento);
				colaborador.setLogradouro(logradouro);
				colaborador.setNumero(numero);
				colaborador.setComplemento(complemento);
				colaborador.setBairro(bairro);
				colaborador.setCep(cep);
				colaborador.setCidade(cidade);
				colaborador.setUf(uf);
				colaborador.setCtps(ctps);
				colaborador.setPis(pis);
				colaborador.setTituloEleitor(tituloEleitor);
				colaborador.setReservista(reservista);
				colaborador.setEstadoCivil(estadoCivil);
				colaborador.setNumDependentes(numDependentes);
				colaborador.setSetor(setor);
				colaborador.setCargo(cargo);
				colaborador.setSalario(salario);
				colaborador.setTelefone1(telefone1);
				colaborador.setTelefone2(telefone2);
				colaborador.setEmailPessoal(emailPessoal);
				colaborador.setEmailCorporativo(emailCorporativo);
				
				usuario.criarUsuario(login, senha);
				usuario.setColaborador(colaborador);
				
				vetorUsuario.add(usuario);
				idUsuario++;
			}
		}
		
		for (Juridica juridica : vetorJuridica) {
			System.out.println(juridica);
		}
		
		for (Usuario usuario : vetorUsuario) {
			System.out.println(usuario);
		}
		
		System.out.println("\n*** FIM ***");
		sc.close();
	}
}
