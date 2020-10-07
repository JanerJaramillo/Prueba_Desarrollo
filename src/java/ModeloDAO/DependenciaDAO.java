/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Conection.Conexion;
import Model.Dependencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DependenciaDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void registrarDependencia(Dependencia d) throws Exception {
        String sql = "insert into dependencia(codigo,nombre_proyecto) "
                + "values('" + d.getCodigo() + "','" + d.getNombre_dependencia() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }
}
