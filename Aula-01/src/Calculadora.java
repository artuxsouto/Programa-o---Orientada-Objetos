
public class Calculadora {
    private int numero1, numero2, numero3;

    public Calculadora(int n1, int n2, int n3) {
        this.numero1 = n1;
        this.numero2 = n2;
        this.numero3 = n3;
    }

    public int somar() {
        int soma = numero1 + numero2 + numero3;
        return soma;
    }

    public int calcularMedia() {
        int media = somar() / 3;
        return media;
    }

    public int subtrair() {
        int sub;

        if ((numero1 > numero2) && (numero1 > numero3)) {
            sub = numero1 - numero2 - numero3;
        }
        else if ((numero2 > numero1) && (numero2 > numero3)) {
            sub = numero2 - numero1 - numero3;
        }
        else {
            sub = numero3 - numero1 - numero2;
        }
        return sub;
    }

    public int multiplicar() {
        int multi;

        if ((numero1 > numero2) && (numero1 > numero3)) {
            multi = numero1 * numero2 * numero3;
        }
        else if ((numero2 > numero1) && (numero2 > numero3)) {
            multi = numero2 * numero1 * numero3;
        }
        else {
            multi = numero3 * numero1 * numero2;
        }
        return multi;
    }
}
