package TD1.point;

public class Point
{
    //attributs
    public double x;
    public double y;


    //constructeurs
    public Point()
    {
        x = 0;
        y = 0;
    }
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    //methode d'instance
    public String toString()
    {
        return "(X = " + this.x + " - Y = " + this.y + ")";
    }

    public double getDistance(Point p)
    {
        double result;
        result = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        return result;
    }

    //accesseur en lecture
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

    public Point projX()
    {
        return new Point(this.x, 0.);
    }
    
    public Point projY()
    {
        return new Point(0., this.y);
    }
    
    public boolean equals (Object obj)
    {
        Point p = (Point)obj;
        if (this.x == p.x && this.y == p.y)
            return true;
            else return false;
    }
    
    public Point clone()
    {
        return new Point(this.x, this.y);
    }

    public void getLocation()
    {
        System.out.println("x = " + this.x + " , y = " + this.y + ".");
    }
    
    public void setLocation(Point p)
    {
        p.x = this.x;
        p.y = this.y;
    } 
    public void setLocation(double x, double y)
    {
        x = this.x;
        y = this.y;
    }
    
    public void translate(int dx, int dy)
    {
        this.x = this.x+dx;
        this.y = this.y+dy;
    }
    
    //getters and setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    
}
