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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author F211
 */
public class ExploracionMarte {
    private static final  String PATH = "/home/e205/Documentos/marte.txt";
    private static ExploracionMarte instancia = null;
    public static ExploracionMarte getInstancia(){
        if(instancia == null){
            try {
                    instancia = new ExploracionMarte(PATH);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ExploracionMarte.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return instancia;
    }
    
    
    BufferedReader br;
    private int filas;
    private int columnas;
    private ArrayList<IExplorador> exploradores;
    
    private ExploracionMarte(String djuegotxt) throws FileNotFoundException {
        File f=new File(djuegotxt);
        FileInputStream fin=new FileInputStream(f);
        br=new BufferedReader(new InputStreamReader(fin));
        
        this.exploradores = new ArrayList<IExplorador>();
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
                    IExplorador explorador = FactoryExplorador.getExplorador(x,y,direccion,desplazamiento);
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

    public IExplorador getExplorador(int i) {
        return this.exploradores.get(i-1);
    }



    
    
}
