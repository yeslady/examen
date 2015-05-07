/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import modell.IdCliente;
import modell.IdProducto;

/**
 *

 */
public class ClsEvento {
    ArrayList <IdCliente>tbevento1 = new ArrayList<IdCliente>(); 
     
    
    public ClsEvento(IdCliente idE) {
        tbevento1.add(idE);
    }
    
    public ArrayList reportePersona(){        
        return tbevento1;
    }
    double subtotal=0.0;
    IdProducto p= new IdProducto();
    public void subtotal(){
        //p.setCantidad();
       //subtotal=p.getPrecio()*p.getCantidad();
    }
    
}
