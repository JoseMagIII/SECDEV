
package View;

import BCrypt.BCrypt;
import Controller.SQLite;
import Model.User;
import static java.lang.System.in;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JPanel {

    public Frame frame;
    private int counter = 0;
    private String currUser = "";
    String securityAns = "hello";
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernameFld = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        forgotPassBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        forgotPassBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        forgotPassBtn.setText("FORGOT PASSWORD");
        forgotPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPassBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(forgotPassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFld)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(usernameFld)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(290, 290, 290))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        frame.registerNav();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        SQLite sqlite = new SQLite();
        ArrayList<User> users = sqlite.getUsers();
        String username = usernameFld.getText();
        String password = new String(passwordFld.getPassword());

        

        User thisUser = new User("NOTLOGGED", "NOTLOGGED", "NOTLOGGED");

        if (!username.equals(currUser)){
            currUser = username;
        }

        for (User user: users){

            if(username.toLowerCase().equals(user.getUsername().toLowerCase()) && BCrypt.checkpw(password, user.getPassword())){
                thisUser = user;

                if(thisUser.getLocked() == 1 || thisUser.getRole() == 1){
                    JOptionPane.showMessageDialog(null, "This user is locked. Please contact XXX-XXX.");
                }

                else{
                    usernameFld.setText("");
                    passwordFld.setText("");
                    counter = 0;
                    frame.mainNav(thisUser);
                    break;
                }

            }
            else if (currUser.toLowerCase().equals(user.getUsername().toLowerCase()) && !BCrypt.checkpw(password, user.getPassword())) {
                counter++;

                if (counter >= 5){
                    thisUser.setLocked(1);
                    sqlite.setLocked(currUser.toLowerCase(), '1');
                    JOptionPane.showMessageDialog(null, "This user is locked. Please contact XXX-XXX.");
                }
            }

        }

        if (thisUser.getUsername().equals("NOTLOGGED") && thisUser.getPassword().equals("NOTLOGGED")){
            JOptionPane.showMessageDialog(null, "Invalid username and or password");
        }

    }//GEN-LAST:event_loginBtnActionPerformed

    private void forgotPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassBtnActionPerformed
        SQLite sqlite = new SQLite();
        ArrayList<User> users = sqlite.getUsers();
        String username = usernameFld.getText();
        String password = new String(passwordFld.getPassword());
        boolean found = false;
        
        User thisUser = new User("NOTLOGGED", "NOTLOGGED", "NOTLOGGED");
        
        if ("".equals(username)){
            JOptionPane.showMessageDialog(null, "Please enter a valid username");
            
        } else {
            
            for (User user: users){
                
                if(username.toLowerCase().equals(user.getUsername().toLowerCase())){
                    thisUser = user;
                    found = true;
                    securityAns = JOptionPane.showInputDialog(null, "What is your mother's maiden name?");
                    
                    if(securityAns.equals(thisUser.getSecurityAns())){
                        frame.forgotPassNav(thisUser);
                    }else {
                        JOptionPane.showMessageDialog(null, "Invalid.");
                    }
                    
                    break;
                }
                else if (!found){
                    JOptionPane.showMessageDialog(null, "Please enter a valid username");
                }
            }
            System.out.print(securityAns + thisUser.getSecurityAns());
        }
    }//GEN-LAST:event_forgotPassBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgotPassBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
