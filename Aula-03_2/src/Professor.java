
public class Professor extends Pessoa {
	
	private String formacao;
	
	public Professor() {
		this.formacao = "";
	}
	
	public void definirFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public String retornarFormacao() {
		return formacao;
	}
}
