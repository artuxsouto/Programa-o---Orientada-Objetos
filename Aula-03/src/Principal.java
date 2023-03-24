
public class Principal {

	public static void main(String[] args) {
				
		PessoaFisica objFisica = new PessoaFisica("Ana Santos", 01452263562);
		PessoaJuridica objJuridica = new PessoaJuridica("Robson Silva", 888888);
		
		System.out.println("*** " + objFisica.getNome());
		System.out.println("*** " + objJuridica.getNome());

	}

}
