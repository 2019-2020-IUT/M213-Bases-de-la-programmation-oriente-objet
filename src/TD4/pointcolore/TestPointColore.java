package pointcolore;

import java.awt.Color;
import point.Point;

public class TestPointColore {
	public static void main(String[] args) {
	
		Point Z = new Point(1., 8.);
		PointColore A = new PointColore(3., 5., Color.black);
		PointColore B = new PointColore(2.5, 8., Color.green);
		PointColore C = new PointColore(1., -2., Color.red);
		PointColore O = new PointColore(0., 0., Color.yellow);
        PointColore I = new PointColore(1.0, 0.0, Color.yellow);
		PointColore J = new PointColore(0.0, 1.0, Color.red);
		
        System.out.println(" Z = " + Z.toString());
        System.out.println(" O = " + O.toString());
        System.out.println(" I = " + I.toString());
        System.out.println(" J = " + J.toString());
        System.out.println(" A = " + A.toString());
        System.out.println(" B = " + B.toString());
		System.out.println(" C = " + C.toString());

		A.setCouleur(Color.white);
		System.out.println(A.toString());
		
	}

}
