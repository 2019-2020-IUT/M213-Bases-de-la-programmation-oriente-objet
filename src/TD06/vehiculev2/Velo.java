package vehiculev2;

public class Velo extends VehiculeSansMoteur{

private int nombreVitesse;


/*==========================================================Getter & Setters====================================================================*/
    /**
     * @return the nombreVitesse
     */
    public int getNombreVitesse() {
        return nombreVitesse;
    }

    /**
     * @param nombreVitesse the nombreVitesse to set
     */
    public void setNombreVitesse(int nombreVitesse) {
        this.nombreVitesse = nombreVitesse;
    }
/*==========================================================Getter & Setters====================================================================*/

    public Velo(int nb) {
        super();
        this.nombreVitesse = nb;
    }

    public String toString() {
        return super.toString() + " et possède " + this.nombreVitesse + " vitesses sur son vélo.";
    }
    
    
    
    String transporter (String depart, String arrivee) {
        return "Le vélo n°" + (super.getId()) + "a roulé de " + depart + " à " + arrivee;
    }

}
