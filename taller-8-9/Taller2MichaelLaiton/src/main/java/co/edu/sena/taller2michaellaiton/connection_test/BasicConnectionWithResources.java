package co.edu.sena.taller2michaellaiton.connection_test;
        import java.sql.*;
public class BasicConnectionWithResources
{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/base?serverTimezone=America/Bogota";
        String username = "taller2michaellaiton";
        String password = "taller2michaellaiton";
        String sql = "SELECT * FROM base.users_tbl";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("CONEXION BASE DE DATOS BasicConnectionWithResources");
                System.out.print(rs.getString("user_firstname"));
                System.out.print(" | ");
                System.out.print(rs.getString("user_lastname"));
                System.out.print(" | ");
                System.out.print(rs.getString("user_email"));
                System.out.print(" | ");
                System.out.print(rs.getString("user_password"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } // end try-catch
    } // main
} // BasicConnectionWithResources

