package xadres;

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
	
	private void colocarNovaPeca(char coluna , int linha, PecaDeXadres peca) {
		tabuleiro.atribuindoPeca(peca, new PosicaoDoXadres(coluna , linha).paraPosicao());
	}
	private void setupInicial() {
		colocarNovaPeca('b', 6, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('e', 8, new Rei(tabuleiro, Cor.PRETO));
		colocarNovaPeca('e', 1, new Rei(tabuleiro, Cor.BRANCO));
	}
}
