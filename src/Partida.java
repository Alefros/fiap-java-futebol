package src;

import java.util.Calendar;

class Partida {
	public static void main(String[] args) {

		Calendar fundacaoCorinthians = Calendar.getInstance();
		fundacaoCorinthians.set(Calendar.YEAR, 1910);
		Clube corinthians = new Clube("Corinthians", "Gavião", fundacaoCorinthians);

		Calendar fundacaoPalmeiras = Calendar.getInstance();
		fundacaoPalmeiras.set(Calendar.YEAR, 1910);
		Clube palmeiras = new Clube("Palmeiras", "Porco", fundacaoPalmeiras);

		System.out.println(palmeiras.getMascote());
		System.out.println(corinthians.getMascote());
	}
}