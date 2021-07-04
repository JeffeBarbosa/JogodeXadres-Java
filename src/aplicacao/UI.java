package aplicacao;

import xadres.PecaDeXadres;

public class UI {

	public static void escreverTabuleiro(PecaDeXadres[][] pecas) {
		for (int i=0;i<pecas.length;i++) {
			System.out.print((8-i) + " " );
			for(int j=0; j<pecas.length;j++) {
				escreverPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void escreverPeca(PecaDeXadres peca) {
		if(peca == null) {
			System.out.print("-");
		}else{
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}
