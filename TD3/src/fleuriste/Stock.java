package fleuriste;
/*-------------------------------------------------
                  Tableau Fleurs
      0 = roses     1 = tulipes     2 = oeillets
--------------------------------------------------*/

public class Stock {

    private int[] quantite;

	//getters
	    
	public int[] getQuantite() {
		return quantite;
	}	    
	    
	//setters

	public void setQuantite(int[] quantite) {
		this.quantite = quantite;
	}

	//Instructions

	public Stock(Fleur f1, Fleur f2, Fleur f3) {
		quantite[0] = 0;
		quantite[1] = 0;
		quantite[2] = 0;
	}

	public void ajouteFleur(int i, int quantiteFleur) {
		if(i < 0 || i > 2)
		{
			System.err.println("Impossible, il n'y a pas de fleur de ce type !");
		}

		this.quantite[i] = quantiteFleur;
	}

	public boolean bouquetFaisable(Bouquet b1) {
		
		for (int i = 0; i < 3; i++) {
			if(quantite[i] > b1.getLotFleur(i).getQuantite())
			{
				return false;
			}
		}
		return true;
	}







}
