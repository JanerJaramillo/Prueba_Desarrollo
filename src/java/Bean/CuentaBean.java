/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Model.Cuenta;
import ModeloDAO.CuentaDAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CuentaBean {
    
    private Cuenta cuenta = new Cuenta();
    private List<Cuenta> lstCuenta;
    
    public List<Cuenta> getLstCuenta() {
        return lstCuenta;
    }
    
    public void setLstCuenta(List<Cuenta> lstCuenta) {
        this.lstCuenta = lstCuenta;
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }
    
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    public void registrarCuenta() throws Exception {
        CuentaDAO dao;
        try {
            dao = new CuentaDAO();
            dao.registrarCuenta(cuenta);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void listarCuenta() throws Exception {
        CuentaDAO dao;
        try {
            dao = new CuentaDAO();
            lstCuenta = dao.listarCuenta();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void leerID(Cuenta cuen) throws Exception {
        CuentaDAO dao;
        Cuenta temp;
        try {
            dao = new CuentaDAO();
            temp = dao.leerID(cuen);
            if (temp != null) {
                this.cuenta = temp;
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void editarCuenta() throws Exception {
        CuentaDAO dao;
        try {
            dao = new CuentaDAO();
            dao.editarCuenta(cuenta);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarCuenta(Cuenta cuen) throws Exception {
        CuentaDAO dao;
        try {
            dao = new CuentaDAO();
            dao.eliminarCuenta(cuen);
        } catch (Exception e) {
            throw e;
        }
    }
}
