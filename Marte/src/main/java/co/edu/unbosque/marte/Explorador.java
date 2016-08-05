/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.marte;

/**
 *
 * @author agranados
 */
public class Explorador {

    private int XPos;
    private int YPos;
    private String direccion;
    private String setDesplazamiento;

    void setXPos(int x) {
        this.XPos = x;
        System.out.println("co.edu.unbosque.marte.Explorador.setXPos("+x+")");
    }

    void setYPos(int y) {
       this.YPos = y;
        System.out.println("co.edu.unbosque.marte.Explorador.setYPos("+y+")");
    }

    void setDireccion(String direccion) {
        this.direccion=direccion;
    }

    void setDesplazamiento(String desplazamiento) {
        this.setDesplazamiento = desplazamiento;
    }

    public int getXPos() {
        return XPos;
    }

    public int getYPos() {
        return YPos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSetDesplazamiento() {
        return setDesplazamiento;
    }

    @Override
    public String toString() {
        return "Explorador{" + "XPos=" + XPos + ", YPos=" + YPos + ", direccion=" + direccion + ", setDesplazamiento=" + setDesplazamiento + '}';
    }
    
}
