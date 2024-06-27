/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1;

/**
 *
 * @author Brian Farrel Arkana (2211102352) S1IF-10-N
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection mysqlkoneksi;
    public static Connection koneksiDB() throws SQLException{
        if(mysqlkoneksi == null){
            try{
                String DB = "jdbc:mysql://localhost:3306/dbg1m9";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkoneksi = (Connection)DriverManager.getConnection(DB, user, pass);
            } catch(Exception e){
                
            }
        } return mysqlkoneksi;
    }
}