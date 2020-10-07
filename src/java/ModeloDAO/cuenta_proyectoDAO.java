/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Conection.Conexion;
import Model.Cuenta;
import Model.Proyecto;
import Model.cuenta_proyecto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class cuenta_proyectoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void registrar(cuenta_proyecto cu) throws Exception {
        String sql = "insert into cuenta_proyecto(idcuenta,idproyecto) "
                + "values('" + cu.idcuenta + "','" + cu.idproyecto + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }
}
