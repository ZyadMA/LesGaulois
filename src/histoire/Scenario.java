package histoire;
import personnages.Gaulois;import personnages.Romain;import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus = new Romain("Minus", 6);
		Gaulois obelix = new Gaulois("Obelix",25);
		Druide panoramix = new Druide("Panoramix",5,10);
		
		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion"
				+ " peut aller d'une force 5 a 10.");
		panoramix.parler("Je vais aller preparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos , ce n'est pas juste!");
		asterix.boirePotion(6);
		asterix.parler("Bonjour");
		minus.parler("UN GAU.. UN GAUGAU..");
		asterix.frapper(minus);
	}

}
