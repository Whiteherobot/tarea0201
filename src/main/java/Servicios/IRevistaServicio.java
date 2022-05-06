/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicios;

import modelo.Revista;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface IRevistaServicio {
    
    public Revista crear(Revista r);
    public Revista modificar(String nR,String tR,int Yp,int costo, Revista r);
    public Revista eliminar(String nR);
    public List<Revista> listar();
    public Revista buscarPocision(String nR);
    
}

