import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Livro livro = new Livro("Harry Potter", 400);
		
		System.out.println("*** Dados do livro cadastrado ***");
		System.out.println("Titulo: " + livro.getTitulo() + "\nQuantidade de Paginas: " + livro.getQtdPaginas());
		
		livro.verificarProgresso();
		
		System.out.print("\n*** Alterando Titulo do Livro ***\nDigite o novo titulo: ");
		String titulo = sc.nextLine();
		
		System.out.print("\n*** Alterando Quantidade de Paginas Livro ***\nDigite a nova quantidade de paginas: ");
		int qtdPaginas = sc.nextInt();
		
		livro = new Livro(titulo, qtdPaginas);
		
		System.out.print("\nDigite a qtd de paginas lidas: ");
		int paginasLidas = sc.nextInt();
		livro.setPaginasLidas(paginasLidas);
		
		livro.verificarProgresso();
		
		sc.close();

	}

}
