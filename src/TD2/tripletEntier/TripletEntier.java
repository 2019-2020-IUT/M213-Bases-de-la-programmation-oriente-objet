package tripletEntier;

public class TripletEntier {

    private int unA;
    private int unB;
    private int unC;

    public TripletEntier(int a, int b, int c) {
        this.unA = a;
        this.unB = b;
        this.unC = c;
    }

    public TripletEntier() {
    }

    public int somme() {
        return this.unA + this.unB + this.unC;
    }

    public float moyenne() {
        return (float)this.somme()/3;
    }

    public String concatenation() {
        return "" + this.unA + this.unB + this.unC;
    }

    public void ajoutElement(int e) {
        this.unA = e;
    }

    public boolean contient(int e) {
        return (this.unA == e) || (this.unB == e) || (this.unC == e);
    }

    public boolean equals(TripletEntier t) {
        return (this.unA == t.unA) && (this.unB == t.unB) && (this.unC == t.unC);
    }

    public TripletEntier clone(TripletEntier t) {
        return new TripletEntier(t.unA, t.unB, t.unC);
    }

    @Override
    public String toString() {
        return "[" + this.unA + "," + this.unB + "," + this.unC +"]";
    }

}

