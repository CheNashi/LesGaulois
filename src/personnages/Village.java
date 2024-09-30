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
			if (villageois[i] != null && villageois[i].getId() == id) {
				System.out.println("Le villageois s'appelle : " + villageois[i].getNom() + " et son ID est : " + i
						+ " du village " + "\"" + getNom() + "\"");
				return villageois[i];
			}
		}
		System.out.println("Le gaulois avec l'ID " + id + " n'est pas dans ce village.");
		return null;
	}

	public void afficherVillageois(Village village) {
		System.out.println("Voici le chef " + chef);
		for (int i = 0; i < nbVillageoisMaximum; i++) {
			if (villageois[i] != null) {
				System.out.println(villageois[i]);
			}
		}

	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		Gaulois asterix = new Gaulois("Astérix", 8, 1, 1);
		village.ajouterHabitant(asterix);
		Chef abraAbraracourcix = new Chef("Abraracourcix", 6, village);
		Gaulois gaulois = village.trouverHabitant(1);
		village.afficherVillageois(village);
		Gaulois obelix = new Gaulois("Obélix", 25, 1, 2);
		village.ajouterHabitant(obelix);
		village.afficherVillageois(village);		
	}
}
