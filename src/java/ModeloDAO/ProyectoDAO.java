/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Conection.Conexion;
import Model.Cuenta;
import Model.Proyecto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProyectoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void registrarProyecto(Proyecto p) throws Exception {
        String sql = "insert into proyecto(codigo,nombre_proyecto) "
                + "values('" + p.getCodigo() + "','" + p.getNombre_proyecto() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }
}
