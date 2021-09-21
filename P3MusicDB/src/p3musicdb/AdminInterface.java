package p3musicdb;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminInterface extends javax.swing.JFrame {

    static ResultSet artist = null;
    static ResultSet songs = null;
    static ResultSet user = null;
    static ResultSet playlist = null;
    Object[] artistRows = new Object[3];
    Object[] songsRows = new Object[8];
    String[] userRows = new String[7];
    Object[] playlistRows = new Object[4];
    static ResultSet album = null;
    Object[] albumRows = new Object[2];
    ArrayList<String> headsets;
    String comboModelNames;
    int i;
    DefaultTableModel model = new DefaultTableModel(10, 2);
    DefaultComboBoxModel comboModel = new DefaultComboBoxModel<>();
    String insertInfo;
    static int control;

    public AdminInterface() {
        initComponents();
        listPlaylist.setEnabled(false);
        deleteButton.setEnabled(false);
        listalbumsButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        artistButton = new javax.swing.JButton();
        listalbumsButton = new javax.swing.JButton();
        songsButton = new javax.swing.JButton();
        userButton = new javax.swing.JButton();
        listPlaylist = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setSize(new java.awt.Dimension(1110, 635));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(1110, 635));
        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 635));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setMinimumSize(new java.awt.Dimension(300, 64));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 40, 710, 330);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(860, 70, 200, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(860, 100, 200, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(860, 130, 200, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(860, 160, 200, 30);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(860, 190, 200, 30);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(860, 220, 200, 30);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(860, 250, 200, 30);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(860, 280, 200, 30);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton);
        addButton.setBounds(880, 350, 70, 25);

        artistButton.setText("List the Artist");
        artistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistButtonActionPerformed(evt);
            }
        });
        jPanel1.add(artistButton);
        artistButton.setBounds(40, 410, 110, 40);

        listalbumsButton.setText("List Albums");
        listalbumsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listalbumsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(listalbumsButton);
        listalbumsButton.setBounds(480, 410, 110, 40);

        songsButton.setText("List the Songs");
        songsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(songsButton);
        songsButton.setBounds(180, 410, 120, 40);

        userButton.setText("List the Users");
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });
        jPanel1.add(userButton);
        userButton.setBounds(330, 410, 120, 40);

        listPlaylist.setText("List the Playlists");
        listPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPlaylistActionPerformed(evt);
            }
        });
        jPanel1.add(listPlaylist);
        listPlaylist.setBounds(170, 480, 130, 25);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("1.sütun");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(800, 70, 50, 30);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("2.sütun");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(800, 100, 50, 30);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("3.sütun");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(800, 130, 50, 30);

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("4.sütun");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(800, 160, 50, 30);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("5.sütun");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(800, 190, 50, 30);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("6.sütun");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(800, 220, 50, 30);

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("7.sütun");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(800, 250, 50, 30);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("8.sütun");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(800, 280, 50, 30);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton);
        deleteButton.setBounds(650, 410, 64, 25);

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton);
        updateButton.setBounds(970, 350, 70, 25);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/panelBG.jpg"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 1100, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (control == 1) {
            insertInfo = "INSERT INTO artist(artist_ID,artist_name,artist_country) VALUES (" + "'" + LoggingInterface.asciiConverter(jTextField2.getText()) + "'," + "'" + jTextField2.getText() + "'," + "'" + jTextField3.getText() + "')";
        } else if (control == 2) {
            insertInfo = "INSERT INTO songs(song_ID,song_name,date,artist,album,type,views,duration) VALUES (" + "'" + jTextField2.getText() + "'," + "'" + jTextField3.getText() + "'," + "'" + jTextField4.getText() + "'," + "'" + jTextField5.getText() + "'," + "'" + jTextField6.getText() + "'," + "'" + jTextField7.getText() + "'," + "'" + jTextField8.getText() + "')";
        } else if (control == 3) {
            insertInfo = "INSERT INTO user(user_ID,user_name,email,password,subscription_type,country,payment_info) VALUES (" + "'" + LoggingInterface.asciiConverter(jTextField2.getText()) + "'," + "'" + jTextField2.getText() + "'," + "'" + jTextField3.getText() + "'," + "'" + jTextField4.getText() + "'," + "'" + jTextField5.getText() + "'," + "'" + jTextField6.getText() + "'" + jTextField7.getText() + "')";
        }
        calculateInfo(insertInfo, evt);
    }//GEN-LAST:event_addButtonActionPerformed

    private void artistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistButtonActionPerformed
        model.setColumnCount(3);
        listPlaylist.setEnabled(false);
        control = 1;
        listalbumsButton.setEnabled(false);
        deleteButton.setEnabled(false);
        jTextField1.setVisible(true);
        jLabel1.setVisible(true);
        jTextField2.setVisible(true);
        jLabel2.setVisible(true);
        jTextField3.setVisible(true);
        jLabel3.setVisible(true);
        jTextField4.setVisible(false);
        jLabel4.setVisible(false);
        jTextField5.setVisible(false);
        jLabel5.setVisible(false);
        jTextField6.setVisible(false);
        jLabel6.setVisible(false);
        jTextField7.setVisible(false);
        jLabel7.setVisible(false);
        jTextField8.setVisible(false);
        jLabel8.setVisible(false);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");

        if (isQuery) {
            artist = P3MusicDB.returnQuarryArtist(insertInfo);
        } else {
            artist = P3MusicDB.returnArtist();
        }

        model.setRowCount(0);
        print(artist, 1);
        jTable1.setModel(model);
    }//GEN-LAST:event_artistButtonActionPerformed

    private void songsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songsButtonActionPerformed
        control = 2;
        model.setColumnCount(8);
        listalbumsButton.setEnabled(false);
        deleteButton.setEnabled(false);
        jTextField1.setVisible(true);
        jLabel1.setVisible(true);
        jTextField2.setVisible(true);
        jLabel2.setVisible(true);
        jTextField3.setVisible(true);
        jLabel3.setVisible(true);
        jTextField4.setVisible(true);
        jLabel4.setVisible(true);
        jTextField5.setVisible(true);
        jLabel5.setVisible(true);
        jTextField6.setVisible(true);
        jLabel6.setVisible(true);
        jTextField7.setVisible(true);
        jLabel7.setVisible(true);
        jTextField8.setVisible(true);
        jLabel8.setVisible(true);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");

        if (isQuery) {
            songs = P3MusicDB.returnQuarrySongs(insertInfo);
        } else {
            songs = P3MusicDB.returnSongs();
        }
        model.setRowCount(0);
        print(songs, 2);
        jTable1.setModel(model);
        listPlaylist.setEnabled(false);
    }//GEN-LAST:event_songsButtonActionPerformed

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed
        model.setColumnCount(7);
        listPlaylist.setEnabled(false);
        listalbumsButton.setEnabled(false);
        deleteButton.setEnabled(false);
        control = 3;
        jTextField1.setVisible(true);
        jLabel1.setVisible(true);
        jTextField2.setVisible(true);
        jLabel2.setVisible(true);
        jTextField3.setVisible(true);
        jLabel3.setVisible(true);
        jTextField4.setVisible(true);
        jLabel4.setVisible(true);
        jTextField5.setVisible(true);
        jLabel5.setVisible(true);
        jTextField6.setVisible(true);
        jLabel6.setVisible(true);
        jTextField7.setVisible(true);
        jLabel7.setVisible(true);
        jTextField8.setVisible(false);
        jLabel8.setVisible(false);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        if (isQuery) {
            user = P3MusicDB.returnQuarryUser(insertInfo);
        } else {
            insertInfo = "SELECT * FROM user WHERE subscription_type LIKE 'PREMIUM' or subscription_type LIKE 'NORMAL'";
            user = P3MusicDB.returnQuarryUser(insertInfo);
        }
        model.setRowCount(0);
        print(user, 3);
        jTable1.setModel(model);
    }//GEN-LAST:event_userButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        listalbumsButton.setEnabled(false);
        int[] nums = jTable1.getSelectedRows();
        String insertInfo2;
        for (int i = 0; i < nums.length; i++) {
            String cell = jTable1.getModel().getValueAt(nums[i], 0).toString();
            String cell2 = jTable1.getModel().getValueAt(nums[i], 1).toString();
            System.out.println(nums[i] + "-------" + cell);
            if (control == 1) {
                insertInfo = "DELETE FROM artist WHERE (artist_ID=" + Integer.valueOf(cell) + ")";
                insertInfo2 = "DELETE FROM songs WHERE artist IN(SELECT artist_name FROM artist WHERE artist_ID =" + Integer.valueOf(cell) + ")";
                calculateInfo(insertInfo2, evt);
                insertInfo2 = "DELETE FROM album WHERE artist IN(SELECT artist_name FROM artist WHERE artist_ID =" + Integer.valueOf(cell) + ")";
                calculateInfo(insertInfo2, evt);
                insertInfo2 = "DELETE from playlist where song_ID IN(select song_ID from songs where artist IN (select artist_name from artist where artist_ID =" + Integer.valueOf(cell) + "))";
                calculateInfo(insertInfo2, evt);
            } else if (control == 2) {
                insertInfo = "DELETE FROM songs WHERE (song_ID=" + Integer.valueOf(cell) + ")";
                insertInfo2 = "DELETE FROM playlist WHERE (song_ID=" + Integer.valueOf(cell) + ")";
                calculateInfo(insertInfo2, evt);
                insertInfo2 = "DELETE FROM album WHERE (song_ID=" + Integer.valueOf(cell) + ")";
                calculateInfo(insertInfo2, evt);
            } else if (control == 3) {
                insertInfo = "DELETE FROM user WHERE (user_ID=" + Integer.valueOf(cell) + ")";
                insertInfo2 = "DELETE FROM playlist WHERE (user_ID=" + Integer.valueOf(cell) + ")";
                calculateInfo(insertInfo2, evt);
            } else if (control == 4) {
                isQuery=false;
                insertInfo = "DELETE FROM album WHERE (artist=(Select artist_name from artist where artist_ID="+chosenID+") and album_name ='"+cell2+"')";
                insertInfo2 = "DELETE FROM playlist WHERE song_ID IN(select song_ID from songs where song_ID IN (select song_ID from songs where  (artist='" + cell + "' and album = '"+cell2+"')))";
                calculateInfo(insertInfo2, evt);
                insertInfo2 = "DELETE FROM songs WHERE (artist='" + cell + "' and album = '"+cell2+"')";
                calculateInfo(insertInfo2, evt);
            }
            calculateInfo(insertInfo, evt);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed
    boolean isQuery;
    int chosenID;
    private void listPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPlaylistActionPerformed
listalbumsButton.setEnabled(false);

        if (i == 0) {
            System.out.println("i=0");
            
            isQuery = true;
            chosenID = Integer.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString());
            insertInfo = "SELECT Distinct playlist_name FROM proje_3.playlist where user_ID=" + chosenID;
            model.setColumnCount(1);
            playlistperform(insertInfo);
            control=100;
            i++;
        } else if (i == 1) {
            System.out.println("i=1");
            int[] nums = jTable1.getSelectedRows();
            for (int i = 0; i < nums.length; i++) {
                
                String cell = jTable1.getModel().getValueAt(nums[i], 0).toString();
                System.out.println(nums[i] + " ------- " + cell);
                if (cell.equalsIgnoreCase("Pop")) {
                    insertInfo = "SELECT * FROM proje_3.songs WHERE song_ID IN (SELECT song_ID FROM proje_3.playlist where user_ID = " + chosenID + " and playlist_name LIKE 'Pop')";
                } else if (cell.equalsIgnoreCase("Jazz")) {
                    insertInfo = "SELECT * FROM proje_3.songs where song_ID IN (SELECT song_ID FROM proje_3.playlist where user_ID=" + chosenID + " and playlist_name LIKE 'Jazz')";
                } else if (cell.equalsIgnoreCase("Classic")) {
                    insertInfo = "SELECT * FROM proje_3.songs where song_ID IN (SELECT song_ID FROM proje_3.playlist where user_ID=" + chosenID + " and playlist_name LIKE 'Classic')";
                }
                model.setColumnCount(8);
                isQuery = true;
                songsButtonActionPerformed(evt);
                isQuery = false;

            }
            i = 0;
        }
    }//GEN-LAST:event_listPlaylistActionPerformed
