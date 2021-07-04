package pecas.xadres;

import jogoDeTabuleiro.Tabuleiro;
import xadres.Cor;
import xadres.PecaDeXadres;

public class Rei extends PecaDeXadres{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "R";
	}
}
