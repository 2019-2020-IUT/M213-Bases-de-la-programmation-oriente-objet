package TD4.pointcolore;

import java.awt.Color;
import TD1.point.Point;

public class PointColore extends Point {

    private Color couleur;

    //==================================================
    
    public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
    }
    
    @Override
    public String toString() {
        return "Couleur = " + couleur + " --- Coords = " + super.toString();
    }
    
    //==================================================

    public PointColore() {
        this.setCouleur(Color.black);
    }

    public PointColore(double x, double y, Color c) {
        super(x,y);
        this.setCouleur(c);
    }
    
    public void colore(Color c){
        this.setCouleur(c);
    }

    public boolean likeColor(PointColore pc) {

        if(this.couleur == pc.couleur)
            return true;
        else return false;
    }

    @Override
    public boolean equals (Object obj)
    {
        Point p = (Point)obj;
        if (super.getX() == p.getX() && super.getY() == p.getY())
            return true;
        else return false;
    }

    public PointColore projX()
    {
        Point p = super.projX();
        return new PointColore(p.getX(), p.getY(), this.couleur);
    }
    
    public PointColore projY()
    {
        Point p = super.projY();
        return new PointColore(p.getY(), p.getY(), this.couleur);
    }
    
    

    







}
