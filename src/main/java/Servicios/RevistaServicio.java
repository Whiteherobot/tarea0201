package Servicios;

import modelo.Revista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class RevistaServicio implements IRevistaServicio{
    
    public final List<Revista> revistaList = new ArrayList<>();

    @Override
    public Revista crear(Revista r) {
        this.revistaList.add(r);
        return r;
    }

    @Override
    public Revista modificar(String nR, String tR, int Yp, int costo, Revista r) {
        this.revistaList.add(this.buscarPocision(nR));
        return r ;
        
    }


    @Override
    public List<Revista> listar() {
    return this.listar();
    }
 

    @Override
    public Revista eliminar(String nR) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Revista buscarPocision(String nR) {
        var posicion=-1;
        var i=0;
        for(var auxRevista:this.revistaList){
           if(auxRevista.getNombreRevista()==nR){
            posicion=i;
            break;
           }
           i++;
        }
        return null;
        
    }  
}
