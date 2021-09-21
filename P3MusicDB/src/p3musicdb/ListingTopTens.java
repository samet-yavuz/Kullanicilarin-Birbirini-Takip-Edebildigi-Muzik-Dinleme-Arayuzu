package p3musicdb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ListingTopTens extends javax.swing.JFrame {
    public ListingTopTens() {
        initComponents();
        bringItOn();
    }
    DefaultTableModel model1 = new DefaultTableModel(10, 4);
    DefaultTableModel model2 = new DefaultTableModel(10, 4);
    DefaultTableModel model3 = new DefaultTableModel(10, 4);
    DefaultTableModel model4 = new DefaultTableModel(10, 4);
    DefaultTableModel model5 = new DefaultTableModel(10, 5);
    TableModel model;
    String insertInfo;
    int i=1;
    int[] nums;
    ResultSet song = null;
    ResultSet rs = null;
    Object[] songsRows = new Object[5];
    String[] cells = new String[2];
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        addSong = new javax.swing.JButton();
        addList = new javax.swing.JButton();
        returnmainpageButton = new javax.swing.JButton();
        countrylistCB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1290, 755));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(1290, 755));
        jPanel1.setLayout(null);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable5.setMinimumSize(new java.awt.Dimension(400, 330));
        jTable5.setPreferredSize(new java.awt.Dimension(400, 330));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(450, 380, 470, 240);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setMinimumSize(new java.awt.Dimension(400, 330));
        jTable1.setPreferredSize(new java.awt.Dimension(400, 330));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 80, 390, 240);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.setMinimumSize(new java.awt.Dimension(380, 330));
        jTable3.setPreferredSize(new java.awt.Dimension(380, 330));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(870, 80, 390, 240);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setMinimumSize(new java.awt.Dimension(380, 330));
        jTable2.setPreferredSize(new java.awt.Dimension(380, 330));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(450, 80, 390, 240);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable4.setMinimumSize(new java.awt.Dimension(380, 330));
        jTable4.setPreferredSize(new java.awt.Dimension(380, 330));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(40, 380, 390, 240);

        addSong.setText("Add Song");
        addSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongActionPerformed(evt);
            }
        });
        jPanel1.add(addSong);
        addSong.setBounds(990, 360, 90, 40);

        addList.setText("Add List");
        addList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addListActionPerformed(evt);
            }
        });
        jPanel1.add(addList);
        addList.setBounds(1110, 360, 90, 40);

        returnmainpageButton.setText("Return Main Page");
        returnmainpageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnmainpageButtonActionPerformed(evt);
            }
        });
        jPanel1.add(returnmainpageButton);
        returnmainpageButton.setBounds(1110, 630, 130, 50);

        countrylistCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turkey", "USA", "UK", "Germany", "Japan", "France", "Italy" }));
        countrylistCB.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                countrylistCBPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(countrylistCB);
        countrylistCB.setBounds(110, 630, 220, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Most Listened Songs");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(450, 340, 470, 40);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Most Listened Songs by Countries");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 340, 390, 40);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Most Listened CLASSIC Songs");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(880, 40, 390, 40);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Most Listened JAZZ Songs");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(450, 40, 390, 40);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Most Listened POP Songs");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 390, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/toptenBG.jpg"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 1280, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1290, 755);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongActionPerformed
        
        for (int i = 0; i < nums.length; i++) {
        song= P3MusicDB.returnQuarrySongs("select song_ID, type from songs where song_ID IN(select song_ID from songs where song_name LIKE '"+jTable1.getModel().getValueAt(nums[i], 1).toString()+"')");
        try {
            while (song.next()) {
            cells[0] = song.getString("song_ID");
            cells[1] = song.getString("type");
                System.out.println((p3musicdb.LoggingInterface.signedID)+" "+Integer.valueOf(cells[0])+" "+cells[1]);
            }
            insertInfo = "INSERT INTO playlist(user_ID,song_ID,playlist_name) VALUES('"+(p3musicdb.LoggingInterface.signedID)+"','"+Integer.valueOf(cells[0])+"','"+cells[1]+"')";
            
            try {
                P3MusicDB.returnSongs().getStatement().executeUpdate(insertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(ListingTopTens.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
                Logger.getLogger(ListingTopTens.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("song added to your list");
    }//GEN-LAST:event_addSongActionPerformed

    private void addListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addListActionPerformed
    for (int j = 0; j < model.getRowCount(); j++) {

        for (int i = 0; i < nums.length; i++) {
        song= P3MusicDB.returnQuarrySongs("select song_ID, type from songs where song_ID IN(select song_ID from songs where song_name LIKE '"+model.getValueAt(j, 1).toString()+"')");
        try {
            while (song.next()) {
            cells[0] = song.getString("song_ID");
            cells[1] = song.getString("type");
                System.out.println((p3musicdb.LoggingInterface.signedID)+" "+Integer.valueOf(cells[0])+" "+cells[1]);
            }
            insertInfo = "INSERT INTO playlist(user_ID,song_ID,playlist_name) VALUES('"+(p3musicdb.LoggingInterface.signedID)+"','"+Integer.valueOf(cells[0])+"','"+cells[1]+"')";
            
            try {
                P3MusicDB.returnSongs().getStatement().executeUpdate(insertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(ListingTopTens.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
                Logger.getLogger(ListingTopTens.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("song added to your list");    }
    }//GEN-LAST:event_addListActionPerformed

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

    private void countrylistCBPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_countrylistCBPopupMenuWillBecomeInvisible
        insertInfo="Select song_name,artist,views from songs where artist IN( select artist_name from artist where artist_country LIKE '"+countrylistCB.getSelectedItem().toString()+"') order by views DESC LIMIT 10;";
        rs= P3MusicDB.returnQuarrySongs(insertInfo);
        model4.setRowCount(0);
        i=1;
        try {
                    while (rs.next()) {
                        songsRows[0] = i;
                        songsRows[1] = rs.getString("song_name");
                        songsRows[2] = rs.getString("artist");
                        songsRows[3] = rs.getString("views");
                        model4.addRow(songsRows);
                        i++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(PremiumListingInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
        jTable4.setModel(model4);
    }//GEN-LAST:event_countrylistCBPopupMenuWillBecomeInvisible

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        nums=jTable1.getSelectedRows();
        model=model1;
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        nums=jTable2.getSelectedRows();
        model=model2;
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        nums=jTable3.getSelectedRows();
        model=model3;
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        nums=jTable4.getSelectedRows();
        model=model4;
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        nums=jTable5.getSelectedRows();
        model=model5;
    }//GEN-LAST:event_jTable5MouseClicked
    public void bringItOn(){
        insertInfo="Select song_name,artist,views from songs where type LIKE 'Pop' order by views DESC LIMIT 10";
        rs= P3MusicDB.returnQuarrySongs(insertInfo);
        model1.setRowCount(0);
        i=1;
        try {
                    while (rs.next()) {
                        songsRows[0] = i;
                        songsRows[1] = rs.getString("song_name");
                        songsRows[2] = rs.getString("artist");
                        songsRows[3] = rs.getString("views");
                        model1.addRow(songsRows);
                        i++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(PremiumListingInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
        jTable1.setModel(model1);
        
        insertInfo="Select song_name,artist,views from songs where type LIKE 'Jazz' order by views DESC LIMIT 10";
        rs= P3MusicDB.returnQuarrySongs(insertInfo);
        model2.setRowCount(0);
        i=1;
        try {
                    while (rs.next()) {
                        songsRows[0] = i;
                        songsRows[1] = rs.getString("song_name");
                        songsRows[2] = rs.getString("artist");
                        songsRows[3] = rs.getString("views");
                        model2.addRow(songsRows);
                        i++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(PremiumListingInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
        jTable2.setModel(model2);
        
        insertInfo="Select song_name,artist,views from songs where type LIKE 'Classic' order by views DESC LIMIT 10";
        rs= P3MusicDB.returnQuarrySongs(insertInfo);
        model3.setRowCount(0);
        i=1;
        try {
                    while (rs.next()) {
                        songsRows[0] = i;
                        songsRows[1] = rs.getString("song_name");
                        songsRows[2] = rs.getString("artist");
                        songsRows[3] = rs.getString("views");
                        model3.addRow(songsRows);
                        i++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(PremiumListingInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
        jTable3.setModel(model3);
        
        insertInfo="Select song_name,artist,views from songs where artist IN( select artist_name from artist where artist_country LIKE '"+countrylistCB.getSelectedItem().toString()+"') order by views DESC LIMIT 10;";
        rs= P3MusicDB.returnQuarrySongs(insertInfo);
        model4.setRowCount(0);
        i=1;
        try {
                    while (rs.next()) {
                        songsRows[0] = i;
                        songsRows[1] = rs.getString("song_name");
                        songsRows[2] = rs.getString("artist");
                        songsRows[3] = rs.getString("views");
                        model4.addRow(songsRows);
                        i++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(PremiumListingInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
        jTable4.setModel(model4);
        
        insertInfo="SELECT song_name,artist,views,artist_country FROM songs,artist where artist_name=artist order by views DESC LIMIT 10";
        rs= P3MusicDB.returnQuarrySongs(insertInfo);
        model5.setRowCount(0);
        i=1;
        try {
                    while (rs.next()) {
                        songsRows[0] = i;
                        songsRows[1] = rs.getString("song_name");
                        songsRows[2] = rs.getString("artist");
                        songsRows[3] = rs.getString("views");
                        songsRows[4] = rs.getString("artist_country");
                        model5.addRow(songsRows);
                        i++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(PremiumListingInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
        jTable5.setModel(model5);
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
            java.util.logging.Logger.getLogger(ListingTopTens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListingTopTens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListingTopTens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListingTopTens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListingTopTens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addList;
    private javax.swing.JButton addSong;
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> countrylistCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JButton returnmainpageButton;
    // End of variables declaration//GEN-END:variables
}
