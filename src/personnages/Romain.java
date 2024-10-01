package personnages;

import java.util.Arrays;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force, int nbEquipement) {
		assert force > 0 && nbEquipement < 3;
		this.nom = nom;
		this.force = force;
		this.nbEquipement = nbEquipement;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0; // Pré condition
		int force_intitiale = force;
		force -= forceCoup;
		assert force < force_intitiale; // Post condition
		if (force > 0) {
			parler("Aie!");
		} else {
			parler("J'abandonne");
		}
	}

	public void sEquiper(Equipement equipement) {
		if (nbEquipement >= 2) {
			System.out.println("Le soldat " + getNom() + " est déjà bien protégé.");
			return;
		}
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == equipement) {
				System.out.println("Le soldat " + getNom() + " est équipé d'un " + equipement + " !");
				return;
			}
		}

		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + getNom() + " s'équipe avec un " + equipement + " !");
	}

	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + ", equipements=" + Arrays.toString(equipements) + "]";
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6, 0);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		System.out.println(minus);
	}
}
