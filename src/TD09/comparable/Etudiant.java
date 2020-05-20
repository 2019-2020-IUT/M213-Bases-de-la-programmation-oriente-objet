package comparable;

public class Etudiant extends Personne{

    private String classe;
    private int numEtu;

    public Etudiant() {
        super.setAge(0);
        super.setNom(null);
        this.classe = null;
    }

    
    public Etudiant(String s, int i, String c) {
        super.setAge(i);
        super.setNom(s);
        this.classe = c;
    }
    
    public String toString() {
        return super.toString() + " et est en classe de " + this.classe;
    }
    
    /**
     * @return the numEtu
     */
    public int getNumEtu() {
        return numEtu;
    }

    /**
     * @param numEtu the numEtu to set
     */
    public void setNumEtu(int numEtu) {
        this.numEtu = numEtu;
    }

    /**
     * @return the classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(String classe) {
        this.classe = classe;
    }

}
