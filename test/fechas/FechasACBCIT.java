/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class FechasACBCIT {

    static Fechas instance;

    public FechasACBCIT() {
    }

    @BeforeClass
    public static void BeforeClass() {
        System.out.println("BeforeClass");
        instance = new Fechas();
    }

    @AfterClass
    public static void AfterClass() {
        System.out.println("AfterClass");
        instance = null;
    }

    @Test
    public void equivalencia1_0() throws Exception {

        String fechaFactura = "2021-05-28";
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);

    }

    @Test
    public void equivalencia1_1() throws Exception {

        String fechaFactura = "2001-01-02";
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);

    }

    @Test
    public void equivalencia1_2() throws Exception {

        String fechaFactura = "2100-02-07";
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);

    }

    @Test
    public void borde2_0() throws Exception {
        String fechaFactura = "2021-05-27";
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);

    }

    @Test
    public void borde2_1() throws Exception {
        String fechaFactura = "2021-05-28";
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);

    }

    @Test
    public void borde2_2() throws Exception {
        String fechaFactura = "2021-05-29";
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);

    }

}
