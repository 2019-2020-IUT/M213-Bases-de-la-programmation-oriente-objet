package vehiculev2;

public abstract class VehiculeAMoteur extends Vehicule {

    private double capacite;
    private double niveau;

/*==========================================================Getter & Setters====================================================================*/

    /**
     * @return the capacite
     */
    public double getCapacite() {
        return capacite;
    }

    /**
     * @return the niveau
     */
    public double getNiveau() {
        return niveau;
    }

    /**
     * @param niveau the niveau to set
     */
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    /**
     * @param capacite the capacite to set
     */
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

/*==========================================================Getter & Setters====================================================================*/

    public VehiculeAMoteur() {
        this.capacite = 0.;
    }
    
    public VehiculeAMoteur(double c) {
        super();
        this.capacite = c;
        this.niveau = 0.;
    }

    
    public String toString() {
        return super.toString() + ", possède un moteur de " + this.capacite + " L";
    }

    public boolean enPanne() {
        if(this.niveau <= 0. )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void approvisionner(double nbL) {
        if (nbL >= this.capacite) {
            nbL = this.capacite;
        }
        this.niveau = nbL;
    }


}
