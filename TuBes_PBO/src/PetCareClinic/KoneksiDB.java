/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PetCareClinic;

/**
 *
 * @author Kelompok 4 S1IF-10-N
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class KoneksiDB {
    private static Connection koneksi;
    public static Connection koneksiDB() throws SQLException{
        if (koneksi == null) {
            try {
                String database = "jdbc:mysql://localhost:3306/petcareuser";
                String username = "root";
                String password = "";
                koneksi = DriverManager.getConnection(database, username, password);
            } catch (SQLException e) {
                System.err.println("SQL Error: " + e.getMessage());
                e.printStackTrace();
                throw e;
            }
        }
        return koneksi;
    }
}