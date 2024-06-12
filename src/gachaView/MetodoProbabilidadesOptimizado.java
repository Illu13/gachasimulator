package gachaView;

import utils.Utils;

public class MetodoProbabilidadesOptimizado {

	public static void main(String[] args) {

		String[] probAlta = new String[] { "Fofana", "Gabriel Strefezza", "Ter Stegen", "Pepe", "Alisson", "Esmolin",
				"Oblik Oblak", "El Sobrez", "Payet", "El Matip" };
		String[] probMedia = new String[] { "JFlop", "Axel Zabel", "Di Flop", "Samflop", "Hermaflopder",
				"De Brain Yeism", "POV EL COLEGA GPY SEXAZO", };
		String[] probBaja = new String[] { "Mona", "Live Slug Reaction", "Mondoflop", "Jalando", "Nanoismo" };
		String[] pity = new String[] { "EL BOMBARDÓ", "EL BICHO" };
		String[][] grupos = new String[][] { probAlta, probMedia, probBaja, pity };

		int probs = Utils.obtenerNumeroAzar(0, 1000);

		switch ((0 <= probs && probs <= 646) ? 0
				: (647 <= probs && probs <= 947) ? 1
						: (948 <= probs && probs <= 997) ? 2 : (998 <= probs && probs <= 1001) ? 3 : 4) {
		case 0:
			System.out.println(probAlta[Utils.obtenerNumeroAzar(0, 9)]);
			break;
		case 1:
			System.out.println(probMedia[Utils.obtenerNumeroAzar(0, 6)]);
			break;
		case 2:
			System.out.println(probBaja[Utils.obtenerNumeroAzar(0, 4)]);
			break;
		case 3:
			System.out.println(pity[Utils.obtenerNumeroAzar(0, 1)]);
		}

	}

}
