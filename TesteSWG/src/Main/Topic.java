package Main;

public class Topic {
	private String placa;
	private String modelo;
	private int ano;

	public Topic(String placa, String modelo, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
