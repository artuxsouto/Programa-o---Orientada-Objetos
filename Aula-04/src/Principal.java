import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    	
    	RevistaCientifica objRevista = new RevistaCientifica("Ciência e Tecnolocia", 563);
    	
    	int numero = 0;
    	String titulo = "";
    	Scanner sc = new Scanner(System.in);
    	
    	while(numero != -1) {
    		System.out.println("*** Cadastro de Edição ***\n");
    		System.out.print("\nDigite o numero da Edicao: ");
    		numero = sc.nextInt();
    		
    		if(sc.hasNextLine()) {
    			sc.nextLine();
    		}
    		
    		if (numero == -1) {
    			break;
    		}
    		
    		Edicao objEdicao = new Edicao(numero);
    		
    		System.out.println("\n*** Cadastro dos Artigos ***\n");
    		for (int i = 0; i < 5; i++) {
    			System.out.print("\nDigite o titulo do artigo " + (i + 1) +": ");
    			titulo = sc.nextLine();
    			
    			objEdicao.inserirArtigo(titulo);
    		}
    		objRevista.inserirEdicao(objEdicao);
    	}
    	
    	System.out.print("\n*** Conteudo da Revista ***");
    	for (Edicao edicao : objRevista.getEdicao()) {
    		System.out.print("\n*** Edicao: " + edicao.getNumero());
    		
    		for (Artigo artigo : edicao.getArrayArtigo()) {
    			System.out.print("\n*** Artigo: " + artigo.getTitulo());
        	}
    	}
    	
    	sc.close();

    }
    
}
