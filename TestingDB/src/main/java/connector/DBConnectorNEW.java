package connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectorNEW
{
    private String driver, url, user, password;
    private Connection conn = null;
    
    public void init(String driver, String url, String user, String password)
    {
        this.driver = driver;
        this.url = url;
        this.user = user;
        this.password = password;
    }
    
    public Connection getConnection()
    {
        return conn;
    }
    
    public void open()
    {
        try
        {
            if (conn == null || conn.isClosed())
            {                
                Class.forName(driver);
                conn = DriverManager.getConnection(url, user, password);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void close()
    {
        try
        {
            if(conn != null && !conn.isClosed())
            {                
                conn.close();
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}