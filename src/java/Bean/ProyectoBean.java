/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Model.Cuenta;
import Model.Proyecto;
import Model.cuenta_proyecto;
import ModeloDAO.ProyectoDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ProyectoBean {

    private Proyecto proyecto = new Proyecto();

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public void registrarProyecto() {
        ProyectoDAO dao;
        try {
            dao = new ProyectoDAO();
            dao.registrarProyecto(proyecto);
        } catch (Exception e) {
        }
    }

}
