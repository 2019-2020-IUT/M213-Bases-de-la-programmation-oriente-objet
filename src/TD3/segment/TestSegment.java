package segment;
import point.Point;

public class TestSegment {

	public static void main(String[] args) {
		
		Point O = new Point();
        Point I = new Point(1.0, 0.0);
        Point J = new Point(0.0, 1.0);
        Point A = new Point(1.0, 3.5);
        Point B = new Point(8.0, 20.0);
        Point C = new Point(-2.0, 3.0);
		Point D = new Point(1.0, 1.0);
		
		Segment AB = null;
		Segment BC = null;
		Segment OI = null;
		Segment OJ = null;
		Segment OD = null;
		//Segment AA = null;
		try {
			AB = new Segment(A, B);
			BC = new Segment(B, C);
			OI = new Segment(O, I);
			OJ = new Segment(O, J);
			OD = new Segment(O, D);
			//AA = new Segment(A, A);
		} catch (Throwable t) {
			System.out.println("Erreur : " + t);
		}

		System.out.println(OI.toString());
		System.out.println(OJ.toString());
		System.out.println(AB.toString());
		System.out.println(BC.toString());
		System.out.println(OD.toString());
		//System.out.println(AA.toString());

		System.out.println("Hello world !");
	}

}
