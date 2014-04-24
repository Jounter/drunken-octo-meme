package model;

import pt.ipleiria.estg.dei.gridpanel.CellRepresentation;
import pt.ipleiria.estg.dei.gridpanel.SingleImageCellRepresentation;

public class Vida extends Iteravel {
	private String nomeImagem;
	private long tempoActual;
	private int nivelVida;


	public Vida() {
		super();
		this.nomeImagem = "/imagens/vida_20.png";
		this.nivelVida = 20;
		tempoActual = System.currentTimeMillis();
	}

	public CellRepresentation getCellRepresentation() {
		return new SingleImageCellRepresentation(nomeImagem);
	}
	
	public void atualizaVida (long tempoInicial) {
		if (tempoInicial-tempoActual > 2000 && nivelVida > 0) {
			nivelVida --;
			nomeImagem = "/imagens/vida_"+ nivelVida +".png";
			tempoActual = tempoInicial;
		}
	}
	
	public void iterar(long tempoInicial) {
		atualizaVida(tempoInicial);
	}
}
