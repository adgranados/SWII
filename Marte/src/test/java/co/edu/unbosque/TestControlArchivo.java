/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import co.edu.unbosque.marte.ControladorArchivo;
import java.io.FileNotFoundException;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class TestControlArchivo {
    
    @Test
    public void elArchivoExiste() throws FileNotFoundException{
        ControladorArchivo c=new ControladorArchivo("d:/juego.txt");        
    }

	@Test
	public void leerMundo()throws FileNotFoundException{
			ControladorArchivo c=new ControladorArchivo("d:/juego.txt");
			Integer filas, columnas;
			filas = columnas = 0;
			c.leerMundo(Integer filas, Integer columnas);

			System.out.println(filas);
			System.out.println(columnas);
	}
}
