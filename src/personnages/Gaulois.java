package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

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

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		force = boirePotion(effetPotion);
		System.out.println(nom + "envoie un grand coup dans la machoire de ");
		romain.recevoirCoup(force / 3);
	}

	public int boirePotion(int effetPotion) {
		force = force * effetPotion;
		System.out.println("Merci Druide,je sens que ma force est " + effetPotion + " fois décuplée.");
		return force;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8, 1);
		Romain minus = new Romain("Minus",6);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.frapper(minus);
	}
}
