/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Revista {
    private String nombreRevista;
    private String tipoRevista;
    private int yearPublicacion;
    private int costo;
    private Articulo articulo;

    public Revista(String nombreRevista, String tipoRevista, int yearPublicacion, int costo) {
        this.nombreRevista = nombreRevista;
        this.tipoRevista = tipoRevista;
        this.yearPublicacion = yearPublicacion;
        this.costo = costo;
    }

    public Revista(String nombreRevista, String tipoRevista, int yearPublicacion, int costo, Articulo articulo) {
        this.nombreRevista = nombreRevista;
        this.tipoRevista = tipoRevista;
        this.yearPublicacion = yearPublicacion;
        this.costo = costo;
        this.articulo = articulo;
    }

    public Revista() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean obtenerNombreRevista(){
        var retorno = false; 
        if (this.nombreRevista.equals("Glam Mag")||
                this.nombreRevista.equals("Nature")||
                this.nombreRevista.equals("Science")||
                this.nombreRevista.equals("People")
                )
            retorno = true;
        return retorno;
        
    }
    
    public boolean obtenerTipoRevista(){
        var retorno = false;
        if (this.tipoRevista.equals("Cientifica")||
                this.tipoRevista.equals("Moda")||
                this.tipoRevista.equals("Naturaleza")||
                this.tipoRevista.equals("Infantil")
                )
            return true;
        return false;
        
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public String getTipoRevista() {
        return tipoRevista;
    }

    public void setTipoRevista(String tipoRevista) {
        this.tipoRevista = tipoRevista;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    public void setYearPublicacion(int yearPublicacion) {
        this.yearPublicacion = yearPublicacion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public String toString() {
        return "Revista{" + "nombreRevista=" + nombreRevista + ", tipoRevista=" 
                + tipoRevista + ", yearPublicacion=" + yearPublicacion 
                + ", costo=" + costo + ", articulo=" + articulo + '}';
    }
  
}
