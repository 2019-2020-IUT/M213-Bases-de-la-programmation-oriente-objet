package comparable;

public class Enseignant extends Personne{

    private String matiere;

    public Enseignant() {
        super.setAge(0);
        super.setNom(null);
        this.matiere = null;
    }

    
    public Enseignant(String s, int i, String m) {
        super.setAge(i);
        super.setNom(s);
        this.matiere = m;
    }
    
    
    public int compareTo(Personne autre)
    {
        return this.getNom().compareTo(autre.getNom());
    }
    

    public String toString() {
        return super.toString() + " et enseigne la matiere \"" + this.matiere + "\"";
    }

    /**
     * @return the matiere
     */
    public String getMatiere() {
        return matiere;
    }

    /**
     * @param matiere the matiere to set
     */
    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }




}
