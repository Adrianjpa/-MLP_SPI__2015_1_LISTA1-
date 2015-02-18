package Loja;

public class Programa {

	private String numero;
	private String descricao;
	private int quantidade;
	private double precoPorItem;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;

	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int montante) {
		this.quantidade = montante;
	}

	public double getPrecoPorItem() {
		if (precoPorItem <= 0) precoPorItem = 0;
		return precoPorItem;
	}

	public void setPrecoPorItem(double unidade) {
		this.precoPorItem = unidade;
	}

	public double getValorFatura() {
		double valorFatura = (quantidade * precoPorItem);
		if (valorFatura <= 0) valorFatura = 0;
		return valorFatura;
	}
}

