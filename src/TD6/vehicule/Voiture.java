package TD6.vehicule;

public class Voiture extends VehiculeAMoteur {

    private int nombrePlace;


/*==========================================================Getter & Setters====================================================================*/
    /**
     * @return the nombrePlace
     */
    public int getNombrePlace() {
        return nombrePlace;
    }

    /**
     * @param nombrePlace the nombrePlace to set
     */
    public void setNombrePlace(int nombrePlace) {
        this.nombrePlace = nombrePlace;
    }
/*==========================================================Getter & Setters====================================================================*/

    public Voiture(double c, int nb) {
        super(c);
        this.nombrePlace = nb;
    }

    public String toString() {
        return super.toString() + " et " + this.nombrePlace + "places dans la voiture.";
    }
}
