/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.marte;

/**
 * Interfaz Para definir los metodos por defecto de un Explorador de Mision a
 * Marte
 *
 * @author f209
 */
public interface IExplorador {

    /**
     * Metodo que permite cambiar la posicion en x del explorador
     *
     * @param x representa la posicion en X
     */
    void setXPos(int x);

    /**
     * Metodo que permite cambiar la posicion en y del explorador
     *
     * @param y representa la posicion en y
     */
    void setYPos(int y);

    void setDireccion(String direccion);

    void setDesplazamiento(String desplazamiento);

    public int getXPos();

    public int getYPos();

    public String getDireccion();

    public String getDesplazamiento();

    public void desplazarExplorador();

}
