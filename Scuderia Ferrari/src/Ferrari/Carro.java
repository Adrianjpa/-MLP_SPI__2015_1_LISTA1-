package Ferrari;

class Carro {

	 public static void main(String[] args) {

		Programa Carro = new Programa();
		
		// Aqui insere a cor da Ferrari */
		Carro.setCor(("Vermelha"));
		System.out.println("A cor de sua Ferrari � " + Carro.getCor());
		
		// Aqui insere o modelo da Ferrari */
		Carro.setModelo(("F50"));
		System.out.println("A sua Ferrari � de modelo " + Carro.getModelo());
		
		// Aqui insere a velocidade que se encontra sua Ferrari */
		Carro.setVelocidadeAtual(30);
		
		// Aqui insere o limite de velocidade da via, caso a Ferrari ultrapasse esse limite, vai ser avisado */
		Carro.setVelocidadeMaxima(80);

		//// Aqui a Ferrari ligar� */
		Carro.ligar();

		// Aqui insere a acelera��o que � um adicional a mais da velocidade atual da Ferrari  */
		Carro.acelerar(45);

	}
}
