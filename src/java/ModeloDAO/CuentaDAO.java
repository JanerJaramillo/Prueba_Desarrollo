/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Conection.Conexion;
import Model.Cuenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CuentaDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cuenta c = new Cuenta();

    public List<Cuenta> listarCuenta() throws Exception {
        List<Cuenta> list = new ArrayList<>();
        String sql = "select * from cuenta";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cuenta cu = new Cuenta();
                cu.setCodigo(rs.getString("codigo"));
                cu.setNombre_cuenta(rs.getString("nombre_cuenta"));
                list.add(cu);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            cn.Cerrar();
        }
        return list;
    }

    public void registrarCuenta(Cuenta cu) throws Exception {
        String sql = "insert into cuenta(codigo,nombre_cuenta) "
                + "values('" + cu.getCodigo() + "','" + cu.getNombre_cuenta() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

    public Cuenta leerID(Cuenta cue) throws Exception {
        Cuenta cuenta = null;
        String sql = "select codigo,nombre_cuenta from cuenta where codigo= ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cue.getCodigo());
            rs = ps.executeQuery();
            while (rs.next()) {
                cuenta = new Cuenta();
                cuenta.setCodigo(rs.getString("codigo"));
                cuenta.setNombre_cuenta(rs.getString("nombre_cuenta"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            cn.Cerrar();
        }
        return cuenta;
    }

    public void editarCuenta(Cuenta cu) throws Exception {
        String sql = "update cuenta set nombre ='" + cu.nombre_cuenta + "' where id='" + cu.idcuenta + "'";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            cn.Cerrar();
        }
    }

    public void eliminarCuenta(Cuenta cu) throws Exception {
        String sql = "delete cuenta where idcuenta='" + cu.idcuenta + "'";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            cn.Cerrar();
        }
    }
}
