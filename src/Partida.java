package src;
class Partida {
	public static void main(String[] args) {
		Clube corinthians = new Clube("Corinthians", "Gaviao", 1910);
		Clube palmeiras = new Clube("Palmeiras", "Porco", 1915);

		System.out.println(palmeiras.getMascote());
	}
}