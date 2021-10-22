package pack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

    GradeBook g1 , g2;
    
    
    @BeforeEach
    void setUp() throws Exception {
        
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);
       
        
        g1.addScore(100);
        g1.addScore(20);
        
        g2.addScore(69);
        g2.addScore(9);
        
    }

    @AfterEach
    void tearDown() throws Exception {
        
        g1 = g2 = null;
    }




    @Test
    void testSum() {
    //    fail("Not yet implemented");
        
        assertEquals(120, g1.sum(), .0001);
        assertEquals(78, g2.sum(), .0001);
        
    }

    @Test
    void testMinimum() {
    //    fail("Not yet implemented");
        
        assertEquals(20, g1.minimum(), .001);
        assertEquals(9, g2.minimum(), .001);
        
    }

    @Test
    void testFinalScore() {
    //    fail("Not yet implemented");
        
        assertEquals(100, g1.finalScore(), .0001);
        assertEquals(69, g2.finalScore(), .0001);
        
    }
    

    @Test
    void testaddScore() {
        //fail("Not yet implemented");
        
        assertTrue(g1.toString().equals("100.0 20.0 "));
        assertTrue(g2.toString().equals("69.0 9.0 "));
    
        assertEquals(2, g1.getScoreSize(), .001);
        assertEquals(2, g2.getScoreSize(), .001);
        
    }

}