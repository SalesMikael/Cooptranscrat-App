package Main;

public class Topic {
	private String placa;
	private String modelo;
	private int ano;

	@Override
	public String toString(){
            return "Placa: " + placa + "\nModelo: " + modelo + "\nAno: " + ano;
	}
	
	public String[] textList() {
		String sAno = ano+"";
		String[] w = {"Veiculo: Topic", "Placa: " +placa,"Modelo: " + modelo,"Ano: " + sAno};
		return w;
	}
	
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
