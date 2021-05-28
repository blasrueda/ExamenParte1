/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class FechasBordeIT {

    public FechasBordeIT() {
    }

    /*
         Casos de valores borde:
    2_0 - fecha =  2021-05-27      resultado = -1
    2_1 - fecha =  2021-05-28      resultado = 0
    2_2 - fecha =  2021-05-29      resultado = 1
    
    Los valores borde son el dia de ayer, hoy y mañana.
     */
    @Test
    public void borde2_0() throws Exception {
        String fechaFactura = "2021-05-27";
        Fechas instance = new Fechas();
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);

    }

    @Test
    public void borde2_1() throws Exception {
        String fechaFactura = "2021-05-28";
        Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);

    }

    @Test
    public void borde2_2() throws Exception {
        String fechaFactura = "2021-05-29";
        Fechas instance = new Fechas();
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);

    }

}
