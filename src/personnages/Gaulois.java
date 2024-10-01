package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
//	private int force, nb_trophees;
//	private Equipement trophees[] = new Equipement[100];

	public Gaulois(String nom, int force, int effetPotion) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	public int getForce() {
		return force;
	}

	public int getEffetPotion() {
		return effetPotion;
	}

	public String getNom() {
		return nom;
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

// ------------------------------PARTIE COPIER COLLER TP3--------------------------------------------------//
//	private String prendreParole() {
//		String texte = "Le gaulois " + nom + " : ";
//		return texte;
//	}
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
//		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
//		for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
//			this.trophees[nb_trophees] = trophees[i];
//		}
//		return;
//	}
// ------------------------------PARTIE COPIER COLLER TP3--------------------------------------------------//

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force / 3) * effetPotion);
	}


	public int boirePotion(int effetPotion) {
		this.effetPotion = effetPotion;
		System.out.println("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
		return force;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8, 1);
		Romain minus = new Romain("Minus", 6, 2);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.frapper(minus);
	}
}
