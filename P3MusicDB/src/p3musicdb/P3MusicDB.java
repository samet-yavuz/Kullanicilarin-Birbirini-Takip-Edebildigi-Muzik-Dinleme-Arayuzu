package p3musicdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class P3MusicDB {
    static ResultSet artist = null;
    static ResultSet songs = null;
    static ResultSet user = null;
    static ResultSet playlist=null;
    static ResultSet album=null;
    static ResultSet follower=null;
    static Connection myConn = null;
    static WhoAreYou whoAreYou = new WhoAreYou();
    static void getConnect() {
        try {
            myConn=  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proje_3","root","21148953362");
        } catch (SQLException ex) {
            Logger.getLogger(P3MusicDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public static ResultSet returnArtist(){
        try {
            
            getConnect();
            Statement myStat=myConn.createStatement();
            artist=myStat.executeQuery("select * from artist");

        }catch (Exception e){
            e.printStackTrace();
        }
        return artist;
    }
   
    public static ResultSet returnSongs(){
        try {

            getConnect();
            Statement myStat=myConn.createStatement();
            songs=myStat.executeQuery("select * from songs");

        }catch (Exception e){
            e.printStackTrace();
        }
        return songs;
    }
    
    public static ResultSet returnUser(){
        try {
            getConnect();
            Statement myStat=myConn.createStatement();
            user=myStat.executeQuery("select * from user ");

        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
        public static ResultSet returnPlaylist(){
        try {
            getConnect();
            Statement myStat=myConn.createStatement();
            playlist=myStat.executeQuery("select * from playlist ");

        }catch (Exception e){
            e.printStackTrace();
        }
        return playlist;
    }
        public static ResultSet returnFollower(){
        try {
            getConnect();
            Statement myStat=myConn.createStatement();
            follower=myStat.executeQuery("select * from follower ");

        }catch (Exception e){
            e.printStackTrace();
        }
        return follower;
    }
        public static ResultSet returnAlbum(){
        try {
            getConnect();
            Statement myStat=myConn.createStatement();
            album=myStat.executeQuery("select * from album ");

        }catch (Exception e){
            e.printStackTrace();
        }
        return album;
    }
        public static ResultSet returnQuarryArtist(String q){
        try {
            
            getConnect();
            Statement myStat=myConn.createStatement();
            artist=myStat.executeQuery(q);

        }catch (Exception e){
            e.printStackTrace();
        }
        return artist;
    }
    public static ResultSet returnQuarryPlaylist(String q){
        try {
            
            getConnect();
            Statement myStat=myConn.createStatement();
            playlist=myStat.executeQuery(q);

        }catch (Exception e){
            e.printStackTrace();
        }
        return playlist;
    }
   
    public static ResultSet returnQuarrySongs(String q){
        try {

            getConnect();
            Statement myStat2=myConn.createStatement();
            songs=myStat2.executeQuery(q);

        }catch (Exception e){
            e.printStackTrace();
        }
        return songs;
    }
    
    public static ResultSet returnQuarryUser(String q){
        try {
            getConnect();
            Statement myStat3=myConn.createStatement();
            user=myStat3.executeQuery(q);

        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
    public static ResultSet returnQuarryFollower(String q){
        try {
            
            getConnect();
            Statement myStat=myConn.createStatement();
            follower=myStat.executeQuery(q);

        }catch (Exception e){
            e.printStackTrace();
        }
        return follower;
    }
    public static ResultSet returnQuarryAlbum(String q){
        try {
            
            getConnect();
            Statement myStat=myConn.createStatement();
            album=myStat.executeQuery(q);

        }catch (Exception e){
            e.printStackTrace();
        }
        return album;
    }
    public static void main(String[] args) {
        getConnect();
        whoAreYou.setVisible(true);
    }
    
}
