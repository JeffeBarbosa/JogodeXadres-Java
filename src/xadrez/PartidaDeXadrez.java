package xadrez;

import jogoDeTabuleiro.Peca;
import jogoDeTabuleiro.Posicao;
import jogoDeTabuleiro.Tabuleiro;
import pecas.xadrez.Rei;
import pecas.xadrez.Torre;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez(){
		tabuleiro = new Tabuleiro(8,8);
		setupInicial();
	}
	
	public PecaDeXadrez[][] getPecas(){
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas();i++) {
			for(int j=0;j<tabuleiro.getColunas();j++) {
				mat[i][j]=(PecaDeXadrez) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}	
	
	public PecaDeXadrez realizarMovimentoDeXadrez(PosicaoDoXadrez posicaoInicial, PosicaoDoXadrez posicaoAlvo) {
		Posicao inicial= posicaoInicial.paraPosicao();
		Posicao alvo = posicaoAlvo.paraPosicao();
		validarPosicaoDeOrigem(inicial);
		Peca pecaCapturada = fazerMovimento(inicial,alvo);
		return (PecaDeXadrez) pecaCapturada;
	}
	
	private Peca fazerMovimento(Posicao inicial, Posicao alvo) {
		Peca p= tabuleiro.removePeca(inicial);
		Peca pecaCapturada= tabuleiro.removePeca(alvo);
		tabuleiro.atribuindoPeca(p, alvo);
		return pecaCapturada;
	}
	
	private void validarPosicaoDeOrigem(Posicao posicao) {
		if(!tabuleiro.aUmaPeca(posicao)) {
			throw new XadrezException("Nao a uma peca na posicao de origem");
		}
	}
	
	
	private void colocarNovaPeca(char coluna , int linha, PecaDeXadrez peca) {
		tabuleiro.atribuindoPeca(peca, new PosicaoDoXadrez(coluna , linha).paraPosicao());
	}
	private void setupInicial() {
		colocarNovaPeca('b', 6, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('e', 8, new Rei(tabuleiro, Cor.PRETO));
		colocarNovaPeca('e', 1, new Rei(tabuleiro, Cor.BRANCO));
	}
}
