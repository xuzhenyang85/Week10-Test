package codingbat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodingBatTest
{    
    public CodingBatTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    @Test
    public void testDiff21_19()
    {
        System.out.println("diff21_19");
        CodingBat cb = new CodingBat();
        int expResult = 2;
        int result = cb.diff21(19);
        assertEquals(expResult, result);
    }
}
