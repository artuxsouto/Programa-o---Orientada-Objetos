
public class Retangulo {
    private double lado1, lado2, area, perimetro;

    public Retangulo() {
        this.lado1 = 0;
        this.lado2 = 0;
        this.area = 0;
        this.perimetro = 0;
    }

    public Retangulo(double l1, double l2) {
        this.lado1 = l1;
        this.lado2 = l2;
    }
    
    public double calcularArea(double l1, double l2) {
        area = lado1 * lado2;
        return area;
        
    }

    public double calcularPerimetro(double l1, double l2) {
        perimetro = (l1 * 2) + (l2 * 2);
        return perimetro;
    }
}
