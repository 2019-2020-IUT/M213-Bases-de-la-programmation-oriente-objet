package TD3.segment;

/********************************************************************************************
 * 		@author			JunkJumper															*
 * 		@license		https://creativecommons.org/licenses/by/4.0/  License CC BY 4.0		*
 * 		@since 			File available since 24/05/2020										*
 ********************************************************************************************/

import TD1.point.Point;
import TD9.comparable.main;

public class Segment {
	private Point origine;
	private Point extremite;

	public Segment() {
		this(0, 0, 0, 0);
	}

	public Segment(double xi, double yi, double xj, double yj) {
		this.origine = new Point(xi, yi);
		this.extremite = new Point(xj, yj);
	}

	public Segment(Point o, Point e) {
		this(o.getX(), o.getY(), e.getX(), e.getY());
	}

	public Segment(double x, double y, Point p) {
		this(x, y, p.getX(), p.getY());
	}

	public Segment(Point p, double x, double y) {
		this(p.getX(), p.getY(), x, y);
	}

	@Override
	public boolean equals(Object obj) {
		Segment s = (Segment) obj;
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

	public Segment projX() {
		return new Segment(this.origine.projX(), this.extremite.projX());
	}

	public Segment projY() {
		return new Segment(this.origine.projY(), this.extremite.projY());
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

}
