package edu.escuelaing.arep.service.app;

import java.net.MalformedURLException;

import edu.escuelaing.arep.service.app.square.SquareServer;
import edu.escuelaing.arep.service.app.url.Url;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
  
    
   
    
   
    /**
     * Deber�a calcular el cuadrado de un n�mero
     */
    public void testCalculatorSquare () 
    {
    	SquareServer test1 = new SquareServer();
        String res1 = test1.operation("2", "");
        assertEquals(res1,"Respuesta de servidor: 4");
    }
    
    /**
     * Deber�a calcular el cuadrado de otro n�mero
     */
    public void testCalculatorSecondNumberSquare () 
    {
    	SquareServer test1 = new SquareServer();
        String res1 = test1.operation("5", "");
        assertEquals(res1,"Respuesta de servidor: 25");
    }
    
    
    //URL
    
    /**
     * Deber�a obtener el authority de una URL
     * @throws MalformedURLException 
     */
    public void testDeberiaVerInformacionDeAuthority() throws MalformedURLException 
    {
    	Url url = new Url();
        String res1 = url.authority(url.link);
        assertEquals(res1,"campusvirtual.escuelaing.edu.co:80");
    }
    
 
    /**
     * Deber�a obtener el Host de una URL
     * @throws MalformedURLException 
     */
    public void testDeberiaVerInformacionDeHost() throws MalformedURLException 
    {
    	Url url = new Url();
        String res1 = url.getHost(url.link);
        assertEquals(res1,"campusvirtual.escuelaing.edu.co");
    }
    
    /**
     * Deber�a obtener el port de una URL
     * @throws MalformedURLException 
     */
    public void testDeberiaVerInformacionDePort() throws MalformedURLException 
    {
    	Url url = new Url();
        int res1 = url.getPort(url.link);
        assertEquals(res1,80);
    }
    
    /**
     * Deber�a obtener el path de una URL
     * @throws MalformedURLException 
     */
    public void testDeberiaVerInformacionDePath() throws MalformedURLException 
    {
    	Url url = new Url();
        String res1 = url.getPath(url.link);
        assertEquals(res1,"/moodle/course/view.php");
    }
    
    
}
