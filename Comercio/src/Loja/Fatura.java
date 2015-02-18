package Loja;

public class Fatura {

	public static void main (String[] args) {
		
		Programa conta = new Programa();
		
		// Aqui coloca o número da sua fatura */
		conta.setNumero("23465");
		System.out.println("O número da sua fatura: "+conta.getNumero());
		
		// Aqui coloca o tipo do Produto */
		conta.setDescricao("Mouse");
		System.out.println("Produtos da sua fatura: "+conta.getDescricao());
		
		// Aqui coloca o preço da unidade do Produto */
		conta.setPrecoPorItem(3);
		System.out.printf("Preço do seu produto: R$ %.2f\n" ,conta.getPrecoPorItem());
		
		// Aqui coloca a quantidade dos Produtos */
		conta.setQuantidade(4);
		System.out.println("Quantidade de itens que você comprou: "+conta.getQuantidade());
		
		conta.getValorFatura();
		
		// Aqui mostrará o resultado total da fatura */
		System.out.printf("O Total da sua fatura esse mês: R$ %.2f\n" , conta.getValorFatura());
		
	}
	
}