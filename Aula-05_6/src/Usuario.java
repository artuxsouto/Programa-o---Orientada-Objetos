
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
	
	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
		
	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public void editarPerfil() {
		
	}
	
	public void alterarSenha() {
		
	}
	
	public void criarUsuario() {
		
	}
	
	public void apagarUsuario() {
		
	}
	
	@Override
	public String toString() {
		return "\n*** Dados Usuário ***\nLogin: " + login + "\nSenha: " + senha + 
				"\nPermissao: " + permissao + "\n*** Dados Colaborador ***" + colaborador;
	}
}
