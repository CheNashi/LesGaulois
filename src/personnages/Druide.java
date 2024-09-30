package personnages;

import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.setEffetPotionMin(effetPotionMin);
		this.setEffetPotionMax(effetPotionMax);
		parler("Bonjour, je suis druide " + nom + " et ma potion peut aller d'une force de " + effetPotionMin + " á "
				+ effetPotionMax);
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public int getForcePotion() {
		return forcePotion;
	}

	public int preparerPotion(int effetPotionMax) {
		Random random = new Random();
		effetPotionMax = random.nextInt(15);
		if (effetPotionMax > 7) {
			System.out.println("J'ai préparé une super potion de force :" + effetPotionMax);
			return effetPotionMax;
		} else {
			System.out.println(
					"Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force :" + effetPotionMax);
			return effetPotionMax;
		}
	}

	public void booster(Gaulois gaulois) {
		if (gaulois.getNom().equals("obelix")) {
			System.out.println(" Non, Obélix !... Tu n'auras pas de potion magique ");
			System.out.println("Le gaulois Obélix : « Par Bélénos, ce n'est pas juste !»");
		} else {
			gaulois.boirePotion(10);
		}
	}

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion(10);
	}

	public int getEffetPotionMin() {
		return effetPotionMin;
	}

	public void setEffetPotionMin(int effetPotionMin) {
		this.effetPotionMin = effetPotionMin;
	}

	public int getEffetPotionMax() {
		return effetPotionMax;
	}

	public void setEffetPotionMax(int effetPotionMax) {
		this.effetPotionMax = effetPotionMax;
	}
}
