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
public class Dependencia {
    public int iddependencia;
    public String codigo;
    public String nombre_dependencia;

    public int getIddependencia() {
        return iddependencia;
    }

    public void setIddependencia(int iddependencia) {
        this.iddependencia = iddependencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre_dependencia() {
        return nombre_dependencia;
    }

    public void setNombre_dependencia(String nombre_dependencia) {
        this.nombre_dependencia = nombre_dependencia;
    }
}
