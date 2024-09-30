package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class scenario {

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		Gaulois asterix = new Gaulois("Asterix", 8, 1,0);
		Gaulois obelix = new Gaulois("Obélix", 25, 1,0);
		Romain minus = new Romain("Minus", 6);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		panoramix.preparerPotion(10);
		minus.parler(" UN GAU... UN GAUGAU");
		while (minus.getForce() > 1) {
			asterix.frapper(minus);
		}
	}

}
