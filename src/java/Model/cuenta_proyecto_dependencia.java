/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author janer
 */
public class cuenta_proyecto_dependencia {
    public int id;
    public int idcuenta_proyecto;
    public int iddependencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdcuenta_proyecto() {
        return idcuenta_proyecto;
    }

    public void setIdcuenta_proyecto(int idcuenta_proyecto) {
        this.idcuenta_proyecto = idcuenta_proyecto;
    }

    public int getIddependencia() {
        return iddependencia;
    }

    public void setIddependencia(int iddependencia) {
        this.iddependencia = iddependencia;
    }
}
