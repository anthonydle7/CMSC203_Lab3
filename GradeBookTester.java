import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTester 
{
    private GradeBook g1;
    private GradeBook g2;

    @BeforeEach
    
    public void setUp() throws Exception 
    {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);
        g1.addScore(55);
        g1.addScore(66);
        g2.addScore(77);
        g2.addScore(88);
    }

    @AfterEach
    
    public void tearDown() throws Exception 
    {
        g1 = null;
        g2 = null;
    }

    @Test
    
    public void testAddScore() {
        assertEquals("55.0 66.0", g1.toString());
        assertEquals("77.0 88.0", g2.toString());
        assertEquals(2, g1.getScoreSize());
        assertEquals(2, g2.getScoreSize());
    }

    @Test
    
    public void testSum() {
        assertEquals(121.0, g1.sum(), 0.001);
        assertEquals(165.0, g2.sum(), 0.001);
    }

    @Test
    
    public void testMinimum() 
    {
        assertEquals(55.0, g1.minimum(), 0.001);
        assertEquals(77.0, g2.minimum(), 0.001);
    }

    @Test
    
    public void testFinalScore() 
    {
        assertEquals(66.0, g1.finalScore(), 0.001);
        assertEquals(88.0, g2.finalScore(), 0.001);
    }

    @Test
    
    public void testGetScoreSize() 
    {
        assertEquals(2, g1.getScoreSize());
        assertEquals(2, g2.getScoreSize());
    }

    @Test
    
    public void testToString() 
    {
        assertEquals("55.0 66.0", g1.toString());
        assertEquals("77.0 88.0", g2.toString());
    }

}
