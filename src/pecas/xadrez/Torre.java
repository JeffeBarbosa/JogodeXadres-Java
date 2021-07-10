package pecas.xadrez;

import jogoDeTabuleiro.Posicao;
import jogoDeTabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class Torre extends PecaDeXadrez {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		Posicao p = new Posicao(0,0);
		
		//Mover para cima
		p.setValores(posicao.getLinha() - 1, posicao.getColuna());
		while (getTabuleiro().posicaoExistente(p) && !getTabuleiro().aUmaPeca(p)){
			mat[p.getLinha()][p.getColuna()] = true;
			p.setLinha(p.getLinha() - 1);
		}
		if(getTabuleiro().posicaoExistente(p) && umaPecaDoOponente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		//Mover para a esquerda
		p.setValores(posicao.getLinha(), posicao.getColuna() -1 );
		while (getTabuleiro().posicaoExistente(p) && !getTabuleiro().aUmaPeca(p)){
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() - 1);
		}
		if(getTabuleiro().posicaoExistente(p) && umaPecaDoOponente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		//Mover para a direita
		p.setValores(posicao.getLinha(), posicao.getColuna() + 1 );
		while (getTabuleiro().posicaoExistente(p) && !getTabuleiro().aUmaPeca(p)){
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() + 1);
		}
		if(getTabuleiro().posicaoExistente(p) && umaPecaDoOponente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		//Mover para baixo
		p.setValores(posicao.getLinha() + 1, posicao.getColuna());
		while (getTabuleiro().posicaoExistente(p) && !getTabuleiro().aUmaPeca(p)){
			mat[p.getLinha()][p.getColuna()] = true;
			p.setLinha(p.getLinha() + 1);
		}
		if(getTabuleiro().posicaoExistente(p) && umaPecaDoOponente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		return mat;
	}
	

}
