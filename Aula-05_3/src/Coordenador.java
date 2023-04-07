
public class Coordenador extends Professor {
	private String curso;
	
	//Construtor vazio.
	public Coordenador() {
		this.curso = "";
	}
	
	//Construtor
	public Coordenador(String nome, String cpf, double salario, String curso) {
		super(nome, cpf, salario); //Chamando o construtor da classe pai(Professor).
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}
	//Para concatenar vários elementos em um mesmo comando de escrita utiliza-se o "printf"
	public void imprime() {
		System.out.printf("%nNome: %s%nCPF: %s%nSalario: R$ %.2f%nCurso: %s%n", super.nome, super.cpf, super.salario, curso);
	}
}
