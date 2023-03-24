
public class Aluno extends Pessoa {
	
	private String curso;
	
	public Aluno() {
		this.curso = "";
	}
	
	public void definirCurso(String curso) {
		this.curso = curso;
	}
	
	public String retornarCurso() {
		return curso;
	}
}
