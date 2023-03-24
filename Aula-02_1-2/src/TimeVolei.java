
public class TimeVolei {
    private Jogador []vetorJogadores;
    private int totalJogadores;

    public TimeVolei() {
        this.vetorJogadores = new Jogador[6];
        this.totalJogadores = 0;
    }

    public void inserirJogador(String n, int i, float d) {
        if (totalJogadores < 6) {
            vetorJogadores[totalJogadores] = new Jogador(n, i, d);
            totalJogadores++;
        }
        return;
    }

    public String nomeJogadorMenorAltura() {
        float menorAltura = 999999;
        String nomeJogador = "";

        for (int i = 0; i < totalJogadores; i++) {
            if (vetorJogadores[i].retornaAltura() < menorAltura) {
                menorAltura = vetorJogadores[i].retornaAltura();
                nomeJogador = vetorJogadores[i].retornaNome();
            }
        }
        return nomeJogador;
    }

    public String nomeJogadorMaisAlto() {
        float maiorAltura = 0;
        String jogadorAlto = "";

        for (int j = 0; j < totalJogadores; j++) {
            if (vetorJogadores[j].retornaAltura() > maiorAltura) {
                maiorAltura = vetorJogadores[j].retornaAltura();
                jogadorAlto = vetorJogadores[j].retornaNome();
            }
        }
        return jogadorAlto;
    }

    public float buscandoAlturaPorIdade(int idade) {
        float altura = 0;

        for (int i = 0; i < totalJogadores; i++) {
            if ((vetorJogadores[i].retornaIdade() >= idade) && (vetorJogadores[i].retornaAltura() > altura)) {
                altura = vetorJogadores[i].retornaAltura();
            }
        }
        return altura;
    }
    
    public int buscandoQuantidadeDeJogadoresPorIdade(int idade) {
    	int contador = 0;
    	
    	for (int j = 0; j < totalJogadores; j++) {
    		if (vetorJogadores[j].retornaIdade() == idade) {
    			contador++;
    		}
    	}
    	return contador;
    }
    
    public int buscandoQuantidadeDeJogadoresPorAltura(float altura) {
    	int contador = 0;
    	
    	for (int j = 0; j < totalJogadores; j++) {
    		if (vetorJogadores[j].retornaAltura() == altura) {
    			contador++;
    		}
    	}
    	return contador;
    }
    
    public float mediaDeIdadeJogadores() {
    	float media = 0;
    	
    	for (int i = 0; i < totalJogadores; i++) {
    		media += vetorJogadores[i].retornaIdade();
    	}
    	return media / totalJogadores;
    }
    
    public float mediaDeIdadeJogadores(float altura) {
    	int media = 0;
    	int contador = 0;
    	float resultado = 0;
    	
    	for (int j = 0; j < totalJogadores; j++) {
    		if (vetorJogadores[j].retornaAltura() >= altura) {
    			media += vetorJogadores[j].retornaIdade();
    			contador++;
    		}
    	}
    	resultado = media / contador;
    	return resultado;
    }
}
