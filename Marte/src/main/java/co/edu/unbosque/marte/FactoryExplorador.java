/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.marte;

/**
 *
 * @author f209
 */
public class FactoryExplorador {
    public static IExplorador getExplorador(int x, int y,String direccion, String desplazamiento){
        
      Explorador explorador   = new Explorador();
                    explorador.setXPos(x);
                    explorador.setYPos(y);
                    explorador.setDireccion(direccion);
                    explorador.setDesplazamiento(desplazamiento);
        return explorador;
    }
}
