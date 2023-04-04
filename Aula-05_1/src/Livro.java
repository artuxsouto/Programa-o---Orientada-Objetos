
public class Livro {
	
	private String titulo;
	private Integer qtdPaginas;
	private Integer paginasLidas;
	
	public Livro() {
		this.titulo = "";
		this.qtdPaginas = 0;
		this.paginasLidas = 0;
	}
	
	public Livro(String nome, Integer qtdPaginas) {
		this.titulo = nome;
		this.qtdPaginas = qtdPaginas;
		this.paginasLidas = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(Integer qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public Integer getPaginasLidas() {
		return paginasLidas;
	}

	public void setPaginasLidas(Integer paginasLidas) {
		this.paginasLidas = paginasLidas;
	}
	
	public void verificarProgresso() {
		int porcentagem = (paginasLidas * 100) / qtdPaginas;
		System.out.println("Você já leu " + porcentagem + "% do livro(" + titulo + ").");
	}
	
}
