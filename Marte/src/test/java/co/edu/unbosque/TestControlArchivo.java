/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;


import co.edu.unbosque.marte.ExploracionMarte;
import co.edu.unbosque.marte.IExplorador;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class TestControlArchivo {
    
    
    @Test
    public void elArchivoExiste() throws FileNotFoundException{
        ExploracionMarte exploracionMarte=ExploracionMarte.getInstancia();        
    }
    /**
     * El metodo prueba que el tamaño de Marte se haya cargodo correctamente.
     * @throws FileNotFoundException
     * @throws IOException 
     */
	@Test
	public void testCargaTamanoCorrectoMarte()throws FileNotFoundException, IOException{
			ExploracionMarte exploracionMarte=ExploracionMarte.getInstancia(); 
			Integer filas, columnas;
			exploracionMarte.leerMundo();
                         filas = exploracionMarte.getFilas();
                        columnas = exploracionMarte.getColumnas();
                        Assert.assertTrue(filas.equals(5));
                        Assert.assertTrue(columnas.equals(5));
	}
        /**
     * El metodo prueba que la carga del primer explorador sea correcta
     * @throws FileNotFoundException
     * @throws IOException 
     */
	@Test
	public void testCargaCorrectaPrimerExploradorDesdeArchivo()throws FileNotFoundException, IOException{
			ExploracionMarte exploracionMarte=ExploracionMarte.getInstancia(); 
			Integer filas, columnas;
			exploracionMarte.leerMundo();
                        IExplorador explorador1 = exploracionMarte.getExplorador(1);
                        Assert.assertTrue(explorador1.getXPos()==1);
                        Assert.assertTrue(explorador1.getYPos()==2);
                        Assert.assertTrue(explorador1.getDireccion().equals("N"));
	}
}
