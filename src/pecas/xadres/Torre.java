package pecas.xadres;

import jogoDeTabuleiro.Tabuleiro;
import xadres.Cor;
import xadres.PecaDeXadres;

public class Torre extends PecaDeXadres {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}

}
