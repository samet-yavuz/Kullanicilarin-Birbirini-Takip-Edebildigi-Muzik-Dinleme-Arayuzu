package p3musicdb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class UserPageInterface extends javax.swing.JFrame {
static ResultSet songs = null;
static ResultSet songs1 = null;
static ResultSet songs2 = null;
Object[] playlistRows = new Object[3];
DefaultTableModel modelPop = new DefaultTableModel(10, 3);
DefaultTableModel modelJazz = new DefaultTableModel(10, 3);
DefaultTableModel modelClassic = new DefaultTableModel(10, 3);
String insertInfo;
int[] nums;
int check;
    public UserPageInterface() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        popTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jazzTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        classicTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        returnmainpageButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        classiclist = new javax.swing.JLabel();
        poplist = new javax.swing.JLabel();
        jazzlist = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1105, 625));
        setPreferredSize(new java.awt.Dimension(1110, 635));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(1110, 635));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(null);

        popTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Song", "Artist", "Views"
            }
        ));
        popTable.setMinimumSize(new java.awt.Dimension(300, 64));
        popTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(popTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 170, 330, 260);

        jazzTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Song", "Artist", "Views"
            }
        ));
        jazzTable.setMinimumSize(new java.awt.Dimension(300, 64));
        jazzTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jazzTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jazzTable);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(380, 170, 340, 260);

        classicTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Song", "Artist", "Views"
            }
        ));
        classicTable.setMinimumSize(new java.awt.Dimension(300, 64));
        classicTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classicTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(classicTable);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(750, 170, 330, 260);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton);
        deleteButton.setBounds(480, 480, 130, 40);

        returnmainpageButton.setText("Return Main Page");
        returnmainpageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnmainpageButtonActionPerformed(evt);
            }
        });
        jPanel1.add(returnmainpageButton);
        returnmainpageButton.setBounds(20, 20, 150, 60);

        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton);
        logoutButton.setBounds(1010, 520, 72, 60);

        classiclist.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        classiclist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classiclist.setText("CLASSIC LIST");
        jPanel1.add(classiclist);
        classiclist.setBounds(750, 130, 330, 30);

        poplist.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        poplist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        poplist.setText("POP LIST");
        jPanel1.add(poplist);
        poplist.setBounds(20, 130, 330, 30);

        jazzlist.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jazzlist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jazzlist.setText("JAZZ LIST");
        jPanel1.add(jazzlist);
        jazzlist.setBounds(380, 130, 340, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/panelBG.jpg"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 1100, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String cell=null;
        
    switch (check) {
        case 0:
            for(int i=0;i<nums.length;i++){
            cell = popTable.getModel().getValueAt(nums[i], 0).toString();
             insertInfo = "Delete from playlist where user_ID ="+LoggingInterface.signedID+" and (song_ID IN (select song_ID from songs where song_name LIKE '"+cell+"'))";
             try {
                P3MusicDB.returnPlaylist().getStatement().execute(insertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            printPop();
            break;
        case 1:
            for(int i=0;i<nums.length;i++){
            cell = jazzTable.getModel().getValueAt(nums[i], 0).toString();
             insertInfo = "Delete from playlist where user_ID ="+LoggingInterface.signedID+" and (song_ID IN (select song_ID from songs where song_name LIKE '"+cell+"'))";
             try {
                P3MusicDB.returnPlaylist().getStatement().execute(insertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            printJazz();
            break;
        case 2:
            for(int i=0;i<nums.length;i++){
            cell = classicTable.getModel().getValueAt(nums[i], 0).toString();
             insertInfo = "Delete from playlist where user_ID ="+LoggingInterface.signedID+" and (song_ID IN (select song_ID from songs where song_name LIKE '"+cell+"'))";
             try {
                P3MusicDB.returnPlaylist().getStatement().execute(insertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            printClassic();
            break;
        default:
            break;
    }

        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void returnmainpageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnmainpageButtonActionPerformed
        NormalListingInterface normalListingInterface = new NormalListingInterface();
        PremiumListingInterface premiumListingInterface = new PremiumListingInterface();
        if(LoggingInterface.isPremium){
            premiumListingInterface.setVisible(true);
            this.setVisible(false);
        }else{
            normalListingInterface.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_returnmainpageButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        WhoAreYou whoAreYou = new WhoAreYou();
        whoAreYou.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void popTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popTableMouseClicked
        nums= popTable.getSelectedRows();
        check=0;
    }//GEN-LAST:event_popTableMouseClicked

    private void jazzTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jazzTableMouseClicked
        nums=jazzTable.getSelectedRows();
        check=1;
    }//GEN-LAST:event_jazzTableMouseClicked

    private void classicTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicTableMouseClicked
        nums=classicTable.getSelectedRows();
        check=2;
    }//GEN-LAST:event_classicTableMouseClicked
public void printPop(){
    insertInfo="select song_name,artist,views from songs where song_ID IN(select song_ID from playlist where user_ID = "+LoggingInterface.signedID+" and (playlist_name LIKE 'Pop'))";
        songs = P3MusicDB.returnQuarrySongs(insertInfo);
        modelPop.setRowCount(0);
        
        try {
            while (songs.next()) {
                playlistRows[0] = songs.getString("song_name");
                playlistRows[1] = songs.getString("artist");
                playlistRows[2] = songs.getString("views");
                modelPop.addRow(playlistRows);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserPageInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        popTable.setModel(modelPop);

}
public void printJazz(){
    insertInfo="select song_name,artist,views from songs where song_ID IN(select song_ID from playlist where user_ID = "+LoggingInterface.signedID+" and (playlist_name LIKE 'Jazz'))";
        songs1 = P3MusicDB.returnQuarrySongs(insertInfo);
        modelJazz.setRowCount(0);

        try {
            while (songs1.next()) {
                playlistRows[0] = songs1.getString("song_name");
                playlistRows[1] = songs1.getString("artist");
                playlistRows[2] = songs1.getString("views");
                modelJazz.addRow(playlistRows);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserPageInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        jazzTable.setModel(modelJazz);

}
public void printClassic(){
        insertInfo="select song_name,artist,views from songs where song_ID IN(select song_ID from playlist where user_ID = "+LoggingInterface.signedID+" and (playlist_name LIKE 'Classic'))";
        songs2 = P3MusicDB.returnQuarrySongs(insertInfo);
        modelClassic.setRowCount(0);

        try {
            while (songs2.next()) {
                playlistRows[0] = songs2.getString("song_name");
                playlistRows[1] = songs2.getString("artist");
                playlistRows[2] = songs2.getString("views");
                modelClassic.addRow(playlistRows);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserPageInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        classicTable.setModel(modelClassic);

}
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
            java.util.logging.Logger.getLogger(UserPageInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPageInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPageInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPageInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPageInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTable classicTable;
    private javax.swing.JLabel classiclist;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jazzTable;
    private javax.swing.JLabel jazzlist;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTable popTable;
    private javax.swing.JLabel poplist;
    private javax.swing.JButton returnmainpageButton;
    // End of variables declaration//GEN-END:variables
}
