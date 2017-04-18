package entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest
{
    Account account = new Account();
    double balance, percentage;    
    
    public AccountTest()
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
    public void testGetInterestNegative()
    {
        balance = -0.01;
        percentage = 0.00;
        
        account.setBalance(balance);
        
        double expResult = balance * percentage;
        double result = account.getInterest();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGetInterestZero()
    {
        balance = 0.00;
        percentage = 0.00;
        
        account.setBalance(balance);
        
        double expResult = balance * percentage;
        double result = account.getInterest();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGetInterest50()
    {
        balance = 50;
        percentage = 0.03;
        
        account.setBalance(balance);
        
        double expResult = balance * percentage;
        double result = account.getInterest();
        assertEquals(expResult, result, 0.0);
    }
}
