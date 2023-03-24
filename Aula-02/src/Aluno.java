
public class Aluno {

    private String nome;
    private double nota1, nota2, nota3;

    public Aluno(String n, double n1, double n2, double n3) {
        this.nome = n;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public String retornaNome() {
        return nome;
    }

    public double retornaNota1() {
        return nota1;
    }

    public double retornaNota2() {
        return nota2;
    }

    public double retornaNota3() {
        return nota3;
    }

    public double somar() {
        double soma = nota1 + nota2 + nota3;
        return soma;
    }

    public double calculaMedia() {
        double media = somar() / 3;
        return media;
    }

    public String resultadoFinal() {
        String resultado = "";
        double media = calculaMedia();

        if (media >= 6) {
            resultado = "Aprovado";
        }
        else if ((media >= 4) && (media < 6)) {
            resultado = "Recuperacao";
        }
        else {
            resultado = "Reprovado";
        }
        return resultado;
    }
}
