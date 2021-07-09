package jogoDeTabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if(linhas < 1 || colunas < 1) {
			throw new TabuleiroException("Erro ao criar o Tabuleiro: tabuleiro precisa ter ao minimo 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		if(!posicaoExistente(linha,coluna)) {
			throw new TabuleiroException("Posição não existe no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new TabuleiroException("Posição não existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void atribuindoPeca(Peca peca, Posicao posicao) {
		if(aUmaPeca(posicao)) {
			throw new TabuleiroException("Ja tem uma peça na posição " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()]= peca;
		peca.posicao=posicao;
	}
	
	private boolean posicaoExistente(int linha, int coluna) {
		return linha >=0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean aUmaPeca(Posicao posicao) {
		return peca(posicao) != null;
	}
}
