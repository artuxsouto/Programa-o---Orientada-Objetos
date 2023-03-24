
public class Principal {

    public static void main(String[] args) {

        Retangulo objetoRetangulo = new Retangulo(10 , 5);

        System.out.println("Area do retangulo: " + objetoRetangulo.calcularArea(10, 5));
        System.out.println("Perimetro do retangulo: " + objetoRetangulo.calcularPerimetro(10, 5));
    }
}
