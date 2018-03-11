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
public class Bibliografia {
    
    private String autor;
    private int anio_publicacion;
    private String titulo;
    private int edicion;
    private String[] temas;
    private String[] palabras_clave;
    private String descripcion;

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the anio_publicacion
     */
    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    /**
     * @param anio_publicacion the anio_publicacion to set
     */
    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the edicion
     */
    public int getEdicion() {
        return edicion;
    }

    /**
     * @param edicion the edicion to set
     */
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    /**
     * @return the temas
     */
    public String[] getTemas() {
        return temas;
    }

    /**
     * @param temas the temas to set
     */
    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    /**
     * @return the palabras_clave
     */
    public String[] getPalabras_clave() {
        return palabras_clave;
    }

    /**
     * @param palabras_clave the palabras_clave to set
     */
    public void setPalabras_clave(String[] palabras_clave) {
        this.palabras_clave = palabras_clave;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
