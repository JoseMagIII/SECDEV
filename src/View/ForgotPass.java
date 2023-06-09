/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BCrypt.BCrypt;
import Controller.SQLite;
import Model.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Sabrina
 */
public class ForgotPass extends javax.swing.JPanel {
    
    public Frame frame;
    public User thisUser;
    
    public ForgotPass() {
        initComponents();
    }
    
    public void initUser(User user) {
        thisUser = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     
    public int passwordValidates( String pass ) {
    int count = 0;

    if( pass.matches(".{8,64}") )
       count ++;
    if( pass.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$") )
       count ++;
    if( pass.matches("^(?!.*(password|123456|qwerty)).*$") )
       count ++;
    if( pass.matches("^[a-zA-Z0-9!@#\\$%\\^&\\*\\(\\)\\[\\]\\{\\}\\-_\\+=\\|\\\\\\;:\\'\",\\.<>\\/\\?]{8,}$") )
       count ++;

    return count;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changePassBtn = new javax.swing.JButton();
        changePasswordFld = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        changeConfpassFld = new javax.swing.JPasswordField();
        jProgressBar2 = new javax.swing.JProgressBar();

        changePassBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        changePassBtn.setText("CHANGE PASSWORD");
        changePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassBtnActionPerformed(evt);
            }
        });

        changePasswordFld.setBackground(new java.awt.Color(240, 240, 240));
        changePasswordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        changePasswordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        changePasswordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        changePasswordFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordFldActionPerformed(evt);
            }
        });
        changePasswordFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                changePasswordFldKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        changeConfpassFld.setBackground(new java.awt.Color(240, 240, 240));
        changeConfpassFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        changeConfpassFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        changeConfpassFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changePasswordFld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeConfpassFld, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changePassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backBtn)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(changePasswordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeConfpassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changePassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassBtnActionPerformed

        SQLite sqlite = new SQLite();
        ArrayList<User> users = sqlite.getUsers();

        if(changePasswordFld.getText().equals(changeConfpassFld.getText())){
            String hashed = BCrypt.hashpw(changePasswordFld.getText(), BCrypt.gensalt(12));

            if(passwordValidates(changePasswordFld.getText()) >= 2){
//                frame.deleteAction(thisUser.getUsername());
//                frame.registerAction(thisUser.getUsername(), hashed, changeConfpassFld.getText(), thisUser.getSecurityAns());
                frame.forgotPassAction(thisUser.getUsername(), hashed, changeConfpassFld.getText(), thisUser.getSecurityAns());
                JOptionPane.showMessageDialog(null, "Password has successfully been changed.");
                frame.loginNav();
            }

            else{
                JOptionPane.showMessageDialog(null, "Passwords must contain at least one lowercase letter, one uppercase letter, and one digit.");
            }

        }

        else{
            JOptionPane.showMessageDialog(null, "Passwords do not match");
        }

    }//GEN-LAST:event_changePassBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed

    private void changePasswordFldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_changePasswordFldKeyTyped
        // TODO add your handling code here:
        jProgressBar2.setValue((passwordValidates(changePasswordFld.getText())*25));
        jProgressBar2.setStringPainted(true);
    }//GEN-LAST:event_changePasswordFldKeyTyped

    private void changePasswordFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePasswordFldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField changeConfpassFld;
    private javax.swing.JButton changePassBtn;
    private javax.swing.JTextField changePasswordFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
}
