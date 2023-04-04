
public class Contador {
	
	int contagem;
	
	public Contador() {
		this.contagem = 0;
	}
	
	public Contador(int contador) {
		this.contagem = contador;
	}

	public int getContagem() {
		return contagem;
	}

	public void setContagem(int contagem) {
		this.contagem = contagem;
	}
	
	public int incrementarContador() {
		return contagem++;
	}
	
	public int zerarContador() {
		return contagem = 0;
	}
	
	public void retornarOValorDoContador() {
		System.out.println("Contagem atual: " + contagem);
	}

}
