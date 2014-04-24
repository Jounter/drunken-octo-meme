package model;

import pt.ipleiria.estg.dei.gridpanel.GridPanel;

public class Jogo extends Iteravel {
	
	private PainelPrincipal painelPrincipal;
	private PainelBonus painelBonus;
	private PainelVida painelVida;
	
	public Jogo(GridPanel gridPainelPrincipal, GridPanel gridPainelBonus,
			GridPanel gridPainelVida) {
		super();
		painelPrincipal = new PainelPrincipal(gridPainelPrincipal, this);
		painelBonus = new PainelBonus(gridPainelBonus, this);
		painelVida = new PainelVida(gridPainelVida, this);
	}

	public void iterar(long tempoInicial) {
		painelPrincipal.iterar(tempoInicial);
		painelBonus.iterar(tempoInicial);
		painelVida.iterar(tempoInicial);
	}

	public void atualizarVida() {
		painelVida.apresentarVida();
	}

}
