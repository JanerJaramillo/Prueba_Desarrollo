/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Conection.Conexion;
import Model.cuenta_proyecto_dependencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cuen_Proyec_DepeDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void registrar(cuenta_proyecto_dependencia cue) throws Exception {
        String sql = "insert into cuenta_proyecto_dependencia(idcuenta_proyecto,iddependencia) "
                + "values('" + cue.idcuenta_proyecto + "','" + cue.iddependencia + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }
}
