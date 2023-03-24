
public class Principal {

    public static void main(String[] args) {

        Livro livro = new Livro("Clean Code", 310, 20);

        System.out.println("Progresso de leitura: " + livro.verificarProgresso(20, 310) + "%");

        livro.setTitulo("Codigo Limpo");
        livro.setPaginasLidas(80);

        System.out.println("Novo Progresso de leitura: " + livro.verificarProgresso(80, 310) + "%");
    }
}
