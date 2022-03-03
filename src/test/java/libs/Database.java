package libs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {
    private static final String url = "jdbc:mysql://172.16.0.11:3306/compras";
    private static final String user = "toolkit";
    private static final String pass = "toolkit";
    private static Connection connection = null;

    public static synchronized Connection getConnection() throws SQLException, ClassNotFoundException {
        if (connection == null || connection.isClosed()) {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = DriverManager.getConnection(url, user, pass);
        }
        return connection;
    }

    public static synchronized void close() throws SQLException {
        if (!connection.isClosed()) {
            connection.close();
        }
    }

    public synchronized void deleteUserBloqueado() throws SQLException, ClassNotFoundException {
        String SQL = "delete from f004_erros_acessos where IP_USUARIO = '189.52.87.4';";

        PreparedStatement query = getConnection().prepareStatement(SQL);
        query.executeUpdate();
    }
}
