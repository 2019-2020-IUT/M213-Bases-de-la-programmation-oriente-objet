package TD3.segment;

import TD1.point.Point;
import TD9.comparable.main;

public class Segment {
	private Point origine;
	private Point extremite;
	
	public Segment() {
		this(0, 0, 0, 0);
	}
	
	public Segment(int xi, int yi, int xj, int yj) {
		this.origine = new Point(xi, yi);
		this.extremite = new Point(xj, yj);
	}
	
	public Segment(Point o, Point e) {
		this.setOrigine(o);
		this.setExtremite(e);
	}
	
	public Segment(int x, int y, Point p) {
		this.setOrigine(x, y);
		this.setExtremite(p);
	}
	
	public Segment(Point p, int x, int y) {
		this.setOrigine(p);
		this.setExtremite(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		Segment s = (Segment)obj;
		return (this.origine.equals(s.origine) && this.extremite.equals(s.extremite));
	}
	
	@Override
	public String toString() {
		return "[" + this.getOrigine().toString() + " - " + this.getExtremite().toString() + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Segment(this.origine, this.getExtremite());
	}
	
	public Point getOrigine() {
		return origine;
	}

	public Point getExtremite() {
		return extremite;
	}

	protected void setOrigine(Point origine) {
		this.origine = origine;
	}

	protected void setExtremite(Point extremite) {
		this.extremite = extremite;
	}

	protected void setOrigine(int x, int y) {
		this.setOrigine(new Point(x, y));
	}

	protected void setExtremite(int x, int y) {
		this.setExtremite(new Point(x, y));
	}
	
	public static void main(String[] args) {
		Point un = new Point(3, 6);
		Point deux = new Point(1, 8);
		Segment seg1 = new Segment(2, 4, 6, 3);
		Segment seg2 = new Segment(un, deux);
		
		System.out.println(seg1.toString());
		System.out.println(seg2.toString());
		
	}
	
}
