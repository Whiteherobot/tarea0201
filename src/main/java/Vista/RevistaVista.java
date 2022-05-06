package Vista;

import controlador.RevistaControl;
import modelo.Articulo;
import modelo.Revista;

public class RevistaVista {
    public static void main(String [] args){
        var revista01 = new RevistaControl();
        revista01.crear(Science, cientifica, 2020, 1, OrigendelasEspecies,CharlesDarwin , cientifica, 10, 12);
        System.out.println("Listado Inicial");
        
        for(Revista r: RevistaControl.listar())
            System.out.println(r.toString());
        
        Revista.eliminar(30);

        System.out.println("Listado Eliminando el código 30");
        
        for(Revista b: RevistaControl.listar())
            System.out.println(b.toString());

        System.out.println("Listado Modificando el código 20");
        
        var articulo = new Articulo();
        var revista = new Revista(); 
        
        revistaControl.modificar();
        
        for(Revista b: RevistaControl.listar())
            System.out.println(r.toString());
        
    }
}
