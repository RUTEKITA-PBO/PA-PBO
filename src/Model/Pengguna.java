/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.SQLException;
/**
 *
 * @author Luqman
 */
public class Pengguna extends Account {
    private final String fullname;

    public Pengguna(String fullname, String password) {
        super(fullname, password); 
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    
    public void createAccount() {
        try {
            String query = "INSERT INTO pengguna ( password, nama_lengkap) VALUES (?, ?)";

            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, super.getPassword());
            Database.preparedStatement.setString(2, getFullname());

            Database.preparedStatement.executeUpdate();
            System.out.println("Pengguna berhasil ditambahkan!");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Function to login
    public static boolean loginAccount(String fullname, String password) {
        try {
            String query = "SELECT * FROM pengguna WHERE nama_lengkap = ? AND password = ?";

            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, fullname);
            Database.preparedStatement.setString(2, password);

            Database.resultSet = Database.preparedStatement.executeQuery();
            return Database.resultSet.next();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    // Function to check if fullname is already registered
    public static boolean checkFullname(String fullname) {
        try {
            String query = "SELECT * FROM pengguna WHERE nama_lengkap = ?";

            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, fullname);
            Database.resultSet = Database.preparedStatement.executeQuery();
            return Database.resultSet.next();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    // Function to get the user's ID based on fullname and password
    public static Integer getPenggunaID(String fullname, String password) {
        try {
            String query = "SELECT id_pengguna FROM pengguna WHERE nama_lengkap = ? AND password = ?";

            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, fullname);
            Database.preparedStatement.setString(2, password);
            Database.resultSet = Database.preparedStatement.executeQuery();

            if (Database.resultSet.next()) {
                return Database.resultSet.getInt("id_pengguna");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }


}