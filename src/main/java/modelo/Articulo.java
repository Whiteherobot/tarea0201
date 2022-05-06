/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Articulo {
    private String tema;
    private String autoresArt;
    private String tipoArticulo;
    private int numPaginicio;
    private int numPagFinal;

    public Articulo(String tema, String autoresArt, String tipoArticulo) {
        this.tema = tema;
        this.autoresArt = autoresArt;
        this.tipoArticulo = tipoArticulo;
    }

    public Articulo(String tema, String autoresArt, String tipoArticulo, int numPaginicio, int numPagFinal) {
        this.tema = tema;
        this.autoresArt = autoresArt;
        this.tipoArticulo = tipoArticulo;
        this.numPaginicio = numPaginicio;
        this.numPagFinal = numPagFinal;
    }

    public Articulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAutoresArt() {
        return autoresArt;
    }

    public void setAutoresArt(String autoresArt) {
        this.autoresArt = autoresArt;
    }

    public String getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(String tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public int getNumPaginicio() {
        return numPaginicio;
    }

    public void setNumPaginicio(int numPaginicio) {
        this.numPaginicio = numPaginicio;
    }

    public int getNumPagFinal() {
        return numPagFinal;
    }

    public void setNumPagFinal(int numPagFinal) {
        this.numPagFinal = numPagFinal;
    }

    @Override
    public String toString() {
        return "Articulo{" + "tema=" + tema + ", autoresArt=" + autoresArt + ", tipoArticulo=" + tipoArticulo + ", numPaginicio=" + numPaginicio + ", numPagFinal=" + numPagFinal + '}';
    }
    
}
