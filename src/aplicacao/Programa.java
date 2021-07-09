package aplicacao;


import java.util.Scanner;

import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.PosicaoDoXadrez;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		
		while(true) {
			UI.escreverTabuleiro(partidaDeXadrez.getPecas());
			System.out.println();
			System.out.print("Origem: ");
			PosicaoDoXadrez origem = UI.lerPosicaoDeXadrez(sc);
			
			System.out.println();
			System.out.print("Destino: ");
			PosicaoDoXadrez destino = UI.lerPosicaoDeXadrez(sc);
			
			PecaDeXadrez pecaCapturada = partidaDeXadrez.realizarMovimentoDeXadrez(origem, destino);
		}
	}
}
