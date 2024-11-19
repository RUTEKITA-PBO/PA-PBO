/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
/**
 *
 * @author Luqman
 */
public class Database {
    public static Connection connection = null;

    protected static Statement statement;
    protected static PreparedStatement preparedStatement;
    protected static ResultSet resultSet;

    private final static String DB_HOST = "csxf7.h.filess.io";
    private final static String DB_NAME = "ProjectPbo_localplay";
    private final static String DB_USERNAME = "ProjectPbo_localplay";
    private final static String DB_PASSWORD = "d337a069ed9dc1a78159181e79dc94372f28f745";
    private final static String DB_PORT = "3305"; // Tambahkan port database Anda

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver!");
        }
    }

    public final static Connection connect() {
        try {
            String url = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
            connection = DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);
            System.out.println("Database connected!");
        } catch (SQLException e) {
            System.out.println("Failed to connect database! Error: " + e.getMessage());
        }
        return connection;
    }

    public final static void disconnect() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Database disconnected!");
            }
        } catch (SQLException e) {
            System.out.println("Failed to disconnect database! Error: " + e.getMessage());
        }
    }
}
