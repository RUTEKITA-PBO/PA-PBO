/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import javax.swing.JOptionPane;
import Model.Database;
import Model.Pengguna;
/**
 *
 * @author Luqman
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        Password_register = new javax.swing.JPasswordField();
        Username_register = new javax.swing.JTextField();
        buat_akun_Button = new javax.swing.JButton();
        Login_disinibutton = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 750));
        setMinimumSize(new java.awt.Dimension(1200, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Password_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_registerActionPerformed(evt);
            }
        });
        getContentPane().add(Password_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 230, -1));

        Username_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_registerActionPerformed(evt);
            }
        });
        getContentPane().add(Username_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 230, -1));

        buat_akun_Button.setBackground(new java.awt.Color(102, 204, 255));
        buat_akun_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buat_akun_Button.setForeground(new java.awt.Color(255, 255, 255));
        buat_akun_Button.setText("Buat Akun");
        buat_akun_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buat_akun_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(buat_akun_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 160, 50));

        Login_disinibutton.setBackground(new java.awt.Color(204, 255, 255));
        Login_disinibutton.setText("Login Disini");
        Login_disinibutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_disinibuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Login_disinibutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, -1, -1));

        Keluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Sudah Punya Akun ?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/page/registrasi pengguna.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_disinibuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_disinibuttonActionPerformed
        Login_pengguna login_pengguna = new Login_pengguna();
        login_pengguna.setVisible(true);
        login_pengguna.setLocationRelativeTo(null);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Login_disinibuttonActionPerformed

    private void Username_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_registerActionPerformed

    private void buat_akun_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buat_akun_ButtonActionPerformed
try {
    String fullname = Username_register.getText().trim(); 
    String password = Password_register.getText();

    if (fullname.equals("") || password.equals("")) {
        JOptionPane.showMessageDialog(null, "Data yang dimasukkan tidak boleh kosong!");
    } else { 
        if (!Pengguna.checkFullname(fullname)) {
            Pengguna pengguna = new Pengguna(fullname, password); 
            pengguna.createAccount();
            JOptionPane.showMessageDialog(null, "Akun berhasil didaftarkan! Silahkan login");
            
            Login_pengguna login_pengguna = new Login_pengguna();
            login_pengguna.setVisible(true);
            login_pengguna.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Nama lengkap sudah terdaftar!");
        }
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Terdapat Kesalahan: " + e.getMessage());
}

// TODO add your handling code here:
    }//GEN-LAST:event_buat_akun_ButtonActionPerformed

    private void Password_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_registerActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        Landing_home landing_home = new Landing_home();
        landing_home.setVisible(true);
        landing_home.setLocationRelativeTo(null);
        this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_KeluarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Login_disinibutton;
    private javax.swing.JPasswordField Password_register;
    private javax.swing.JTextField Username_register;
    private javax.swing.JButton buat_akun_Button;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
