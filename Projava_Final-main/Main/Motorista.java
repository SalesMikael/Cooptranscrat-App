package Main;

public class Motorista {
	private String nome;
	private String cpf;
	private int idade;
	private String cnh;
	
	public Motorista(String nome, String cpf, int idade, String cnh) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.cnh = cnh;
		
		
		
	}
	
	public String[] textList1() {
		String idade = this.idade+"";
		String[] w = {"Motorista:", "Nome: " +nome,"Cpf: " + cpf,"Idade: " + idade, "CNH: " +cnh};
		return w;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	
}
