import java.util.ArrayList;

public class RevistaCientifica {
    private String titulo;
    private int numero;
    private ArrayList<Edicao> arrayEdicao = new ArrayList<Edicao>();

    public RevistaCientifica(String t, int n) {
        this.titulo = t;
        this.numero = n;
    }
    
    public String retornaTitulo() {
    	return titulo;
    }
    
    public int retornaNumero() {
    	return numero;
    }

    public void inserirEdicao(Edicao objEdicao) {
        arrayEdicao.add(objEdicao);
    }

    public ArrayList<Edicao> getEdicao() {
        return arrayEdicao;
    }
}
