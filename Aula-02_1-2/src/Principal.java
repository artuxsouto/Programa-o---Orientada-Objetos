import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TimeVolei objetoTime = new TimeVolei();

        objetoTime.inserirJogador("Leandro", 33, (float) 2.03);
        objetoTime.inserirJogador("Artur", 28, (float) 1.97);
        objetoTime.inserirJogador("Roberto", 20, (float) 1.82);
        objetoTime.inserirJogador("Danilo", 30, (float) 2.08);
        objetoTime.inserirJogador("Leonardo", 36, (float) 1.91);
        objetoTime.inserirJogador("Kaique", 27, (float) 1.95);

        System.out.println("O jogador com a menor altura é: " + objetoTime.nomeJogadorMenorAltura());
        System.out.println("O jogador com a maior altura é: " + objetoTime.nomeJogadorMaisAlto());
        
        System.out.println("*** Buscando a maior altura, apartir de uma idade ***\n");
        
        System.out.print("\nDigite a idade: ");
        int idade = sc.nextInt();
        
        System.out.println("\nMaior altura: " + objetoTime.buscandoAlturaPorIdade(idade));
        
        System.out.println("*** Buscando a quantidade de jogadores que tem uma determinada idade ***\n");
        
        System.out.print("\nDigite a idade: ");
        idade = sc.nextInt();
        
        System.out.println("Quantidade de jogadores: " + objetoTime.buscandoQuantidadeDeJogadoresPorIdade(idade));
        
        System.out.println("\n*** Buscando a quantidade de jogadores que possui a altura maior que um determinado valor ***");
        
        System.out.print("\nDigite a altura: ");
        float altura = sc.nextFloat();
        
        System.out.println("\nQuantidade de jogadores: " + objetoTime.buscandoQuantidadeDeJogadoresPorAltura(altura));
        
        System.out.println("\nMedia de idade dos jogadores: " + objetoTime.mediaDeIdadeJogadores());
        
        System.out.println("\n*** Saber a media de jogadores que tem acima de um determinada altura ***");
        
        System.out.print("\nDigite altura: ");
        altura = sc.nextFloat();
        
        System.out.println("\nMedia de idade dos jogadores: " + objetoTime.mediaDeIdadeJogadores(altura));
        
        
        sc.close();
    }
}
