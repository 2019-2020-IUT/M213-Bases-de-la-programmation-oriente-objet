package TD7.monney;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MonnaieTest {

    
    @BeforeEach
    public void avantTest() {
        System.out.println("----------Debut Test-------------");
    }
    
    @AfterEach
    public void apresTest() {
        System.out.println("-----------Fin Test--------------");
    }

    @Test public void testEquals() {

        Monnaie m12CHF = new Monnaie(12 , "CHF");
        Monnaie m14CHF = new Monnaie(14 , "CHF");
        Monnaie m15CHF = new Monnaie(14 , "USD");
        
        assertTrue(!m12CHF.equals(null));
        assertEquals(m12CHF, m12CHF);
        assertEquals(m12CHF, new Monnaie(12, "CHF"));
        assertTrue(!m12CHF.equals(m14CHF));
        assertFalse(m12CHF.equals(m15CHF));
        
        System.out.println(!m12CHF.equals(null));
        System.out.println(!m12CHF.equals(m14CHF));
        System.out.println(m12CHF.equals(m15CHF));
        
    }
    
    
    
}

