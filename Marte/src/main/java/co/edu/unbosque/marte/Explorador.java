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
public class Explorador implements IExplorador {

    public static final char ACCION_GIRAR_IZQUIERDA = 'I';
    public static final char ACCION_GIRAR_DERECHA = 'D';
    public static final char ACCION_AVANZA = 'A';

    public static final String DIRECCION_NORTE = "N";
    public static final String DIRECCION_SUR = "S";
    public static final String DIRECCION_ESTE = "E";
    public static final String DIRECCION_OESTE = "O";

    private int XPos;
    private int YPos;
    private String direccion;
    private String desplazamiento;

    /**
     * Ejecuta el dezplazamiento del explorador
     */
    @Override
    public void desplazarExplorador() {
        char[] movimientos = this.desplazamiento.toCharArray();
        for (char accion : movimientos) {
            switch (accion) {
                case ACCION_GIRAR_IZQUIERDA:
                    girarIzquierda();
                    break;
                case ACCION_GIRAR_DERECHA:
                    girarDerecha();
                    break;
                case ACCION_AVANZA:
                    avanzar();
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Metodo que corresponde a realizar un movimiento hacia adelante
     * manteniendo la misma dirección en la que actualmente se encuentra.
     */
    public void avanzar() {
        switch (this.getDireccion()) {
            case DIRECCION_NORTE:
                // @todo: validar si no sobrepasa el tamaño de marte
                this.setYPos(this.getYPos() + 1);
                break;
            case DIRECCION_SUR:
                // @todo: validar si no sobrepasa el tamaño de marte
                this.setYPos(this.getYPos() - 1);
                break;
            case DIRECCION_ESTE:
                // @todo: validar si no sobrepasa el tamaño de marte
                this.setXPos(this.getXPos() - 1);
                break;
            case DIRECCION_OESTE:
                // @todo: validar si no sobrepasa el tamaño de marte
                this.setXPos(this.getXPos() + 1);
                break;
        }
    }

    /**
     *Metodo que corresponde a girar 90 grados a la Derecha sin moverse del punto en la grilla en la que se encuentra
     */
    public void girarDerecha() {
        switch (this.getDireccion()) {
            case DIRECCION_NORTE:
                this.setDireccion(DIRECCION_OESTE);
                break;
            case DIRECCION_SUR:
                this.setDireccion(DIRECCION_ESTE);
                break;
            case DIRECCION_ESTE:
                this.setDireccion(DIRECCION_NORTE);
                break;
            case DIRECCION_OESTE:
                this.setDireccion(DIRECCION_SUR);
                break;
        }
    }

    /**
     * Metodo que corresponde a girar 90 grados a la Izquierda sin moverse del
     * punto en la grilla en la que se encuentra
     */
    public void girarIzquierda() {
        switch (this.getDireccion()) {
            case DIRECCION_NORTE:
                this.setDireccion(DIRECCION_ESTE);
                break;
            case DIRECCION_SUR:
                this.setDireccion(DIRECCION_OESTE);
                break;
            case DIRECCION_ESTE:
                this.setDireccion(DIRECCION_SUR);
                break;
            case DIRECCION_OESTE:
                this.setDireccion(DIRECCION_NORTE);
                break;
        }
    }

    @Override
    public void setXPos(int x) {
        this.XPos = x;
        System.out.println("co.edu.unbosque.marte.Explorador.setXPos(" + x + ")");
    }

    @Override
    public void setYPos(int y) {
        this.YPos = y;
        System.out.println("co.edu.unbosque.marte.Explorador.setYPos(" + y + ")");
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    /**
     *
     * @return
     */
    @Override
    public int getXPos() {
        return XPos;
    }

    /**
     *
     * @return
     */
    @Override
    public int getYPos() {
        return YPos;
    }

    /**
     *
     * @return
     */
    @Override
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @return
     */
    @Override
    public String getDesplazamiento() {
        return desplazamiento;
    }

    @Override
    public String toString() {
        return "Explorador{" + "XPos=" + XPos + ", YPos=" + YPos + ", direccion=" + direccion + ", setDesplazamiento=" + desplazamiento + '}';
    }

}
