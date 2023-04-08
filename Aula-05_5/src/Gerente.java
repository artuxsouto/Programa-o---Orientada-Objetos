import java.text.SimpleDateFormat;
import java.util.Date;

public class Gerente extends Funcionario {
	
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Gerente() {
		this.nome = "";
		this.nascimento = null;
		this.cpf = "";
		this.endereco = null;
		this.salario = 0;
	}
	
	public Gerente(String nome, Date dtNascimento, String cpf, Endereco endereco, float salario) {
		this.nome = nome;
		this.nascimento = dtNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
		this.salario = salario;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void imprimirDadosGerente() {
		System.out.printf("Nome: %s%nData de Nascimento: %s%nCPF: %s%n*** ENDERECO ***%nNome da rua: %s, %d%nBairro: %s%nCEP: %s%n*** CIDADE ***%nNome da cidade: %s%n*** ESTADO ***%nNome do estado: %s%nSigla(UF): %s%nSalario: %.2f", nome, sdf.format(nascimento), cpf, endereco.getRua(), endereco.getNumero(), endereco.getBairro(), endereco.getCep(), endereco.getCidade().getNomeCidade(), endereco.getCidade().getEstado().getNomeEstado(), endereco.getCidade().getEstado().getSigla(), salario);
	}
}
