package abstraction.eq6Distributeur1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import abstraction.fourni.Filiere;
import abstraction.fourni.IActeur;
import abstraction.fourni.Journal;
import abstraction.fourni.Variable;

public class Distributeur1Acteur implements IActeur {
	
	protected int cryptogramme;

	public Distributeur1Acteur() {
	}
	
	
	public String getNom() {

		return "EQ6";
	}

	public String getDescription() {
		return "CacaoCaisse est un distributeur de type grande surface, il achète le chocolat aux transformateurs et le revend au client final.";
	}

	public Color getColor() {
		return new Color(230, 126, 34);
	}


	public void initialiser() {
		//peut etre initialiser la variable Stocks.prix
	}

	public void next() {
		// créer un contrat cadre qui mettra à jour la banque
		// mettre à jour les stocks en fonction du contrat cadre
		// simuler la vente => comprendre le client
	}

	
	// Renvoie la liste des filières proposées par l'acteur
	public List<String> getNomsFilieresProposees() {
		ArrayList<String> filieres = new ArrayList<String>();
		return(filieres);
	}

	// Renvoie une instance d'une filière d'après son nom
	public Filiere getFiliere(String nom) {
		return Filiere.LA_FILIERE;
	}

	// Renvoie les indicateurs
	public List<Variable> getIndicateurs() {
		List<Variable> res = new ArrayList<Variable>();
		return res;
	}

	// Renvoie les paramètres
	public List<Variable> getParametres() {
		List<Variable> res=new ArrayList<Variable>();
		return res;
	}

	// Renvoie les journaux
	public List<Journal> getJournaux() {
		List<Journal> res=new ArrayList<Journal>();
		return res;
	}

	public void setCryptogramme(Integer crypto) {
		this.cryptogramme = crypto;
		
	}

	//Quand un autre acteur fait faillite cette methode est appelee automatiquement pour si on veut l'utiliser
	public void notificationFaillite(IActeur acteur) {
	}

	// quand la banque fait un dépot ou un retrait cette methode est appelée avec le montant en param, pour si on veut l'utiliser pour quelque chose
	public void notificationOperationBancaire(double montant) {
	}
	
	// Renvoie le solde actuel de l'acteur
	public double getSolde() {
		return Filiere.LA_FILIERE.getBanque().getSolde(Filiere.LA_FILIERE.getActeur(getNom()), this.cryptogramme);
	}

}

