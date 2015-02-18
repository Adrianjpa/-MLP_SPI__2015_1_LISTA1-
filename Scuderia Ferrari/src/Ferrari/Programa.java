package Ferrari;

public class Programa {

	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;

	void ligar() {
		System.out.println("O carro est� ligado");
	}

	void acelerar(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
		if (velocidadeAtual > velocidadeMaxima) {
			System.out.println("Sua velocidade � de " +velocidadeAtual+ " Km/h e est� acima do permitido da via que � de " +velocidadeMaxima+ " Km/h");
		}
		if (velocidadeAtual == 0) {
			System.out.println("Seu carro est� parado");
		}
		if (velocidadeAtual > 0 && velocidadeAtual <= velocidadeMaxima) {
			System.out.println("Sua velocidade � de " + velocidadeAtual + " Km/h");
		}
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double Atual) {
		this.velocidadeAtual = Atual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double Maxima) {
		this.velocidadeMaxima = Maxima;

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
