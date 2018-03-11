/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.proyecto1_201503384;

/**
 *
 * @author diego
 */
public class Revista extends Bibliografia {
    
    private String categoria;
    private int ejemplares;
    private int copias;
    private int disponibles;

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the ejemplares
     */
    public int getEjemplares() {
        return ejemplares;
    }

    /**
     * @param ejemplares the ejemplares to set
     */
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    /**
     * @return the copias
     */
    public int getCopias() {
        return copias;
    }

    /**
     * @param copias the copias to set
     */
    public void setCopias(int copias) {
        this.copias = copias;
    }

    /**
     * @return the disponibles
     */
    public int getDisponibles() {
        return disponibles;
    }

    /**
     * @param disponibles the disponibles to set
     */
    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }
    
}
