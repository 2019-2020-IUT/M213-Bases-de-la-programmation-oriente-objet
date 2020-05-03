package ensembleEntierBorne;

public class TestEnsembleEntierBorne {

	public static void main(String[] args) {
		EnsembleEntierBorne e1 = new EnsembleEntierBorne(20);
		EnsembleEntierBorne e2 = new EnsembleEntierBorne(11);
		EnsembleEntierBorne e3 = new EnsembleEntierBorne(5);
		
		e1.add(3);
		e1.add(5);
		e1.add(9);
		e1.add(14);
		e1.add(18);
		e1.add(18);
		
		System.out.println(e1.toString());
		
		e1.remove(3);
		e1.remove(18);
		
		System.out.println(e1.toString());

		System.out.println();
		System.out.println();
		System.out.println();

		e2.add(1);
		e2.add(2);
		e2.add(3);
		e2.add(4);
		e2.add(5);
		e2.add(6);
		e2.add(7);
		e2.add(8);

		e3.add(5);
		e3.add(0);
		e3.add(3);

		System.out.println("e1 = " + e1.toString());
		System.out.println("e2 = " + e2.toString());
		System.out.println("e3 = " + e3.toString());
	}

}
