package segment;
import point.Point;

public class Segment {
    
    public Point origine;
    public Point extremite;

    public Segment(Point p1, Point p2) throws Throwable
    {
        if(p1.equals(p2)) throw new Throwable("Les points sont confondus !");
        this.origine = p1;
        this.extremite = p2;
    }

    public boolean equals(Object B)
    {
        Segment s =  (Segment) B;
        return this.origine.equals(s.origine)&&(this.extremite.equals(s.extremite)) || this.origine.equals(extremite)&&(this.extremite.equals(s.origine));
    }

    public String toString()
    {
        return "[" + origine + " - " + extremite + "]";
    }

    /*public Object clone() throws Throwable
    {
        return new Segment((Point)this.origine.clone, (Point)this.extremite.clone);
    }*/

    public double longueur()
    {
        return origine.getDistance(extremite);
    }

    public Segment projX() throws Throwable
    {
        if(origine.projX().equals(extremite.projX())) throw new Throwable("Les points projetes sont confondus !");
        return new Segment(origine.projX(), extremite.projX());
    }

    public Segment projY() throws Throwable
    {
        if(origine.projY().equals(extremite.projY())) throw new Throwable("Les points projetes sont confondus !");
        return new Segment(origine.projY(), extremite.projY());
    }

}
