package xadres;

import jogoDeTabuleiro.Posicao;
import jogoDeTabuleiro.Tabuleiro;
import pecas.xadres.Rei;
import pecas.xadres.Torre;

public class PartidaDeXadres {

	private Tabuleiro tabuleiro;
	
	public PartidaDeXadres(){
		tabuleiro = new Tabuleiro(8,8);
		setupInicial();
	}
	
	public PecaDeXadres[][] getPecas(){
		PecaDeXadres[][] mat = new PecaDeXadres[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas();i++) {
			for(int j=0;j<tabuleiro.getColunas();j++) {
				mat[i][j]=(PecaDeXadres) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}	
	private void setupInicial() {
		tabuleiro.atribuindoPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2,1));
		tabuleiro.atribuindoPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0,4));
		tabuleiro.atribuindoPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(7,4));
	}
}
