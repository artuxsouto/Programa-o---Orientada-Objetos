
public class Jogador {

    private String nome;
    private int idade;
    private float altura;

    public Jogador(String n, int i, float a) {
        this.nome = n;
        this.idade = i;
        this.altura = a;
    }

    public String retornaNome() {
        return nome;
    }

    public int retornaIdade() {
        return idade;
    }

    public float retornaAltura() {
        return altura;
    }
}
