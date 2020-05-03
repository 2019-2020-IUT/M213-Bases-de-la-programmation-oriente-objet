package premierTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class MaClasseTest {

    @BeforeEach
    public void avantTest() {
        System.out.println("----------Debut Test-------------");
    }
    
    @AfterEach
    public void apresTest() {
        System.out.println("-----------Fin Test--------------");
    }

    @Test
    public void testCalculer() throws Exception {
        assertEquals(2, MaClasse.calculer(1,1));
        System.out.println(MaClasse.calculer(1,1));
    }    



}
