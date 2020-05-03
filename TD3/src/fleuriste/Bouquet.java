package fleuriste;
/*-------------------------------------------------
                  Tableau Fleurs
      0 = roses     1 = tulipes     2 = oeillets
--------------------------------------------------*/

public class Bouquet {

    private LotFleur lotFleurs[];

	public LotFleur getLotFleur(int i) {
		return lotFleurs[i];
	}

	public void setLotFleur(LotFleur lotFleur, int i) {
		this.lotFleurs[i] = lotFleur;
    }

    //instructions
    public Bouquet(LotFleur l1, LotFleur l2, LotFleur l3){
        lotFleurs[0] = l1;
        lotFleurs[1] = l2;
        lotFleurs[2] = l3;
    }

    public double prix() {
        double resultat = 0.;

        for (int i = 0; i < 3; i++) {
            resultat = lotFleurs[i].getFleur().getPrix() * lotFleurs[i].getQuantite() + resultat;            
        }
        return resultat;
    }
    




}
