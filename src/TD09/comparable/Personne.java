package comparable;

public abstract class Personne implements Comparable<Personne>{

    private String nom;
    private int age;


    public Personne() {
        this.nom = null;
        this.age = 0;
    }
    
    public Personne(String s, int i) {
        this.nom = s;
        this.age = i;
    }

    public int compareTo(Personne p)
    {
        return this.getNom().compareTo(p.getNom());
    }

    public String toString() {
        return this.nom + " a " + this.age + " ans";
    }

    
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

}
