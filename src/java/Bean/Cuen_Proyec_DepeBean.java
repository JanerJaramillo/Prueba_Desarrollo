/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Model.cuenta_proyecto_dependencia;
import ModeloDAO.Cuen_Proyec_DepeDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Cuen_Proyec_DepeBean {

    private cuenta_proyecto_dependencia cue = new cuenta_proyecto_dependencia();

    public cuenta_proyecto_dependencia getCue() {
        return cue;
    }

    public void setCue(cuenta_proyecto_dependencia cue) {
        this.cue = cue;
    }

    public void registrar() {
        Cuen_Proyec_DepeDAO dao;
        try {
            dao = new Cuen_Proyec_DepeDAO();
            dao.registrar(cue);
        } catch (Exception e) {
        }
    }

}
