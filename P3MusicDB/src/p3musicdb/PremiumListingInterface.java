package p3musicdb;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static p3musicdb.NormalListingInterface.album;
import static p3musicdb.NormalListingInterface.artist;
import static p3musicdb.NormalListingInterface.follower;
import static p3musicdb.NormalListingInterface.playlist;
import static p3musicdb.NormalListingInterface.songs;
import static p3musicdb.NormalListingInterface.user;
import static p3musicdb.UserPageInterface.songs;

public class PremiumListingInterface extends javax.swing.JFrame {
    
    static ResultSet artist = null;
    static ResultSet songs = null;
    static ResultSet user = null;
    static ResultSet playlist = null;
    static ResultSet follower = null;
    static ResultSet album = null;
    Object[] artistRows = new Object[3];
    Object[] songsRows = new Object[8];
    String[] userRows = new String[6];
    Object[] playlistRows = new Object[4];
    Object[] followerRows = new Object[2];
    Object[] albumRows = new Object[2];
    String insertInfo;
    boolean followCheck=false;
    ArrayList<String> headsets;
    UserPageInterface userPageInterface =new UserPageInterface();

    DefaultTableModel model = new DefaultTableModel(10, 8);
    DefaultTableModel modelFollow = new DefaultTableModel(10, 2);
    int control;
    int i=0,check=0;
    int chosenID ;
    boolean isQuery=false;
    public PremiumListingInterface() {
        initComponents();
        printFollow();
        gotopageButton.setEnabled(false);
        listalbumsButton.setEnabled(false);
        addtomylistButton.setEnabled(false);
        followButton.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        followTable = new javax.swing.JTable();
        listalbumsButton = new javax.swing.JButton();
        gotopageButton = new javax.swing.JButton();
        songsButton = new javax.swing.JButton();
        userButton = new javax.swing.JButton();
        addtomylistButton = new javax.swing.JButton();
        followButton = new javax.swing.JButton();
        artistButton = new javax.swing.JButton();
        myprofileButton = new javax.swing.JButton();
        toptensButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1110, 635));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(1110, 635));
        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 635));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 40, 660, 320);

        followTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(followTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(810, 100, 200, 260);

        listalbumsButton.setText("List Albums");
        listalbumsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listalbumsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(listalbumsButton);
        listalbumsButton.setBounds(340, 450, 110, 40);

        gotopageButton.setText("Go To Page");
        gotopageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotopageButtonActionPerformed(evt);
            }
        });
        jPanel1.add(gotopageButton);
        gotopageButton.setBounds(480, 420, 110, 40);

        songsButton.setText("List the Songs");
        songsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(songsButton);
        songsButton.setBounds(180, 390, 130, 40);

        userButton.setText("List the User");
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });
        jPanel1.add(userButton);
        userButton.setBounds(340, 390, 110, 40);

        addtomylistButton.setText("Add to My List");
        addtomylistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtomylistButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addtomylistButton);
        addtomylistButton.setBounds(40, 450, 110, 40);

        followButton.setText("Follow/Unfollow");
        followButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followButtonActionPerformed(evt);
            }
        });
        jPanel1.add(followButton);
        followButton.setBounds(180, 450, 130, 40);

        artistButton.setText("List the Artist");
        artistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistButtonActionPerformed(evt);
            }
        });
        jPanel1.add(artistButton);
        artistButton.setBounds(40, 390, 110, 40);

        myprofileButton.setText("My Profile");
        myprofileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprofileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(myprofileButton);
        myprofileButton.setBounds(960, 530, 110, 40);

        toptensButton.setText("Top 10's");
        toptensButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toptensButtonActionPerformed(evt);
            }
        });
        jPanel1.add(toptensButton);
        toptensButton.setBounds(190, 510, 110, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/panelBG.jpg"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 1100, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1110, 635);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gotopageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotopageButtonActionPerformed

        if(i==0){
            isQuery=true;
            chosenID = Integer.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString());
            insertInfo ="SELECT Distinct playlist_name FROM proje_3.playlist";
            isQuery=false;
            model.setColumnCount(1);

            playlistperform(insertInfo);
            i++;

        }else if(i==1){

            int[] nums = jTable1.getSelectedRows(); model.setColumnCount(8);
            for (int i = 0; i < nums.length; i++) {
               
                String cell = jTable1.getModel().getValueAt(nums[i], 0).toString();
                System.out.println(nums[i] + " ------- " + cell);
                if (cell.equalsIgnoreCase("Pop")) {
                    insertInfo = "SELECT * FROM proje_3.songs WHERE song_ID IN (SELECT song_ID FROM proje_3.playlist where user_ID = "+ chosenID +" and playlist_name LIKE 'Pop')";
                } else if (cell.equalsIgnoreCase("Jazz")) {
                    insertInfo = "SELECT * FROM proje_3.songs where song_ID IN (SELECT song_ID FROM proje_3.playlist where user_ID="+ chosenID +" and playlist_name LIKE 'Jazz')";
                } else if (cell.equalsIgnoreCase("Classic")) {
                    insertInfo = "SELECT * FROM proje_3.songs where song_ID IN (SELECT song_ID FROM proje_3.playlist where user_ID="+ chosenID +" and playlist_name LIKE 'Classic')";
                }
                
                isQuery=true;
                songsButtonActionPerformed(evt);
                isQuery=false;

            }
            i=0;
        }
    }//GEN-LAST:event_gotopageButtonActionPerformed

    private void songsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songsButtonActionPerformed
        followButton.setEnabled(false);
        gotopageButton.setEnabled(false);
        listalbumsButton.setEnabled(false);
        addtomylistButton.setEnabled(true);
        model.setColumnCount(8);
        i=0;
        if(isQuery){
            songs = P3MusicDB.returnQuarryArtist(insertInfo);
        }else{
            songs = P3MusicDB.returnSongs();
        }
        model.setRowCount(0);
        print(songs,2);
        jTable1.setModel(model);
    }//GEN-LAST:event_songsButtonActionPerformed

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed
        gotopageButton.setEnabled(true);
        listalbumsButton.setEnabled(false);
        addtomylistButton.setEnabled(false);
        followButton.setEnabled(true);
        i=0;
        model.setColumnCount(5);
        if(isQuery){
            user = P3MusicDB.returnQuarryUser(insertInfo);
        }else{
            if(adminGet.isAdmin){
                user = P3MusicDB.returnUser();
            }else{
                insertInfo = "SELECT * FROM user WHERE subscription_type LIKE 'PREMIUM'";
                user = P3MusicDB.returnQuarryUser(insertInfo);}
        }
        model.setRowCount(0);
        print(user,3);
        jTable1.setModel(model);
    }//GEN-LAST:event_userButtonActionPerformed

    private void addtomylistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtomylistButtonActionPerformed
        int[] nums = jTable1.getSelectedRows();
        for (int i = 0; i < nums.length; i++) {
        String cell = jTable1.getModel().getValueAt(nums[i], 0).toString();
        String cell2 = jTable1.getModel().getValueAt(nums[i], 5).toString();
        check=1;
        insertInfo = "INSERT INTO playlist(user_ID,song_ID,playlist_name) VALUES('"+(p3musicdb.LoggingInterface.signedID)+"','"+Integer.valueOf(cell)+"','"+cell2+"')";
        
        try {
                P3MusicDB.returnUser().getStatement().executeUpdate(insertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("song added to your list");
    }//GEN-LAST:event_addtomylistButtonActionPerformed

    private void followButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followButtonActionPerformed
String cell=null;
        int[] nums = jTable1.getSelectedRows();
        String q = "SELECT Distinct follows_ID From follower where follows_ID IN(select Distinct follows_ID from follower where follower_ID ="+p3musicdb.LoggingInterface.signedID+")";
        follower = P3MusicDB.returnQuarryFollower(q);
           for (int i = 0; i < nums.length; i++){
            try {
                while(follower.next()){
                    cell = jTable1.getModel().getValueAt(nums[i], 0).toString();
                    if(cell.equalsIgnoreCase(follower.getString("follows_ID")))
                    {
                        followCheck=true;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
               
        }
           
        if(followCheck==false){

        for (int i = 0; i < nums.length; i++) {
        cell = jTable1.getModel().getValueAt(nums[i], 0).toString();
        check=1;
        insertInfo = "INSERT INTO follower(follower_ID,follows_ID) VALUES("+(p3musicdb.LoggingInterface.signedID)+",'"+Integer.valueOf(cell)+"')";
        
        try {
                P3MusicDB.returnUser().getStatement().executeUpdate(insertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("person added to your FollowList");   
        }else if(followCheck==true){
        for (int i = 0; i < nums.length; i++) {
        cell = jTable1.getModel().getValueAt(nums[i], 0).toString();
        check=1;
        insertInfo =  "DELETE FROM follower where follower_ID ="+(p3musicdb.LoggingInterface.signedID)+" and follows_ID = "+Integer.valueOf(cell);
        try {
                P3MusicDB.returnUser().getStatement().execute(insertInfo);
            } catch (SQLException ex) {
                Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
            System.out.println("person removed from your FollowList");
        }
        followCheck=false;
        printFollow();
    }//GEN-LAST:event_followButtonActionPerformed

    private void artistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistButtonActionPerformed
        followButton.setEnabled(false);
        gotopageButton.setEnabled(false);
        listalbumsButton.setEnabled(true);
        addtomylistButton.setEnabled(false);
        model.setColumnCount(3);
        i=0;
        if(isQuery){
            artist = P3MusicDB.returnQuarryArtist(insertInfo);
        }else{
            artist = P3MusicDB.returnArtist();
        }
        model.setRowCount(0);
        
        print(artist,1);
        jTable1.setModel(model);
    }//GEN-LAST:event_artistButtonActionPerformed
public void printFollow(){

        insertInfo="select user_name, country from user where user_ID IN(select follows_ID from follower where follower_ID="+LoggingInterface.signedID+")";
        follower = P3MusicDB.returnQuarryUser(insertInfo);
        modelFollow.setRowCount(0);
        try {
            while (follower.next()) {
                followerRows[0] = follower.getString("user_name");
                followerRows[1] = follower.getString("country");
                modelFollow.addRow(followerRows);
                
            }
            
                
        } catch (SQLException ex) {
            Logger.getLogger(UserPageInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                followTable.setModel(modelFollow);
                headsets=getHeaders(follower);
                for (int j = 0; j < headsets.size(); j++) {
                ChangeName(followTable,j,headsets.get(j));
            }
}
    private void myprofileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myprofileButtonActionPerformed
        userPageInterface.setVisible(true);
        userPageInterface.printPop();
        userPageInterface.printJazz();
        userPageInterface.printClassic();
        this.setVisible(false);
    }//GEN-LAST:event_myprofileButtonActionPerformed

    private void toptensButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toptensButtonActionPerformed
        ListingTopTens listingTopTens = new ListingTopTens();
        listingTopTens.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_toptensButtonActionPerformed

    private void listalbumsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listalbumsButtonActionPerformed
         if(i==0){
            
            isQuery=true;
            chosenID = Integer.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString());
            insertInfo ="SELECT Distinct album_type FROM album";
            model.setColumnCount(1);
            album = P3MusicDB.returnQuarryAlbum(insertInfo);
            model.setRowCount(0);

        try {
            while (album.next()) {
                albumRows[0] = album.getString("album_type");
                model.addRow(albumRows);}
            jTable1.setModel(model);
                headsets=getHeaders(album);
                for (int j = 0; j < headsets.size(); j++) {
                ChangeName(jTable1,j,headsets.get(j));}
        } catch (SQLException ex) {
            Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
            isQuery=false;
            i++;

        }else if(i==1){

            int[] nums = jTable1.getSelectedRows();
            model.setColumnCount(2);
            for (int i = 0; i < nums.length; i++) {
                String cell = jTable1.getModel().getValueAt(nums[i], 0).toString();
                System.out.println(nums[i] + " ------- " + cell);
                if (cell.equalsIgnoreCase("Pop")) {
                    insertInfo = "select artist,album_name from album where artist IN(select distinct artist_name from artist where artist_ID = "+ chosenID +" and album_type LIKE 'Pop')";
                } else if (cell.equalsIgnoreCase("Jazz")) {
                    insertInfo = "select artist,album_name from album where artist IN(select distinct artist_name from artist where artist_ID = "+ chosenID +" and album_type LIKE 'Jazz')";
                } else if (cell.equalsIgnoreCase("Classic")) {
                    insertInfo = "select artist,album_name from album where artist IN(select distinct artist_name from artist where artist_ID = "+ chosenID +" and album_type LIKE 'Classic')";
                }
                isQuery=true;
                if(isQuery){
                album = P3MusicDB.returnQuarryAlbum(insertInfo);
                }else{
                album = P3MusicDB.returnAlbum();
                }
                model.setRowCount(0);
                print(album,6);
                jTable1.setModel(model);
                isQuery=false;
                listalbumsButton.setEnabled(false);
            }
            i=0;
        }

    }//GEN-LAST:event_listalbumsButtonActionPerformed

       public void playlistperform(String q){
        
        playlist = P3MusicDB.returnQuarryPlaylist(q);
        model.setRowCount(0);

        try {
            while (playlist.next()) {
                if(i==0){
                playlistRows[0] = playlist.getString("playlist_name");}
                else if(i==1){
                playlistRows[0] = playlist.getString("song_name");
                }
                model.addRow(playlistRows);
            }
            
            headsets=getHeaders(playlist);
            for (int j = 0; j < headsets.size(); j++) {
                ChangeName(jTable1,j,headsets.get(j));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void print(ResultSet rs,int table){
        switch (table) {
            case 1:
                try {
                    while (rs.next()) {
                        artistRows[0] = rs.getString("artist_ID");
                        artistRows[1] = rs.getString("artist_name");
                        artistRows[2] = rs.getString("artist_country");
                        model.addRow(artistRows);
                    }
                     jTable1.setModel(model);
                headsets=getHeaders(rs);
                for (int j = 0; j < headsets.size(); j++) {
                ChangeName(jTable1,j,headsets.get(j));
            }
                } catch (SQLException ex) {
                    Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
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
                ChangeName(jTable1,j,headsets.get(j));
            }
                } catch (SQLException ex) {
                    Logger.getLogger(PremiumListingInterface.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case 3:
                try {
                    while (rs.next()) {
                        userRows[0] = rs.getString("user_ID");
                        userRows[1] = rs.getString("user_name");
                        userRows[2] = rs.getString("email");
                        userRows[3] = rs.getString("subscription_type");
                        userRows[4] = rs.getString("country");
                        model.addRow(userRows);
                    }
                     jTable1.setModel(model);
                headsets=getHeaders(rs);
                for (int j = 0; j < headsets.size()-2; j++) {
                    ChangeName(jTable1,j,headsets.get(j));
            }
                } catch (SQLException ex) {
                    Logger.getLogger(PremiumListingInterface.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case 4:
                try {
                    while (rs.next()) {
                        if(i==0){
                            playlistRows[0] = rs.getString("playlist_name");}
                        else if(i==1){
                            playlistRows[0] = rs.getString("song_name");
                        }
                        model.addRow(playlistRows);
                    }
                     jTable1.setModel(model);
                headsets=getHeaders(rs);
                for (int j = 0; j < headsets.size(); j++) {
                ChangeName(jTable1,j,headsets.get(j));
            }
                } catch (SQLException ex) {
                    Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case 5:
                try {
                    while (rs.next()) {
                            followerRows[0] = rs.getString("follower_ID");
                            followerRows[1] = rs.getString("follows_ID");
                        model.addRow(followerRows);
                    }
                     jTable1.setModel(model);
                headsets=getHeaders(rs);
                for (int j = 0; j < headsets.size(); j++) {
                ChangeName(jTable1,j,headsets.get(j));
            }
                } catch (SQLException ex) {
                    Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
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
     public void ChangeName(JTable table, int col_index, String col_name){
     table.getColumnModel().getColumn(col_index).setHeaderValue(col_name);
  }
 public ArrayList getHeaders(ResultSet rs){
     ArrayList<String> headers = new ArrayList<String>();
      ResultSetMetaData rsmd;
        try {
            rsmd = rs.getMetaData();
            for (int j = 0; j < rsmd.getColumnCount(); j++) {
                headers.add(j, rsmd.getColumnName(j+1));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(NormalListingInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     return headers;
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
            java.util.logging.Logger.getLogger(PremiumListingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PremiumListingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PremiumListingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PremiumListingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PremiumListingInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtomylistButton;
    private javax.swing.JButton artistButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton followButton;
    private javax.swing.JTable followTable;
    private javax.swing.JButton gotopageButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton listalbumsButton;
    private javax.swing.JButton myprofileButton;
    private javax.swing.JButton songsButton;
    private javax.swing.JButton toptensButton;
    private javax.swing.JButton userButton;
    // End of variables declaration//GEN-END:variables
}
