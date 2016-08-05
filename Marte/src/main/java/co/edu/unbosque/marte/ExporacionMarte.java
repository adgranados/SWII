/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author F211
 */
public class ExporacionMarte {

    BufferedReader br;
    private int filas;
    private int columnas;
    private ArrayList<Explorador> exploradores;
    public ExporacionMarte(String djuegotxt) throws FileNotFoundException {
        File f=new File(djuegotxt);
        FileInputStream fin=new FileInputStream(f);
        br=new BufferedReader(new InputStreamReader(fin));
        
        this.exploradores = new ArrayList<Explorador>();
    }



    public void leerMundo() throws IOException {
       String line = "";
       int linePos = 0;
        while(line != null){
            linePos++;
            line = br.readLine();
            if(line != null){
                if(linePos == 1){
                    String[] marte = line.split(" ");
                    int filas = Integer.parseInt(marte[0]);
                    int columnas = Integer.parseInt(marte[1]);

                    this.setFilas(filas);
                    this.setColumnas(columnas);
                }else{
                    String[] posicionExplorador = line.split(" ");
                    int x = Integer.parseInt(posicionExplorador[0]);
                    int y = Integer.parseInt(posicionExplorador[1]);
                    String direccion = posicionExplorador[2];
                    String desplazamiento = br.readLine();
                    linePos++;
                    Explorador explorador = new Explorador();
                    explorador.setXPos(x);
                    explorador.setYPos(y);
                    explorador.setDireccion(direccion);
                    explorador.setDesplazamiento(desplazamiento);
                    this.exploradores.add(explorador);
                }
            }
       }
        
    }

    public Integer getFilas() {
        return this.filas;
    }

    public Integer getColumnas() {
       return this.columnas;
    }

    private void setFilas(int filas) {
        this.filas = filas;
    }

    private void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public Explorador getExplorador(int i) {
        return this.exploradores.get(i-1);
    }



    
    
}
