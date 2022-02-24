import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void add() {
    }

    @org.junit.jupiter.api.Test
    void modul() {
        Complex z = new Complex(3,4);

        assertEquals(5,z.modul());

        if(6 == z.modul()){
            System.out.println("E BINE");
        }
        else{
            //System.out.println("E RAU");
            throw new AssertionFailedError("E RAU Am primit: " + z.modul() + " si asteptam 6");
        }
    }
}