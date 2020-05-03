package pointcolore;

import java.awt.Color;

import point.Point;

public class TestPointColore {
	public static void main(String[] args) {
	
		Point tableauPoint[] = new Point[11];
	
		tableauPoint[0] = new Point(0., 5.);
		tableauPoint[1] = new Point(1., 4.);
		tableauPoint[2] = new Point(2., 3.);
		tableauPoint[3] = new Point(3., 2.);
		tableauPoint[4] = new Point(4., 1.);

		tableauPoint[5] = new PointColore(1., 1., Color.red);
		tableauPoint[6] = new PointColore(2., 1., Color.blue);
		tableauPoint[7] = new PointColore(3., 3., Color.green);
		tableauPoint[8] = new PointColore(4., 4., Color.black);
		tableauPoint[9] = new PointColore(5., 5., Color.white);

		tableauPoint[10] = new PointColore();

		tableauPoint[10] = tableauPoint[6];

		System.out.println("Test toString :");
		for (int i = 0; i < tableauPoint.length; i++) {

			System.out.println("Le point d'incide " + i + " a pour attribus : " + tableauPoint[i].toString());

		}

		
		/*
		System.out.println("Test getDistance :");
		for (int i = 0; i < (tableauPoint.length - 1); i++) {
			System.out.println("La distance du point d'incide [" + i + "]-[" + (i+1) + "] est de " + tableauPoint[i].getDistance(tableauPoint[(i+1)]));
		}
		*/





	}

}
