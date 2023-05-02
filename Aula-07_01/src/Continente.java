import java.util.ArrayList;

public class Continente {
	
	private String nome;
	private ArrayList<Pais> conjuntoDePais = new ArrayList<>();
	
	public Continente(String nomeContinente) {
		this.nome = nomeContinente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQuantidadeDePaises() {
		return conjuntoDePais.size();
	}
	
	public void adicionarPaisNoContinente(Pais pais) {
		conjuntoDePais.add(pais);
	}
	
	public String imprimirPaises() {
		String resultado = "";
		for (Pais pais : conjuntoDePais) {
			resultado += pais.getNome().toUpperCase() + " | ";
		}
		return resultado;
	}
	
	public int calcularDimensaoTotalContinente() {
		int soma = 0;
		for(int i = 0; i < conjuntoDePais.size(); i++) {
			soma += conjuntoDePais.get(i).getDimensao();
		}
		return soma;
	}
	
	public int calcularPopulacaoTotalContinente() {
		int resultado = 0;
		for(int j = 0; j < conjuntoDePais.size(); j++) {
			resultado += conjuntoDePais.get(j).getPopulacao();
		}
		return resultado;
	}
	
	public int calcularDensidadePopulacionalContinente() {
		int resultado = 0;
		if(conjuntoDePais.size() != 0) {
			resultado = calcularPopulacaoTotalContinente() / calcularDimensaoTotalContinente();
		}
		return resultado;
	}
	
	public String consultaDePaisComMaiorPopulacao() {
		String nomeDoPais = "";
		int populacao = 0;
		for(int x = 0; x < conjuntoDePais.size(); x++) {
			if(populacao < conjuntoDePais.get(x).getPopulacao()) {
				populacao = conjuntoDePais.get(x).getPopulacao();
				nomeDoPais = conjuntoDePais.get(x).getNome();
			}
		}
		return nomeDoPais;
	}
	
	public String consultaDePaisComMenorPopulacao() {
		String nomeDoPais = "";
		int populacao = 2147483647;
		for(int x = 0; x < conjuntoDePais.size(); x++) {
			if(populacao > conjuntoDePais.get(x).getPopulacao()) {
				populacao = conjuntoDePais.get(x).getPopulacao();
				nomeDoPais = conjuntoDePais.get(x).getNome();
			}
		}
		return nomeDoPais;
	}
	
	public String consultaDePaisComMaiorDimensaoTerritorial() {
		String nomeDoPais = "";
		int dimensao = 0;
		for(int z = 0; z < conjuntoDePais.size(); z++) {
			if(dimensao < conjuntoDePais.get(z).getDimensao()) {
				dimensao = conjuntoDePais.get(z).getDimensao();
				nomeDoPais = conjuntoDePais.get(z).getNome();
			}
		}
		return nomeDoPais;
	}
	
	public String consultaDePaisComMenorDimensaoTerritorial() {
		String nomeDoPais = "";
		int dimensao = 2147483647;
		for(int z = 0; z < conjuntoDePais.size(); z++) {
			if(dimensao > conjuntoDePais.get(z).getDimensao()) {
				dimensao = conjuntoDePais.get(z).getDimensao();
				nomeDoPais = conjuntoDePais.get(z).getNome();
			}
		}
		return nomeDoPais;
	}
	
	public String relatorio() {
		String relatorio = "";
		if(conjuntoDePais.size() == 0) {
			String antartida = "ANTARTIDA";
			if(antartida.equals(nome)) {
				relatorio = "CONTINENTE: " + nome + " *** PROPRIEDADE DA HUMANIDADE ONDE NINGUÉM PODE EXPLORAR SEUS RECURSOS ***";
			}
			else if(nome != antartida.toUpperCase()) {
				relatorio = "CONTINENTE: " + nome + " - NADA INFORMADO";
			}
		}
		else if(conjuntoDePais.size() != 0) {
			relatorio = "CONTINENTE: " + nome + "\n- PAISES: " + imprimirPaises() + "\n*** INFORMACOES DO CONTINENTE ***" + "\n- DIMENSAO TOTAL DO CONTINENTE: " + calcularDimensaoTotalContinente() + 
					"Km²" + "\n- POPULACAO TOTAL DO CONTINENTE: " + calcularPopulacaoTotalContinente() + "\n- DENSIDADE POPULACIONAL: " + calcularDensidadePopulacionalContinente() + "Km²" + 
					"\n- PAIS COM MAIOR POPULACAO: " + consultaDePaisComMaiorPopulacao() + "\n- PAIS COM MENOR POPULACAO: " + consultaDePaisComMenorPopulacao() + 
					"\n- PAIS COM MAIOR DIMENSAO TERRITORIAL: " + consultaDePaisComMaiorDimensaoTerritorial() +  "\n- PAIS COM MENOR DIMENSAO TERRITORIAL: " + consultaDePaisComMenorDimensaoTerritorial();	
		}
		return relatorio;
	}
}
