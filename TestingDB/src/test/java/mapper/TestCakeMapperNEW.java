package mapper;

import mapper.CakeMapperNEW;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import static junit.framework.TestCase.assertEquals;

public class TestCakeMapperNEW
{
    CakeMapperNEW cmn = new CakeMapperNEW("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/cupcakeshoptest", "root", "root");
            
    public TestCakeMapperNEW()
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
    public void testCakeMapperNEW() throws Exception
    {
        System.out.println("testCakeMapperNEW");

        assertEquals(10, cmn.getAllTops().size());
        assertEquals(9, cmn.getAllBottoms().size());
        assertEquals(9, cmn.getCakeById(1).getName().length());
        assertEquals("ChoccoNut", cmn.getCakeById(1).getName());
    }
}
