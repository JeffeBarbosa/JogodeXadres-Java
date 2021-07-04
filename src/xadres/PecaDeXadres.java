package xadres;

import jogoDeTabuleiro.Peca;
import jogoDeTabuleiro.Tabuleiro;

public class PecaDeXadres extends Peca{
	
	private Cor cor;

	public PecaDeXadres(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
}
