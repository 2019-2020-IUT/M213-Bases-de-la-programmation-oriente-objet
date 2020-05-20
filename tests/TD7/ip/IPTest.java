package TD7.ip;


//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.AfterEach;

class IPTest {

    //@BeforeEach
    public void avantTest() {
        System.out.println("----------Debut Test-------------");
    }
    
    //@AfterEach
    public void apresTest() {
        System.out.println("-----------Fin Test--------------");
    }

	//@Test
	public void testIPValide1() {
        String[] tabIp = new String[10];
        boolean[] tabRetatt = new boolean[tabIp.length];
        boolean[] tabRetour = new boolean[tabIp.length];

	    
	    tabIp[0] = "";
	    tabIp[1] = "127.0.0.1";
	    tabIp[2] = "127.231.1.1";
	    tabIp[3] = "1.2.3.4";
	    tabIp[4] = "12.2.3";
	    tabIp[5] = "12.3.213.123.123";
	    tabIp[6] = "1231.12.2.3";
	    tabIp[7] = ".1.2.3";
	    tabIp[8] = "1.2.3.";
        tabIp[9] = "1.2..3";
        
        tabRetatt[0] = false;
        tabRetatt[1] = true;
        tabRetatt[2] = true;
        tabRetatt[3] = true;
        tabRetatt[4] = false;
        tabRetatt[5] = false;
        tabRetatt[6] = false;
        tabRetatt[7] = false;
        tabRetatt[8] = false;
        tabRetatt[9] = false;

        for (int i = 0; i < tabRetatt.length; i++) {
            tabRetour[i] = IP.ipValide(tabIp[i]);
        }

        System.out.println("attendu - retourne :");

        for (int i = 0; i < tabRetatt.length; i++) {
            System.out.println(tabRetatt[i] + " - " + tabRetour[0]);
        }



	}




/*
Faire tableau ip
puis faire tableau results attendus
puis faire tableau booleens a remplir
puis array assert.
*/

}
