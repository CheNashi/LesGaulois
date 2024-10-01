package personnages;

import java.util.Arrays;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	private boolean invariant = force > 0;
	//TP3 AJOUTS//
//	private String texte;

	public Romain(String nom, int force, int nbEquipement) {
		assert invariant && nbEquipement < 3;
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
		assert force > 0;
		int force_intitiale = force;
		force -= forceCoup;
		assert force < force_intitiale && invariant;
		if (force > 0) {
			parler("Aie!");
		} else {
			parler("J'abandonne");
		}

	}
	
//------------------------------PARTIE COPIER COLLER TP3--------------------------------------------------//
	
//	public Equipement[] recevoirCoup(int forceCoup) {
//		Equipement[] equipementEjecte = null;
//		// prÈcondition 
//		assert force > 0;
//		int oldForce = force;
//		forceCoup = CalculResistanceEquipement(forceCoup);
//		force -= forceCoup;
//		// if (force > 0) {
//		// parler("AÔe");
//		// } else {
//		// equipementEjecte = ejecterEquipement();
//		// parler("J'abandonne...");
//		// }
//		switch (force) {
//		case 0:
//			parler("AÔe");
//		default:
//			equipementEjecte = ejecterEquipement();
//			parler("J'abandonne...");
//			break;
//		} // post condition la force a diminuÈe 
//		assert force < oldForce; 
//		return equipementEjecte;
//	}
//
//	private int CalculResistanceEquipement(int forceCoup) {
//		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
//		int resistanceEquipement = 0;
//		if (!(nbEquipement == 0)) {
//			texte += "\nMais heureusement, grace ‡ mon Èquipement sa force est diminuÈ de ";
//			for (int i = 0; i < nbEquipement;) {
//				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
//					resistanceEquipement += 8;
//				} else {
//					System.out.println("Equipement casque");
//					resistanceEquipement += 5;
//				}
//				i++;
//			}
//			texte = +resistanceEquipement + "!";
//		}
//		parler(texte);
//		forceCoup -= resistanceEquipement;
//		return forceCoup;
//	}
//
//	private Equipement[] ejecterEquipement() {
//		Equipement[] equipementEjecte = new Equipement[nbEquipement];
//		System.out.println("L'Èquipement de " + nom.toString() + " s'envole sous la force du coup."); 
//
//		int nbEquipementEjecte = 0;
//		for (int i = 0; i < nbEquipement; i++) {
//			if (equipements[i] == null) {
//				continue;
//			} else {
//				equipementEjecte[nbEquipementEjecte] = equipements[i];
//				nbEquipementEjecte++;
//				equipements[i] = null;
//			}
//		}
//		return equipementEjecte;
//
//	}
//	
//------------------------------PARTIE COPIER COLLER--------------------------------------------------//

	public void sEquiper(Equipement equipement) {
		if (nbEquipement >= 2) {
			System.out.println("Le  " + getNom() + " est d√©j√† bien prot√©g√©.");
			return;
		}
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == equipement) {
				System.out.println("Le Romain " + getNom() + " est √©quip√© d'un " + equipement + " !");
				return;
			}
		}

		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le Romain " + getNom() + " s'√©quipe avec un " + equipement + " !");
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
