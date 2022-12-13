package Main;

public class Viagem {

	private String cidadeOrigem;
	private String ciadeDestino;
	private double preco;
	private String horaSaida;
	private String horaChegada;
	
	public Viagem(String cidadeOrigem, String ciadeDestino, double preco, String horaSaida, String horaChegada) {
		this.cidadeOrigem = cidadeOrigem;
		this.ciadeDestino = ciadeDestino;
		this.preco = preco;
		this.horaSaida = horaSaida;
		this.horaChegada = horaChegada;
	}

	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getCiadeDestino() {
		return ciadeDestino;
	}

	public void setCiadeDestino(String ciadeDestino) {
		this.ciadeDestino = ciadeDestino;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public String getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}

}
