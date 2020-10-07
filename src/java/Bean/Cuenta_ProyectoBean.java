/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Model.Cuenta;
import Model.Proyecto;
import Model.cuenta_proyecto;
import ModeloDAO.cuenta_proyectoDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Cuenta_ProyectoBean {

    private cuenta_proyecto cuen = new cuenta_proyecto();

    public cuenta_proyecto getCuen() {
        return cuen;
    }

    public void setCuen(cuenta_proyecto cuen) {
        this.cuen = cuen;
    }

    public void registrarProyecto() {
        cuenta_proyectoDAO dao;
        try {
            dao = new cuenta_proyectoDAO();
            dao.registrar(cuen);
        } catch (Exception e) {
        }
    }
}