String[] selecteds = new String[8];
String[] entries = new String[8];
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(control==3){
            listPlaylist.setEnabled(true);
        }
        if(control==1){
            listalbumsButton.setEnabled(true);
        }
        deleteButton.setEnabled(true);
        jTextField1.setEditable(false);
        int row = jTable1.getSelectedRow();
        String selection = jTable1.getModel().getValueAt(row, 0).toString();
        
        if (control == 1) {
            insertInfo = "select * from artist where artist_ID = " + selection;
            artist = P3MusicDB.returnQuarryArtist(insertInfo);
            try {
                if (artist.next()) {
                    jTextField1.setText(artist.getString("artist_ID"));
                    jTextField2.setText(artist.getString("artist_name"));
                    jTextField3.setText(artist.getString("artist_country"));
                }
                selecteds[0]=jTable1.getModel().getValueAt(row, 0).toString();
                    selecteds[1]=jTable1.getModel().getValueAt(row, 1).toString();
                    selecteds[2]=jTable1.getModel().getValueAt(row, 2).toString();
            } catch (SQLException ex) {
                Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (control == 2) {
            insertInfo = "select * from songs where song_ID = " + selection;
            songs = P3MusicDB.returnQuarrySongs(insertInfo);
            try {
                if (songs.next()) {
                    jTextField1.setText(songs.getString("song_ID"));
                    jTextField2.setText(songs.getString("song_name"));
                    jTextField3.setText(songs.getString("date"));
                    jTextField4.setText(songs.getString("artist"));
                    jTextField5.setText(songs.getString("album"));
                    jTextField6.setText(songs.getString("type"));
                    jTextField7.setText(songs.getString("views"));
                    jTextField8.setText(songs.getString("duration"));
                }
                selecteds[0]=jTable1.getModel().getValueAt(row, 0).toString();
                    selecteds[1]=jTable1.getModel().getValueAt(row, 1).toString();
                    selecteds[2]=jTable1.getModel().getValueAt(row, 2).toString();
                    selecteds[3]=jTable1.getModel().getValueAt(row, 3).toString();
                    selecteds[4]=jTable1.getModel().getValueAt(row, 4).toString();
                    selecteds[5]=jTable1.getModel().getValueAt(row, 5).toString();
                    selecteds[6]=jTable1.getModel().getValueAt(row, 6).toString();
                    selecteds[7]=jTable1.getModel().getValueAt(row, 7).toString();
            } catch (SQLException ex) {
                Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (control == 3) {
            insertInfo = "select * from user where user_ID = " + selection;
            user = P3MusicDB.returnQuarryUser(insertInfo);
            try {
                if (user.next()) {
                    jTextField1.setText(user.getString("user_ID"));
                    jTextField2.setText(user.getString("user_name"));
                    jTextField3.setText(user.getString("email"));
                    jTextField4.setText(user.getString("password"));
                    jTextField5.setText(user.getString("subscription_type"));
                    jTextField6.setText(user.getString("country"));
                    jTextField7.setText(user.getString("payment_info"));
                }
                selecteds[0]=jTable1.getModel().getValueAt(row, 0).toString();
                    selecteds[1]=jTable1.getModel().getValueAt(row, 1).toString();
                    selecteds[2]=jTable1.getModel().getValueAt(row, 2).toString();
                    selecteds[3]=jTable1.getModel().getValueAt(row, 3).toString();
                    selecteds[4]=jTable1.getModel().getValueAt(row, 4).toString();
                    selecteds[5]=jTable1.getModel().getValueAt(row, 5).toString();
                    selecteds[6]=jTable1.getModel().getValueAt(row, 6).toString();
            } catch (SQLException ex) {
                Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String insertInfo2;
        entries[0]=jTextField1.getText();
        entries[1]=jTextField2.getText();
        entries[2]=jTextField3.getText();
        entries[3]=jTextField4.getText();
        entries[4]=jTextField5.getText();
        entries[5]=jTextField6.getText();
        entries[6]=jTextField7.getText();
        entries[7]=jTextField8.getText();
        if (control == 1) {

            insertInfo = "Update artist set artist_name='" + entries[1] + "',artist_country='" + entries[2] + "' where artist_ID=" + Integer.valueOf(entries[0]);
            insertInfo2 = "Update songs set artist='" + entries[1] + "' where artist IN (select artist_name from artist where artist_ID=" + Integer.valueOf(entries[0]) + ")";
            calculateInfo(insertInfo2, evt);
            insertInfo2 = "Update album set artist='" + entries[1] + "' where artist IN (select artist_name from artist where artist_ID=" + Integer.valueOf(entries[0]) + ")";
            calculateInfo(insertInfo2, evt);
        } else if (control == 2) {
                    
            insertInfo = "Update songs set song_name='" + entries[1] + "',date='" + entries[2] + "',artist='" + entries[3] + "',album='" + entries[4] + "',type='" + entries[5] + "',views=" + entries[6] + ",duration='" + entries[7] + "' where song_ID=" + Integer.valueOf(entries[0]);
            insertInfo2 = "Update artist set artist_name='" + entries[3] + "' where artist_name IN(Select artist from songs where song_ID=" + Integer.valueOf(entries[0]) + ")";
            calculateInfo(insertInfo2, evt);
            insertInfo2 = "Update album set artist='" + entries[3] +"',album_name='" + entries[4] + "',album_type='" + entries[5] + "' where album_name LIKE (select album from songs where song_ID='" + entries[0] + "')";
            calculateInfo(insertInfo2, evt);
            insertInfo2 = "Update songs set album='" + entries[4] + "' where song_ID IN(Select song_ID from album where (album_name='" + selecteds[4] + "' and artist LIKE '" + selecteds[3] +"'))";
            calculateInfo(insertInfo2, evt);
        } else if (control == 3) {
            insertInfo = "Update user set  user_name='" + entries[1] + "',email='" + entries[2] + "',password='" + entries[3] + "',subscription_type='" + entries[4] + "',country='" + entries[5] + "',payment_info='" + entries[6] + "' where user_ID=" + Integer.valueOf(entries[0]);
        }
        calculateInfo(insertInfo, evt);
        jTextField1.setEditable(true);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void listalbumsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listalbumsButtonActionPerformed
        if (i == 0) {
            isQuery = true;
            control=4;
            chosenID = Integer.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString());
            insertInfo = "SELECT Distinct album_type FROM album";
            model.setColumnCount(1);
            album = P3MusicDB.returnQuarryAlbum(insertInfo);
            model.setRowCount(0);

            try {
                while (album.next()) {
                    albumRows[0] = album.getString("album_type");
                    model.addRow(albumRows);
                }
                 jTable1.setModel(model);
                headsets = getHeaders(album);
                for (int j = 0; j < headsets.size(); j++) {
                    ChangeName(jTable1, j, headsets.get(j));
                }
            } catch (SQLException ex) {
                Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            isQuery = false;
            i++;

        } else if (i == 1) {

            int[] nums = jTable1.getSelectedRows();
            model.setColumnCount(2);
            for (int i = 0; i < nums.length; i++) {
                String cell = jTable1.getModel().getValueAt(nums[i], 0).toString();
                System.out.println(nums[i] + " ------- " + cell);
                if (cell.equalsIgnoreCase("Pop")) {
                    insertInfo = "select distinct artist,album_name from album where artist IN(select artist_name from artist where artist_ID = "+ chosenID +" and album_type LIKE 'Pop')";
                } else if (cell.equalsIgnoreCase("Jazz")) {
                    insertInfo = "select distinct artist,album_name from album where artist IN(select artist_name from artist where artist_ID = "+ chosenID +" and album_type LIKE 'Jazz')";
                } else if (cell.equalsIgnoreCase("Classic")) {
                    insertInfo = "select distinct artist,album_name from album where artist IN(select artist_name from artist where artist_ID = "+ chosenID +" and album_type LIKE 'Classic')";
                }
                isQuery = true;
                if (isQuery) {
                    album = P3MusicDB.returnQuarryAlbum(insertInfo);
                } else {
                    album = P3MusicDB.returnAlbum();
                }
                
                model.setRowCount(0);
                print(album, 6);
                jTable1.setModel(model);
                isQuery = false;
                listalbumsButton.setEnabled(false);
                control = 4;
            }
            i = 0;
        }

    }//GEN-LAST:event_listalbumsButtonActionPerformed
    public void print(ResultSet rs, int table) {
        switch (table) {
            case 1:
                try {
                    while (rs.next()) {
                        artistRows[0] = rs.getString("artist_ID");
                        artistRows[1] = rs.getString("artist_name");
                        artistRows[2] = rs.getString("artist_country");
                        model.addRow(artistRows);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTable1.setModel(model);
                headsets=getHeaders(rs);
                for (int j = 0; j < headsets.size(); j++) {
                ChangeName(jTable1,j,headsets.get(j));}
                break;
            case 2:
                try {
                    while (rs.next()) {
                        songsRows[0] = rs.getString("song_ID");
                        songsRows[1] = rs.getString("song_name");
                        songsRows[2] = rs.getString("date");
                        songsRows[3] = rs.getString("artist");
                        songsRows[4] = rs.getString("album");
                        songsRows[5] = rs.getString("type");
                        songsRows[6] = rs.getString("views");
                        songsRows[7] = rs.getString("duration");
                        model.addRow(songsRows);
                    }
                    jTable1.setModel(model);
                headsets=getHeaders(rs);
                for (int j = 0; j < headsets.size(); j++) {
                ChangeName(jTable1,j,headsets.get(j));}
                } catch (SQLException ex) {
                    Logger.getLogger(PremiumListingInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3:
                try {
                    while (rs.next()) {
                        userRows[0] = rs.getString("user_ID");
                        userRows[1] = rs.getString("user_name");
                        userRows[2] = rs.getString("email");
                        userRows[3] = rs.getString("password");
                        userRows[4] = rs.getString("subscription_type");
                        userRows[5] = rs.getString("country");
                        userRows[6] = rs.getString("payment_info");
                        model.addRow(userRows);
                    }
                    jTable1.setModel(model);
                headsets=getHeaders(rs);
                for (int j = 0; j < headsets.size(); j++) {
                ChangeName(jTable1,j,headsets.get(j));}
                } catch (SQLException ex) {
                    Logger.getLogger(PremiumListingInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 4:
                try {
                    while (rs.next()) {
                        if (i == 0) {
                            playlistRows[0] = rs.getString("playlist_name");
                        } else if (i == 1) {
                            playlistRows[0] = rs.getString("song_name");
                        }
                        model.addRow(playlistRows);
                    }
                    jTable1.setModel(model);
                headsets=getHeaders(rs);
                for (int j = 0; j < headsets.size(); j++) {
                ChangeName(jTable1,j,headsets.get(j));}
                } catch (SQLException ex) {
                    Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
                case 6:
                try {
                    while (rs.next()) {
                            albumRows[0] = rs.getString("artist");
                            albumRows[1] = rs.getString("album_name");
                        model.addRow(albumRows);
                    }
                     jTable1.setModel(model);
                headsets=getHeaders(rs);
                for (int j = 0; j < headsets.size(); j++) {
                ChangeName(jTable1,j,headsets.get(j));
            }
                } catch (SQLException ex) {
                    Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            default:
                break;
        }
    }

    public void playlistperform(String q) {
        if(isQuery){
            playlist = P3MusicDB.returnQuarryPlaylist(q);
        }else{
            playlist = P3MusicDB.returnPlaylist();
        }
        model.setRowCount(0);

        try {
            while (playlist.next()) {
                if (i == 0) {
                    playlistRows[0] = playlist.getString("playlist_name");
                } else if (i == 1) {
                    playlistRows[0] = playlist.getString("song_name");
                }
                model.addRow(playlistRows);
            }
            jTable1.setModel(model);
                headsets=getHeaders(playlist);
                for (int j = 0; j < headsets.size(); j++) {
                ChangeName(jTable1,j,headsets.get(j));}
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void calculateInfo(String getInsertInfo, java.awt.event.ActionEvent evt) {
        if (control == 1) {
            try {
                P3MusicDB.returnArtist().getStatement().executeUpdate(getInsertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            artistButtonActionPerformed(evt);
        } else if (control == 2) {
            try {
                P3MusicDB.returnSongs().getStatement().executeUpdate(getInsertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            songsButtonActionPerformed(evt);
        } else if (control == 3) {
            try {
                P3MusicDB.returnUser().getStatement().executeUpdate(getInsertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            userButtonActionPerformed(evt);
        } else if (control == 4) {
            try {
                P3MusicDB.returnPlaylist().getStatement().executeUpdate(getInsertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            playlistperform(getInsertInfo);
        }

    }

    public void ChangeName(JTable table, int col_index, String col_name) {
        table.getColumnModel().getColumn(col_index).setHeaderValue(col_name);
    }

    public ArrayList getHeaders(ResultSet rs) {
        ArrayList<String> headers = new ArrayList<String>();
        ResultSetMetaData rsmd;
        try {
            rsmd = rs.getMetaData();
            for (int j = 0; j < rsmd.getColumnCount(); j++) {
                headers.add(j, rsmd.getColumnName(j + 1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
        }

        return headers;
    }

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
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton artistButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton listPlaylist;
    private javax.swing.JButton listalbumsButton;
    private javax.swing.JButton songsButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton userButton;
    // End of variables declaration//GEN-END:variables
}
