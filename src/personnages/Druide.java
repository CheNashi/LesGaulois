package personnages;

import java.util.*;

public class Druide {
	private static final int FORCE_MOYENNE = 7;
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	Random random = new Random();

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.setEffetPotionMin(effetPotionMin);
		this.setEffetPotionMax(effetPotionMax);
		parler("Bonjour, je suis druide " + nom + " et ma potion peut aller d'une force de " + effetPotionMin + " Ã¡ "
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

	public void preparerPotion() {
		forcePotion=random.nextInt(effetPotionMax);
		if (forcePotion > FORCE_MOYENNE) {
			System.out.println("J'ai préparé une super potion de force :" + forcePotion);
		} else {
			System.out.println("Je n'ai pas trouvé tous les ingrÃ©dients, ma potion est seulement de force :" + forcePotion);
		}
	}

	public void booster(Gaulois gaulois) {
		if ("Obélix".equals(gaulois.getNom())) {
			parler("Non, Obélix !... Tu n'auras pas de potion magique ");
			gaulois.parler(" Par Bélénos, ce n'est pas juste !");
		} else {
			gaulois.boirePotion(forcePotion);
		}
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

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
	}

}
