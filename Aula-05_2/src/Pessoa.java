import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
	
	private String nome;
	private Date dtNascimento;
	private int idade;
	private Universidade universidade;
	
	public Pessoa(String nome, Date dtNascimento, Universidade universidade) {
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.idade = 0;
		this.universidade = universidade;
	}
	
	public int calculoIdade(int ano) {		
		int anoNascimento = Integer.parseInt(sdf1.format(dtNascimento));
		int idadeAtual = ano - anoNascimento;
		return idadeAtual;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Universidade getUniversidade() {
		return universidade;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nData de nascimento: " + sdf.format(dtNascimento) + 
				"\nUniversidade: " + universidade;
	}
		
}
