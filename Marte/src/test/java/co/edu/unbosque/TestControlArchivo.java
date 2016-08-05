/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import co.edu.unbosque.marte.ControladorArchivo;
import java.io.FileNotFoundException;
import org.junit.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class TestControlArchivo {
    
    @Test
    public void elArchivoExiste() throws FileNotFoundException{
        ControladorArchivo c=new ControladorArchivo("/home/f209/Documentos/juego.txt");        
    }

	@Test
	public void leerMundo()throws FileNotFoundException{
			ControladorArchivo c=new ControladorArchivo("/home/f209/Documentos/juego.txt");
			Integer filas, columnas;
			c.leerMundo();
                        filas = c.getFilas();
                        columnas = c.getColumnas();
                        Assert.assertTrue(filas.equals(5));
                        Assert.assertTrue(columnas.equals(5));
			System.out.println(filas);
			System.out.println(columnas);
	}
}
