/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conection;

import java.sql.*;

public class Conexion {

    Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/prueba", "root", "");
        } catch (Exception e) {
            System.err.println("Error " + e);
        }
    }

    public Connection getConnection() {
        return con;
    }

    public void Cerrar() {
        try {
            if (con != null) {
                if (con.isClosed() == false) {
                    con.close();
                }
            }
        } catch (Exception e) {
            System.err.println("Error " + e);
        }
    }
}
