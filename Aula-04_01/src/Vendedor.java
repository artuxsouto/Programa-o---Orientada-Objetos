
public class Vendedor {
	
	private Funcionario funcionario;
	private EquipeVenda equipeVenda = new EquipeVenda();	
	
	public Vendedor() {
		
	}
	
	public Vendedor(Funcionario funcionario, EquipeVenda equipeVenda) {
		this.funcionario = funcionario;
		this.equipeVenda = equipeVenda;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public EquipeVenda getEquipeVenda() {
		return equipeVenda;
	}

	public void setEquipeVenda(EquipeVenda equipeVenda) {
		this.equipeVenda = equipeVenda;
	}

	public float getSalario() {
		float salario = 0;
		return salario;
	}
}
