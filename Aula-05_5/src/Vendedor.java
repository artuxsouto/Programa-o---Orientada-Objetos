import java.text.SimpleDateFormat;
import java.util.Date;

public class Vendedor extends Funcionario {
	private EquipeVenda equipe;
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Vendedor() {
		this.nome = "";
		this.nascimento = null;
		this.cpf = "";
		this.endereco = null;
		this.salario = 0;
		this.equipe = null;
	}
	
	public Vendedor(String nome, Date dtNascimento, String cpf, Endereco endereco, float salario, EquipeVenda equipe) {
		this.nome = nome;
		this.nascimento = dtNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
		this.salario = salario;
		this.equipe = equipe;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public EquipeVenda getEquipe() {
		return equipe;
	}
	
	/*public void imprimirDadosVendedor() {
		System.out.printf("Equipe: %s%nNome: %s%nData de Nascimento: %s%nCPF: %s%n*** ENDERECO ***%nNome da rua: %s, %d%nBairro: %s%nCEP: %s%n*** CIDADE ***%nNome da cidade: %s%n*** ESTADO ***%nNome do estado: %s%nSigla(UF): %s%nSalario: %.2f", equipe.getNomeEquipe(), nome, sdf.format(nascimento), cpf, endereco.getRua(), endereco.getNumero(), endereco.getBairro(), endereco.getCep(), endereco.getCidade().getNomeCidade(), endereco.getCidade().getEstado().getNomeEstado(), endereco.getCidade().getEstado().getSigla(), salario);
	}*/
	
	@Override
	public String toString() {
		return "\n*** DADOS DO FUNCIONARIO - Equipe: " + equipe.getNomeEquipe() +" ***\nNome: " + nome + "\nData de Nascimento: " + 
				sdf.format(nascimento) + "\nCPF: " + cpf + "\nSalario: " + String.format("%.2f", salario) + "\n*** DADOS ENDERECO ***" + endereco;
	}
}