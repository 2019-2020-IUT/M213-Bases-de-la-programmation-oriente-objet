package vehiculev2;

public abstract class Vehicule {

    private static int compteur = 0;
    private int id;
    private double distance;

/*==========================================================Getter & Setters====================================================================*/
    
    /**
     * @return the compteur
     */
    public static int getCompteur() {
        return compteur;
    }
    
    /**
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }
    
    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * @param compteur the compteur to set
     */
    public static void setCompteur(int compteur) {
        Vehicule.compteur = compteur;
    }
    
/*==============================================================================================================================================*/

    public Vehicule() {
        this.id = compteur;
        compteur++;
        distance = 0.;
    }

    @Override
    public String toString() {
        return "Le véhicule Numéro " + id + " a parcourru " + distance;
    }

    void rouler(double d) {
        this.distance = d;
    }



}
