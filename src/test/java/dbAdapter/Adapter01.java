package dbAdapter;
import models.Artist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Adapter01 {
    private static final String USER = "dbuser02";
    private static final String PASSWORD = "pa$$02";
    private static final String URL = "jdbc:mariadb://104.237.13.60/dbkoel";
    private static final String JDBC = "org.mariadb.jdbc.Driver";
    private static Connection conn = null;
    private static Statement stmt = null;

    public static List<Artist> getAllArtists(){
        String query = "SELECT id, name from artists";
        List<Artist> artists = new ArrayList<>();
        try {
            //STEP 1: Register JDBC driver
            Class.forName(JDBC);

            //STEP 2: Open a connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            //STEP 3: Create  Statement
            stmt = conn.createStatement();

            //STEP 4: Execute a query and save a result

            ResultSet resultSet = stmt.executeQuery(query);

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Artist artist = new Artist(id, name);
                artists.add(artist);
            }

        } catch (ClassNotFoundException | SQLException se) {
            se.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {}// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try

        return artists;
    }

    public static String getPlaylistName(int playlistId){
        String name = null;
        String query = "select name from playlists p WHERE id = "+playlistId;
        try {
            Class.forName(JDBC);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);

            if(resultSet.next()){
                name = resultSet.getString("name");
            }

        } catch (ClassNotFoundException | SQLException se) {
            se.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {}// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try

        return name;
    }

}
