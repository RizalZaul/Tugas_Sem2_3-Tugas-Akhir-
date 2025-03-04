/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Koneksi.Koneksi;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author rizan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        hide.setVisible(true);
        eye.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        eye = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        bt_Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Eye_4.png"))); // NOI18N
        eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeMouseClicked(evt);
            }
        });
        jPanel1.add(eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 20, 30));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Invisible_4.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        jPanel1.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 20, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Close12.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 6, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo_Login.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 32, 298, 422));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 32, 364, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Screenshot_2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 70, 364, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Laundry Cahaya");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 96, 364, -1));

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Username");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 178, 338, -1));

        Username.setPreferredSize(new java.awt.Dimension(64, 30));
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 200, 338, -1));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 240, -1, -1));

        Password.setPreferredSize(new java.awt.Dimension(64, 30));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 262, 338, -1));

        bt_Login.setBackground(new java.awt.Color(0, 0, 204));
        bt_Login.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        bt_Login.setForeground(new java.awt.Color(255, 255, 255));
        bt_Login.setText("Sign In");
        bt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LoginActionPerformed(evt);
            }
        });
        jPanel1.add(bt_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 353, 338, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void bt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LoginActionPerformed
        String username = Username.getText();
        String password = Password.getText();
        if (username.equals("") && !password.equals("")) {
            JOptionPane.showMessageDialog(null, "Username Tidak Boleh Kosong");
        } else if (!username.equals("") && password.equals("")) {
            JOptionPane.showMessageDialog(null, "Password Tidak Boleh Kosong");
        } else if (username.equals("") && password.equals("")) {
            JOptionPane.showMessageDialog(null, "Username dan Password Tidak Boleh Kosong");
        } else if (!username.equals("") && !password.equals("")) {
        }
        try {
            String sql = "SELECT * FROM user WHERE username = ? AND password = md5(?)";

            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            java.sql.ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                dispose();
                new MenuUtama().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Username atau Password salah");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_LoginActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void eyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeMouseClicked
        eye.setVisible(false);
        hide.setVisible(true);

        Password.setEchoChar('•');
    }//GEN-LAST:event_eyeMouseClicked

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked
        eye.setVisible(true);
        hide.setVisible(false);

        Password.setEchoChar((char) 0);
    }//GEN-LAST:event_hideMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            UIManager.put("Button.arc", 20);
            UIManager.put("Component.focusWidth", 1);
            UIManager.put("Component.arc", 0);
            UIManager.put("ProgressBar.arc", 0);
            UIManager.put("TabbedPane.selectedBackground", Color.BLACK);
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JButton bt_Login;
    private javax.swing.JLabel eye;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
