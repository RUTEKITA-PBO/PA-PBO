/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Luqman
 */
public class Jadwal_halte extends Jadwal implements JadwalTransportasi {
    private  String halte_keberangkatan;
    private final String halte_tiba;
    private final String waktu_keberangkatan;
    private final String waktu_tiba;

    public Jadwal_halte( String halte_keberangkatan, String halte_tiba, String waktu_keberangkatan, String waktu_tiba) {
        this.halte_keberangkatan = halte_keberangkatan;
        this.halte_tiba = halte_tiba;
        this.waktu_keberangkatan = waktu_keberangkatan;
        this.waktu_tiba = waktu_tiba;
    }

    
    public String getHalte_keberangkatan() {
        return halte_keberangkatan;
    }

    public String getHalte_tiba() {
        return halte_tiba;
    }

    public String getWaktu_keberangkatan() {
        return waktu_keberangkatan;
    }

    public String getWaktu_tiba() {
        return waktu_tiba;
    }

    public void setHalte_keberangkatan(String halte_keberangkatan) {
        this.halte_keberangkatan = halte_keberangkatan;
    }

    @Override
    public void createJadwalHalte() {
    try {
        String query = "INSERT INTO jadwal_halte ( halte_keberangkatan, halte_tiba, waktu_keberangkatan, waktu_tiba) VALUES (?, ?, ?, ?)";
        Database.preparedStatement = Database.connection.prepareStatement(query);

        
        Database.preparedStatement.setString(1, this.halte_keberangkatan);
        Database.preparedStatement.setString(2, this.halte_tiba);
        Database.preparedStatement.setString(3, this.waktu_keberangkatan);
        Database.preparedStatement.setString(4, this.waktu_tiba);

        
        Database.preparedStatement.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal menambah data! " + e.getMessage());
    }
}

    
    @Override
    public boolean updateJadwalHalte() {
        try {
            String query = "UPDATE jadwal_halte SET halte_keberangkatan = ?, halte_tiba = ?, waktu_keberangkatan = ?, waktu_tiba = ? WHERE halte_keberangkatan = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.halte_keberangkatan);
            Database.preparedStatement.setString(2, this.halte_tiba);
            Database.preparedStatement.setString(3, this.waktu_keberangkatan);
            Database.preparedStatement.setString(4, this.waktu_tiba);
            Database.preparedStatement.setString(5, this.halte_keberangkatan);
            int rowsUpdated = Database.preparedStatement.executeUpdate();
            if (rowsUpdated > 1) {
                JOptionPane.showMessageDialog(null, "Berhasil memperbarui data!");
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal memperbarui data! " + e.getMessage());
        }
        return false;
    }

    
    @Override
    public boolean deleteJadwalHalte() {
        try {
            String query = "DELETE FROM jadwal_halte WHERE halte_keberangkatan = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.getHalte_keberangkatan());
            int rowsDeleted = Database.preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil menghapus data!");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Gagal menghapus data!" + e.getMessage());
        }
        return false;
    }
    
    public static List<Jadwal_halte> searchAndSortJadwalHalte(String halte_keberangkatan, String halte_tiba, String sortOrder) {
    List<Jadwal_halte> result = new ArrayList<>();
    try {
        // Bangun query pencarian dan sorting
        StringBuilder query = new StringBuilder("SELECT * FROM jadwal_halte WHERE 1=1");
        if (halte_keberangkatan != null && !halte_keberangkatan.isEmpty()) {
            query.append(" AND halte_keberangkatan LIKE ?");
        }
        if (halte_tiba != null && !halte_tiba.isEmpty()) {
            query.append(" AND halte_tiba LIKE ?");
        }
        query.append(" ORDER BY waktu_keberangkatan ").append(sortOrder);

        // Siapkan statement
        Database.preparedStatement = Database.connection.prepareStatement(query.toString());

        // Set parameter untuk query
        int parameterIndex = 1;
        if (halte_keberangkatan != null && !halte_keberangkatan.isEmpty()) {
            Database.preparedStatement.setString(parameterIndex++, "%" + halte_keberangkatan + "%");
        }
        if (halte_tiba != null && !halte_tiba.isEmpty()) {
            Database.preparedStatement.setString(parameterIndex++, "%" + halte_tiba + "%");
        }

        // Eksekusi query
        Database.resultSet = Database.preparedStatement.executeQuery();

        // Tambahkan hasil ke dalam list
        while (Database.resultSet.next()) {
            result.add(new Jadwal_halte(
                Database.resultSet.getString("halte_keberangkatan"),
                Database.resultSet.getString("halte_tiba"),
                Database.resultSet.getString("waktu_keberangkatan"),
                Database.resultSet.getString("waktu_tiba")
            ));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error saat mencari dan menyortir data: " + e.getMessage());
    } finally {
        try {
            if (Database.resultSet != null) Database.resultSet.close();
            if (Database.preparedStatement != null) Database.preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saat menutup koneksi: " + e.getMessage());
        }
    }
    return result;
}


    }