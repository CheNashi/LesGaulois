package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class scenario {

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		Gaulois asterix = new Gaulois("Asterix", 8, 1);
		Gaulois obelix = new Gaulois("Obélix", 25, 1);
		Romain minus = new Romain("Minus", 6);
		panoramix.parler("Je vais aller préparer une petite potion...");
		obelix.boirePotion(10);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.preparerPotion(10);
		minus.parler(" UN GAU... UN GAUGAU");
		while (minus.getForce() > 1) {
			asterix.frapper(minus);
		}
	}

}
