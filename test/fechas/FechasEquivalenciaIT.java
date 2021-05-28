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
public class FechasEquivalenciaIT {

    public FechasEquivalenciaIT() {
    }

    /*
     *      0 si es el mismo día 
     *      -1 si es una fecha pasada
     *      1 si es una fecha futura
    
    Casos de prueba de equivalencia:
    1_0 -  fecha =  2021-05-28     resultado = 0   Esta fecha es del día de hoy
    1_1 -  fecha =  2001-01-02     resultado = -1
    1_2 -  fecha =  2100-02-07     resultado = 1

     */
    @Test
    public void equivalencia1_0() throws Exception {

        String fechaFactura = "2021-05-28";
        Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);

    }

    @Test
    public void equivalencia1_1() throws Exception {

        String fechaFactura = "2001-01-02";
        Fechas instance = new Fechas();
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);

    }

    @Test
    public void equivalencia1_2() throws Exception {

        String fechaFactura = "2100-02-07";
        Fechas instance = new Fechas();
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);

    }

}
