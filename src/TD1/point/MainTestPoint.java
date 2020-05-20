package TD1.point;

public class MainTestPoint {
    public static void main(String[] args)
    {    
        Point O = new Point();
        Point I = new Point(1.0, 0.0);
        Point J = new Point(0.0, 1.0);
        Point A = new Point(1.0, 3.5);
        Point B = new Point(8.0, 20.0);
        Point C = new Point(-2.0, 3.0);
        Point D = new Point(1.0, 1.0);

        Point A2 = new Point(A);
        Point B2 = new Point(B);
        Point C2 = new Point(C);
        Point O2 = new Point(D);
        
        Point A3 = new Point(A);
        Point B3 = new Point(B);
        Point C3 = new Point(C);
        Point O3 = new Point(D);

        System.out.println("\n===== Les toString() =====");
        System.out.println(" O = " + O.toString());
        System.out.println(" I = " + I.toString());
        System.out.println(" J = " + J.toString());
        System.out.println(" A = " + A.toString());
        System.out.println(" B = " + B.toString());
        System.out.println(" C = " + C.toString());
        System.out.println(" D = " + D.toString());
        
        
        System.out.println("\n===== Les getDistance() =====");
        System.out.println("La distance O - I est de " + O.getDistance(I));
        System.out.println("La distance O - J est de " + O.getDistance(J));
        System.out.println("La distance J - I est de " + J.getDistance(I));
        System.out.println("La distance A - B est de " + A.getDistance(B));
        System.out.println("La distance B - A est de " + B.getDistance(A));
        System.out.println("La distance A - C est de " + A.getDistance(C));
        System.out.println("La distance C - A est de " + C.getDistance(A));
        System.out.println("La distance O - D est de " + O.getDistance(D));
        
        
        System.out.println("\n===== Les getX() et getY() =====");
        System.out.println("Le getX de A est " + A.getX());
        System.out.println("Le getY de A est " + A.getY());
        
        
        System.out.println("\n===== Les ProjX() et ProjY() =====");
        System.out.println("Le ProjX de A est " + A.projX());
        System.out.println("Le ProjY de A est " + A.projY());
        System.out.println("Le ProjX de B est " + B.projX());
        System.out.println("Le ProjY de B est " + B.projY());
        System.out.println("Le ProjX de O est " + O.projX());
        System.out.println("Le ProjY de O est " + O.projY());
        System.out.println("Le ProjX de I est " + I.projX());
        System.out.println("Le ProjY de I est " + I.projY());
        System.out.println("Le ProjX de J est " + J.projX());
        System.out.println("Le ProjY de J est " + J.projY());
        
        
        System.out.println("\n===== Les equals() =====");
        System.out.println("A et A : " + A.equals(A));
        System.out.println("O et O : " + O.equals(O));
        System.out.println("I et J : " + I.equals(J));
        System.out.println("J et I : " + J.equals(I));
        System.out.println("B et B : " + B.equals(B));
        System.out.println("C et C : " + C.equals(C));

        A2.setLocation(5., 2.);
        B2.setLocation(3., -2.);
        C2.setLocation(6., 5.);
        O2.setLocation(-5., 8.);
        

        
        A3.translate(5, 2);
        B3.translate(3, -2);
        C3.translate(6, 5);
        O3.translate(-5, 8);
        
        System.out.println("\nAffichage des points");
        System.out.println("O : " + O.toString());
        System.out.println("I : " + I.toString());
        System.out.println("J : " + J.toString());
        System.out.println("A : " + A.toString());
        System.out.println("B : " + B.toString());
        System.out.println("C : " + C.toString());
        System.out.println("D : " + D.toString());

        System.out.println();
        
        System.out.println("A2 : " + A2.toString());
        System.out.println("B2 : " + B2.toString());
        System.out.println("C2 : " + C2.toString());
        System.out.println("O2 : " + O2.toString());

        System.out.println();
        
        System.out.println("A3 : " + A3.toString());
        System.out.println("B3 : " + B3.toString());
        System.out.println("C3 : " + C3.toString());
        System.out.println("O3 : " + O3.toString());




    }
}
