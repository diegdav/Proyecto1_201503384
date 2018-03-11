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
public class Libro extends Bibliografia {
    
    private int isbn;
    private int copias;
    private int disponibles;

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
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
