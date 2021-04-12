package abstraction.eq3Transformateur1;

import abstraction.eq8Romu.produits.Chocolat;


// Paul GIRAUD

public class Business {
	
	
	private Stock stock;

	public Business(Stock stock) {
		this.stock = stock;
	}
	
	public Stock getStock() {
		return this.stock;
	}
	
	public double prixVente(Double quantite, Chocolat chocolat) {
		return quantite*this.getStock().prixDeVenteKG(chocolat);
	}
	
	public boolean sommeNousVendeur(Object produit) {
		return (this.getStock().getStockChocolats((Chocolat) produit) > 0);
	}

}
