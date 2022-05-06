package controlador;

import Servicios.RevistaServicio;
import java.util.List;
import modelo.Articulo;
import modelo.Revista;

public class RevistaControl {
    public RevistaServicio revistaServicio = new RevistaServicio();
    public Revista crear(String nR ,String tR, int yP, int costo, String tA, String aAA, String tAA,int numPagInicio, int numPagFinal){
    var articulo = new Articulo();
    var revista = new Revista();
    this.revistaServicio.crear(revista);
    return revista;
    } 
     public Revista eliminar(String nR) {
        return this.revistaServicio.eliminar(nR);
    }
    
    public Revista modificar(String nR, String tR, int Yp, int c, Revista r) {
        return this.revistaServicio.modificar(nR, tR, c, c, r);
    }
    
    
    
    public List<Revista> listar()
    {
        return this.revistaServicio.listar();
    }
    
}
