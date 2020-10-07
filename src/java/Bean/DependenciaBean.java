/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Model.Dependencia;
import ModeloDAO.DependenciaDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class DependenciaBean {

    private Dependencia dependencia = new Dependencia();

    public Dependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }

    public void registrarDependencia() {
        DependenciaDAO dao;
        try {
            dao = new DependenciaDAO();
            dao.registrarDependencia(dependencia);
        } catch (Exception e) {
        }
    }

}
