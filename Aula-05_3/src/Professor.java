
public class Professor extends Pessoa {
	protected double salario;
	
	//Construtor vazio.
	public Professor() {
		this.salario = 0.00;
	}
	
	//Construtor
	public Professor(String nome, String cpf, double salario) {
		super(nome, cpf); // chamando o construtor da classe pai(Pessoa).
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
	
	//Para concatenar vários elementos em um mesmo comando de escrita utiliza-se o "printf"
	public void imprime() {
		System.out.printf("%nNome: %s%nCPF: %s%nSalario: R$ %.2f%n", super.nome, super.cpf, salario);
	}
}
