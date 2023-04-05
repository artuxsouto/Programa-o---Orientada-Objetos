import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

public class Pessoa {
	//Permite personalizar a saída do tipo Date(data) - Pra isso importe a java.text.SimpleDateFormat e instancie um objeto.
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
	
	//Exibir data atual - Para exibir a data atual, importe a java.time.LocalDateclasse e use seu now()método.
	private LocalDate minhaData = LocalDate.now();
	private String nome;
	private Date dtNascimento;
	private int idade;
	private Universidade universidade;
	
	//Construtor vazio - Usado para instanciar(reservar um espaço na memória) com valores vazios ou null(nulo).
	public Pessoa() {
		this.nome = ""; //Recebendo o valor vazio.
		this.dtNascimento = null; //Recebendo o valor nulo.
		this.universidade = null; //Recebendo o valor nulo.
	}
	
	//Construtor - Atribuindo(Alimentando) valores com variável através dos argumentos passados.
	public Pessoa(String nome, Date dtNascimento, Universidade universidade) {
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.universidade = universidade;
	}
	
	//Método para calcular idade
	public int calculoIdade() {
		//Variável(anoNascimento) do tipo inteiro(int) recebe o método(Integer.parseInt) da linguagem java.
		//Onde converte os tipos texto(String) para o tipo inteiro(int). Passando o argumento(sdf1.format)
		//torna-se possível capturar apenas o ano contido na variável(dtNascimento) e convertendo o tipo Date(data) 
		//para o formato de texto(String).
		
		//Ex: Date dtNascimento = 01/01/2000
		//sdf1.format(Date dtNascimento =  String 2000) -> Captura apenas o ano e altera o tipo da variável para texto(String).
		//Integer.parseInt(String 2000 = int 2000) -> Converte o tipo texto(String) para inteiro(int).		
		int anoNascimento = Integer.parseInt(sdf1.format(dtNascimento));
		//Capturando apenas o ano atual através do método(.getYear).
		int anoAtual = minhaData.getYear();
		//calculando a idade através do ano atual com o ano de nascimento.
		int resultado = anoAtual - anoNascimento;
		//Retornando o resultado, onde o método foi chamado.
		return resultado;
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
	
	//Método da linguagem java que retorna o valor de um objeto String. Uma boa prática é utilizar o @Override 
	//Para sinalizar que o método pertencem a linguagem e sobrescrito para ser usado no programa/aplicação.	
	@Override
	public String toString() {
		return "\n***Universidade - " + universidade.retornaNomeUniversidade() + " ***\nNome: " + nome + 
				"\nIdade: " + calculoIdade() + "\nData de nascimento: " + sdf.format(dtNascimento);
	}
		
}
