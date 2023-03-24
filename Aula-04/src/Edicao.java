import java.util.ArrayList;

public class Edicao {
	
    private int numero;
    private ArrayList<Artigo> arrayArtigo = new ArrayList<Artigo>();
    
    public Edicao(int n) {
    	this.numero = n;
    }
    
    public void inserirArtigo(String t) {
    	Artigo objArtigo = new Artigo(t);
    	arrayArtigo.add(objArtigo);
    }
    
    public ArrayList<Artigo> getArrayArtigo() {
    	return arrayArtigo;
    }
    
    public int getNumero() {
    	return numero;
    }

}
