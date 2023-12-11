import java.sql.*;
import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/northwind";
        String user = "root"; // Replace with your username
        String password = "        ";

        String query = "SELECT * FROM Products";
        try {
            // Establishing connection
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            // Executing query
            ResultSet rs = stmt.executeQuery(query);

            // Processing the result set
            while (rs.next()) {
                // Replace with your column names and types
                System.out.println(rs.getString(2));
            }

            // Closing resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
