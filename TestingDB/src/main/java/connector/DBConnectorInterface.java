package connector;

import java.sql.Connection;

public interface DBConnectorInterface
{
    Connection getConnection();
    void open();
    void close();
}