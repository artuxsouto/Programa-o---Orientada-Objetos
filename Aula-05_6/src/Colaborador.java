import java.text.SimpleDateFormat;

public class Colaborador extends Fisica {
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String ctps;
	private String pis;
	private String tituloEleitor;
	private boolean reservista;
	private String estadoCivil;
	private int numDependentes;
	private boolean ativo;
	private String setor;
	private String cargo;
	private float salario;
	private String telefone1;
	private String telefone2;
	private String emailPessoal;
	private String emailCorporativo;
	
	public Colaborador() {
		this.id = 0;
		this.nome = "";
		this.cpf = "";
		this.rg = "";
		this.genero = "";
		this.dtNascimento = null;
		this.logradouro = "";
		this.numero = 0;
		this.complemento = "";
		this.bairro = "";
		this.cep = "";
		this.cidade = "";
		this.uf = "";
		this.ctps = "";
		this.pis = "";
		this.tituloEleitor = "";
		this.reservista = false;
		this.estadoCivil = "";
		this.numDependentes = 0;
		this.ativo = false;
		this.setor = "";
		this.cargo = "";
		this.salario = 0;
		this.telefone1 = "";
		this.telefone2 = "";
		this.emailPessoal = "";
		this.emailCorporativo = "";
	}
	
	public String getCtps() {
		return ctps;
	}
	
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	
	public String getPis() {
		return pis;
	}
	
	public void setPis(String pis) {
		this.pis = pis;
	}
	
	public String getTituloEleitor() {
		return tituloEleitor;
	}
	
	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	
	public boolean isReservista() {
		return reservista;
	}
	
	public void setReservista(boolean reservista) {
		this.reservista = reservista;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public int getNumDependentes() {
		return numDependentes;
	}
	
	public void setNumDependentes(int numDependentes) {
		this.numDependentes = numDependentes;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String getTelefone1() {
		return telefone1;
	}
	
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	
	public String getTelefone2() {
		return telefone2;
	}
	
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	
	public String getEmailPessoal() {
		return emailPessoal;
	}
	
	public void setEmailPessoal(String emailPessoal) {
		this.emailPessoal = emailPessoal;
	}
	
	public String getEmailCorporativo() {
		return emailCorporativo;
	}
	
	public void setEmailCorporativo(String emailCorporativo) {
		this.emailCorporativo = emailCorporativo;
	}

	public void admitir() {
		ativo = true;		
	}
	
	public void demitir() {
		ativo = false;
	}
	
	@Override
	public String toString() {
		return "\nID: " + id + "\nNome: " + nome + "\nCPF: " + cpf + "\nRG: " + rg + "\nGenero: " + genero + "\nData de nascimento: " + sdf.format(dtNascimento) + 
				"\nCTPS: " + ctps + "\nPIS: " + pis + "\nTitulo Eleitor: " + tituloEleitor + "\nReservista: " + reservista + "\nEstado Civil: " + estadoCivil + 
				"\nNumero de dependentes: " + numDependentes + "\nStatus: " + ativo + "\nSetor: " + setor + "\nCargo: " + cargo + "\nSalario: " + 
				String.format("%.2f", salario) + "\nTelefone 1: " + telefone1 + "\nTelefone 2: " + telefone2 + "\nE-mail pessoal: " + emailPessoal + 
				"\nE-mail corporativo: " + emailCorporativo + "\n*** Dados Pessoa - Fisica ***" + "\nNome: " + nome + "\nLogradouro: " + logradouro + 
				", " + numero + "\nComplemento: " + complemento + "\nBairro: " + bairro + "\nCEP: " + cep + "\nCidade: " + cidade + "\nSigla(UF): " + uf;
	}
}
