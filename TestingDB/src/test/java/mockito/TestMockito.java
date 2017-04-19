package mockito;

import entity.Top;
import java.util.Arrays;
import static junit.framework.TestCase.assertEquals;
import mapper.CakeMapper;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestMockito
{
    static CakeMapper cm = new CakeMapper();
    static Top top1, top2;

    public TestMockito()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
        cm = mock(CakeMapper.class);
        top1 = new Top(22, "Vanilla", 44.25);
        top2 = new Top(23, "Chocolate", 13.75);

        when(cm.getAllTops()).thenReturn(Arrays.asList(top1, top2));
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
    public void testMockito() throws Exception
    {
        System.out.println("testMockito");

        assertEquals(2, cm.getAllTops().size());
    }
}
