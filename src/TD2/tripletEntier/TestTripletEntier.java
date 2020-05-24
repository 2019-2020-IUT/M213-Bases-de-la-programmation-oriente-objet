package TD2.tripletEntier;

public class TestTripletEntier
{
    public static void main(String[] args)
    {
    	TripletEntier t1 = new TripletEntier(2, 2, 3);
        
        System.out.println("Somme "+t1+" = "+t1.somme());
		System.out.println(t1.somme() == 7);
		System.out.println();
        
        
        TripletEntier t2 = new TripletEntier(1, 2, 3);
        
		System.out.println(t2);
		String resConcat = t2.concatenation();

		System.out.println(resConcat);
		System.out.println(resConcat == "123");
		System.out.println(resConcat.equals("123"));
		System.out.println("Moyenne "+t2+" = "+t2.moyenne());
		System.out.println();
		
		System.out.println(new TripletEntier(1, 2, 4).moyenne());
		System.out.println();
		
		TripletEntier t3 = new TripletEntier(1, 2, 2);
		System.out.println("Moyenne "+t3+" = "+t3.moyenne());
		System.out.println(t3.moyenne() == (5.0/3.0));
		System.out.println(t3.moyenne() == 1.666667);
		System.out.println();
		
		
		t1.ajoutElement(5, 2);
		System.out.println(t1);
		t1.ajoutElement(5, 5);
		t1.ajout1erElement(10);
		System.out.println(t1);
		
	}
}
