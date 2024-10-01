package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	private Gaulois villageois[];

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public int getNbVillageois() {
		return nbVillageois;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		boolean ajoute = false;
		for (int i = 0; i < nbVillageoisMaximum; i++) {
			if (villageois[i] == null) {
				villageois[i] = gaulois;
				ajoute = true;
				nbVillageois++;
				break;
			}
		}
		if (!ajoute) {
			System.out.println("Le village est plein... Il faut déménager");
		}
	}

	public Gaulois trouverHabitant(int id) {
		for (int i = 0; i < nbVillageoisMaximum; i++) {
			if (villageois[i]!= null && i==id) {
				System.out.println("Le villageois s'appelle : " + villageois[i].getNom() + " et c'est le num�ro : " + i
						+ " du village " + "\"" + getNom() + "\"");
				return villageois[i];
			}
		}
		System.out.println("Le gaulois num�ro : " + id + " n'existe pas.");
		return null;
	}

	public void afficherVillageois(Village village) {
		System.out.println("Voici le chef " + chef.getNom());
		for (int i = 0; i < village.nbVillageoisMaximum; i++) {
			if (villageois[i] != null) {
				System.out.println(villageois[i]);
			}
		}
	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		Chef abraAbraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraAbraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8, 1);
		village.ajouterHabitant(asterix);
		village.trouverHabitant(0);
		Gaulois obelix = new Gaulois("Obélix", 25, 1);
		village.ajouterHabitant(obelix);
		village.trouverHabitant(1);
		village.trouverHabitant(3);
		village.afficherVillageois(village);
	}
}
