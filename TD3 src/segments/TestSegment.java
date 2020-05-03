package segments;

import Coords.Coords;

public class TestSegment {

	public static void main(String[] args) {
		Coords p11 = new Coords(12.2, 8.3);
		Coords p12 = new Coords(21.1, 6.5);
		Coords p32 = new Coords(45.5, 8.6);
		Segment s1 = new Segment(p11, p12);
		Segment s2 = s1.clone();
		Segment s3 = null;
		try {
			s3 = new Segment(p11, new Coords(45.5, 8.6));
		} catch (RuntimeException e) {
			e.getMessage();
		}
		
		assert (s1.equals(s2) == true);
		assert (s1.equals(s3) == false);
		assert (s3.getExtremite().equals(p32) == true);
		assert (s3.length() == 33.30135);
		
		assert (s3.projX().equals(new Segment(p11.projx(), p32.projx())));
		//Segment err = new Segment(p11, p11);
		
		
		
		
		System.out.println("fin du programme");
	}

}
