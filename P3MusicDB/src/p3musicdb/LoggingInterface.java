
package p3musicdb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class LoggingInterface extends javax.swing.JFrame {
    static ResultSet user = null;
    static boolean isPremium = false;
    static int signedID;
    static String signedName;
    String insertInfo;
    DefaultTableModel model = new DefaultTableModel(10, 8);
    String subType="NORMAL";
    PremiumListingInterface premiumListingInterface = new PremiumListingInterface();
    NormalListingInterface normalListingInterface = new NormalListingInterface();
    AdminInterface adminInterface = new AdminInterface();
    
    public LoggingInterface() {
        initComponents();
        
        namesurnameLabel.setVisible(false);
        emailLabel2.setVisible(false);
        passwordLabel2.setVisible(false);
        countryLabel.setVisible(false);
        signupButton1.setVisible(false);
        countryComboBox.setVisible(false);
        passwordTextField1.setVisible(false);
        emailTextField1.setVisible(false);
        namesurnameTextField.setVisible(false);
        premiumRadioButton.setVisible(false);
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        premiumRadioButton = new javax.swing.JRadioButton();
        passwordTextField = new javax.swing.JPasswordField();
        emailTextField = new javax.swing.JTextField();
        signupButton = new javax.swing.JButton();
        signinButton = new javax.swing.JButton();
        namesurnameTextField = new javax.swing.JTextField();
        emailTextField1 = new javax.swing.JTextField();
        passwordTextField1 = new javax.swing.JTextField();
        countryComboBox = new javax.swing.JComboBox<>();
        signupButton1 = new javax.swing.JButton();
        namesurnameLabel = new javax.swing.JLabel();
        emailLabel2 = new javax.swing.JLabel();
        passwordLabel2 = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setPreferredSize(new java.awt.Dimension(1110, 635));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(1110, 635));
        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 635));
        jPanel1.setLayout(null);

        premiumRadioButton.setText("Premium");
        jPanel1.add(premiumRadioButton);
        premiumRadioButton.setBounds(130, 460, 90, 23);
        jPanel1.add(passwordTextField);
        passwordTextField.setBounds(70, 120, 210, 30);
        jPanel1.add(emailTextField);
        emailTextField.setBounds(70, 50, 210, 30);

        signupButton.setText("Sign Up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signupButton);
        signupButton.setBounds(180, 160, 80, 25);
        signupButton.getAccessibleContext().setAccessibleName("");

        signinButton.setText("Sign In");
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signinButton);
        signinButton.setBounds(90, 160, 80, 25);
        jPanel1.add(namesurnameTextField);
        namesurnameTextField.setBounds(70, 240, 210, 30);
        jPanel1.add(emailTextField1);
        emailTextField1.setBounds(70, 300, 210, 30);
        jPanel1.add(passwordTextField1);
        passwordTextField1.setBounds(70, 360, 210, 30);

        countryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turkey", "Germany", "Japan", "USA", "UK" }));
        jPanel1.add(countryComboBox);
        countryComboBox.setBounds(70, 420, 210, 30);

        signupButton1.setText("Sign Up");
        signupButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(signupButton1);
        signupButton1.setBounds(130, 500, 90, 25);

        namesurnameLabel.setForeground(new java.awt.Color(0, 0, 0));
        namesurnameLabel.setText("Name Surname");
        jPanel1.add(namesurnameLabel);
        namesurnameLabel.setBounds(70, 210, 210, 30);

        emailLabel2.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel2.setText("e-Mail");
        jPanel1.add(emailLabel2);
        emailLabel2.setBounds(70, 270, 210, 30);

        passwordLabel2.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel2.setText("Password");
        jPanel1.add(passwordLabel2);
        passwordLabel2.setBounds(70, 330, 210, 30);

        countryLabel.setForeground(new java.awt.Color(0, 0, 0));
        countryLabel.setText("Country");
        jPanel1.add(countryLabel);
        countryLabel.setBounds(70, 390, 210, 30);

        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("e-Mail");
        jPanel1.add(emailLabel);
        emailLabel.setBounds(70, 20, 210, 30);

        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("Password");
        jPanel1.add(passwordLabel);
        passwordLabel.setBounds(70, 90, 210, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/panelBG.jpg"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 1100, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed

        user = P3MusicDB.returnUser();
        try {
            while (user.next()) {
                 if (emailTextField.getText().equalsIgnoreCase(user.getString("email")) && passwordTextField.getText().equals(user.getString("password"))) {
                    if(user.getString("subscription_type").equalsIgnoreCase("PREMIUM")){
                    System.out.println("PREMIUM User Logged In");
                    isPremium=true;
                    signedID=Integer.valueOf(user.getString("user_ID"));
                    signedName=user.getString("user_name");
                    premiumListingInterface.printFollow();
                    premiumListingInterface.setVisible(true);
                    this.setVisible(false);
                    break;
                    }else{
                    System.out.println("NORMAL User Logged In");
                    isPremium=false;
                    signedID=Integer.valueOf(user.getString("user_ID"));
                    signedName=user.getString("user_name");
                    normalListingInterface.printFollow();
                    normalListingInterface.setVisible(true);
                    this.setVisible(false);
                    break;
                    }
                }
                else if(user.isLast()){
                    System.out.println("Wrong E-Mail or Password.  " + emailTextField.getText() + "  " + passwordTextField.getText());
                    signedID=-1;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(LoggingInterface.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_signinButtonActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        namesurnameLabel.setVisible(true);
        emailLabel2.setVisible(true);
        passwordLabel2.setVisible(true);
        countryLabel.setVisible(true);
        signupButton1.setVisible(true);
        countryComboBox.setVisible(true);
        passwordTextField1.setVisible(true);
        emailTextField1.setVisible(true);
        namesurnameTextField.setVisible(true);
        premiumRadioButton.setVisible(true);
        signupButton.setVisible(false);
        signinButton.setLocation(135, 160);
    }//GEN-LAST:event_signupButtonActionPerformed

    private void signupButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButton1ActionPerformed
        String paymentInfo;
        if(premiumRadioButton.getFocusTraversalKeysEnabled()){
            premiumListingInterface.printFollow();
            paymentInfo="PAID";
        }else{
        normalListingInterface.printFollow();
        paymentInfo="NOT PAID";
        }
        insertInfo = "INSERT INTO user(user_ID,user_name,email,password,subscription_type,country,payment_info) VALUES ('"+asciiConverter(namesurnameTextField.getText())+"','"+namesurnameTextField.getText()+"','"+emailTextField1.getText()+"','"+passwordTextField1.getText()+"','"+subType+"','"+countryComboBox.getSelectedItem().toString()+"','"+paymentInfo+"');";
        calculateInfo(insertInfo, evt);
    }//GEN-LAST:event_signupButton1ActionPerformed
    public static int asciiConverter(String name){
    int toplam =0,a=0;
    name= name.replaceAll("\\s+","");
    for(int i = 0;i<name.length();i++){
    a=name.charAt(i);
    toplam+=a;
    }
    return toplam;
    }
    
    public int getSignedID() {
        return signedID;
    }

    public void setSignedID(int signedID) {
        LoggingInterface.signedID = signedID;
    }
    public void calculateInfo(String getInsertInfo, java.awt.event.ActionEvent evt) {

            try {
                P3MusicDB.returnUser().getStatement().executeUpdate(getInsertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
    
}
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoggingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoggingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoggingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoggingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoggingInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> countryComboBox;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField emailTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namesurnameLabel;
    private javax.swing.JTextField namesurnameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField passwordTextField1;
    private javax.swing.JRadioButton premiumRadioButton;
    private javax.swing.JButton signinButton;
    private javax.swing.JButton signupButton;
    private javax.swing.JButton signupButton1;
    // End of variables declaration//GEN-END:variables
}
