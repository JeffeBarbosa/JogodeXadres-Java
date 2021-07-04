package aplicacao;


import xadres.PartidaDeXadres;

public class Programa {

	public static void main(String[] args) {
		
		PartidaDeXadres partidaDeXadres = new PartidaDeXadres();
		UI.escreverTabuleiro(partidaDeXadres.getPecas());
		
	}

}
