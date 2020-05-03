package point;

public class TestPoint {
    public static void main(String[] args)
    {    
        Point O = new Point();
        Point I = new Point(1.0, 0.0);
        Point J = new Point(0.0, 1.0);
        Point A = new Point(1.0, 3.5);
        Point B = new Point(8.0, 20.0);
        Point C = new Point(-2.0, 3.0);
        Point D = new Point(1.0, 1.0);


        System.out.println(" O = " + O.toString());
        System.out.println(" I = " + I.toString());
        System.out.println(" J = " + J.toString());
        System.out.println(" A = " + A.toString());
        System.out.println(" B = " + B.toString());
        System.out.println(" C = " + C.toString());
        System.out.println(" D = " + D.toString());

        System.out.println("La distance O - I est de " + O.getDistance(I));
        System.out.println("La distance O - J est de " + O.getDistance(J));
        System.out.println("La distance J - I est de " + J.getDistance(I));
        System.out.println("La distance A - B est de " + A.getDistance(B));
        System.out.println("La distance B - A est de " + B.getDistance(A));
        System.out.println("La distance A - C est de " + A.getDistance(C));
        System.out.println("La distance C - A est de " + C.getDistance(A));
        System.out.println("La distance O - D est de " + O.getDistance(D));

        System.out.println("Le getX de A est " + A.getX());
        System.out.println("Le getY de A est " + A.getY());

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

        System.out.println(A.equals(A));
        System.out.println(O.equals(O));
        System.out.println(I.equals(J));
        System.out.println(J.equals(I));
        System.out.println(B.equals(B));
        System.out.println(C.equals(C));


        /*A.setLocation(5., 2.);
        B.setLocation(3., -2.);
        C.setLocation(6., 5.);
        O.setLocation(-5., 8.);*/

        A.translate(5, 2);
        B.translate(3, -2);
        C.translate(6, 5);
        O.translate(-5, 8);


        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        System.out.println(O.toString());






    }
}
