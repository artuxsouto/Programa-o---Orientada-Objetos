
public class Livro {
    private String titulo;
    private Integer qtdPaginas;
    private Integer paginasLidas;

    public Livro() {
        this.titulo = "";
        this.qtdPaginas = 0;
        this.paginasLidas = 0;
    }

    public Livro(String n, Integer qP, Integer pL) {
        this.titulo = n;
        this.qtdPaginas = qP;
        this.paginasLidas = pL;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getQtdPaginas() {
        return qtdPaginas;
    }

    public Integer getPaginasLidas() {
        return paginasLidas;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public void setQtdPaginas(Integer qP) {
        this.qtdPaginas = qP;
    }

    public void setPaginasLidas(Integer pL) {
        this.paginasLidas = pL;
    }

    public Integer verificarProgresso(Integer pL, Integer qP) {
        Integer porcentagem = pL * 100 / qP;
        return porcentagem;
    }
}
