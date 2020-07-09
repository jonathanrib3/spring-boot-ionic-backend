package com.example.cursomc.domain.enums;

public enum EstadoPagamento {
	PENDENTE(1, "Pedido Pendente"),
	QUITADO(2, "Pedido Quitado"),
	CANCELADO(3, "Pedido Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	public String getDescricao() {
		return descricao;
	}
	
	
	//Método que percorre o objeto enum e verifica se primeiro o código é válido. Depois ve se o cod bate com algum cod do enum(1,2,3) e posteriormente retorna o objeto como o tal código.
	public static EstadoPagamento toEnum (Integer cod) {
		
		if(cod == null) {
			return null;
		}
		for(EstadoPagamento x : EstadoPagamento.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
