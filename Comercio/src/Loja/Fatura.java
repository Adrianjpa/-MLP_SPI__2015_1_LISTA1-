package Loja;

public class Fatura {

	public static void main (String[] args) {
		
		Programa conta = new Programa();
		
		// Aqui coloca o n�mero da sua fatura */
		conta.setNumero("23465");
		System.out.println("O n�mero da sua fatura: "+conta.getNumero());
		
		// Aqui coloca o tipo do Produto */
		conta.setDescricao("Mouse");
		System.out.println("Produtos da sua fatura: "+conta.getDescricao());
		
		// Aqui coloca o pre�o da unidade do Produto */
		conta.setPrecoPorItem(3);
		System.out.printf("Pre�o do seu produto: R$ %.2f\n" ,conta.getPrecoPorItem());
		
		// Aqui coloca a quantidade dos Produtos */
		conta.setQuantidade(4);
		System.out.println("Quantidade de itens que voc� comprou: "+conta.getQuantidade());
		
		conta.getValorFatura();
		
		// Aqui mostrar� o resultado total da fatura */
		System.out.printf("O Total da sua fatura esse m�s: R$ %.2f\n" , conta.getValorFatura());
		
	}
	
}