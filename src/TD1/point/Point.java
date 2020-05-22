package TD1.point;

/********************************************************************************************
 * 		@author			JunkJumper															*
 * 		@license		https://creativecommons.org/licenses/by/4.0/  License CC BY 4.0		*
 * 		@since 			File available since 20/05/2020										*
 ********************************************************************************************/

public class Point
{
    private double x;
    private double y;

    public Point() {
        this(0, 0);
    }
    
    public Point(Point p) {
    	this(p.getX(), p.getY());
    }

    public Point(int x, int y) {
    	this((double)x, (double)y);
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point projX() {
        return new Point(this.getX(), 0);
    }
    
    public Point projY() {
        return new Point(0, this.getY());
    }

    public String toString()
    {
        return "(X = " + this.x + " - Y = " + this.y + ")";
    }

    public double getDistance(Point p)
    {
        return Math.sqrt(Math.pow(this.getX() - p.x, 2) + Math.pow(this.getY() - p.y, 2));
    }
    
    @Override
    public boolean equals(Object obj) {
        Point p = (Point)obj;
        return (this.x == p.x && this.y == p.y);
    }
    
    public Point clone() {
        return this;
    }
    
    public String displayLocation() {
    	return "x = " + this.getX() + " , y = " + this.getY();
    }
    
    public void setLocation(Point p) {
    	this.setX(p.getX());
    	this.setY(p.getY());
    }
    
    public void setLocation(double x, double y) {
    	this.setLocation(new Point(x, y));
    }
    
    public void translate (int dx, int dy) {
    	this.setX(this.getX() + dx);
    	this.setY(this.getY() + dy);
    }
    
    public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
