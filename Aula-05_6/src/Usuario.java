
public class Usuario {
	private String login;
	private String senha;
	private String permissao;
	private Colaborador colaborador;
	
	public Usuario() {
		this.login = "";
		this.senha = "";
		this.permissao = "";
		this.colaborador = null;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getPermissao() {
		return permissao;
	}
		
	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public void editarPerfil(Colaborador colaborador, String nome) {
		String nomeAntigo = colaborador.nome;
		colaborador.nome = nome;
		System.out.println("Nome atualizado de: " + nomeAntigo + " para: " + nome);
	}
	
	public void alterarSenha(String senha) {
		this.senha = senha;
		System.out.println("Senha alterada para => " + senha);
	}
	
	public void criarUsuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
		this.permissao = "Autorizado";
	}
	
	public void apagarUsuario() {
		this.permissao = "Negado";		
	}
	
	@Override
	public String toString() {
		return "\n*** Dados Usuário ***\nLogin: " + login + "\nSenha: " + senha + 
				"\nPermissao: " + permissao + "\n*** Dados Colaborador ***" + colaborador;
	}
}
