/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
public class FechasParametrizadaIT {

    String fechaFactura;
    int resultado;

    public FechasParametrizadaIT(String fechaFactura, int resultado) {
        this.fechaFactura = fechaFactura;
        this.resultado = resultado;
    }

    /*
    Voy a utilizar los valores de quivalencia y borde para este caso.
     */
    @Parameters
    public static Iterable<Object> getData() {
        List<Object> obj = new ArrayList<>();

        obj.add(new Object[]{"2021-05-28", 0});
        obj.add(new Object[]{"2001-01-02", -1});
        obj.add(new Object[]{"2100-02-07", 1}); 
        
        obj.add(new Object[]{"2021-05-27", -1});
        obj.add(new Object[]{"2021-05-28", 0});
        obj.add(new Object[]{"2021-05-29", 1});

        return obj;
    }

    @Test
    public void testEsFacturaCorrectaEnFecha() throws Exception {

        Fechas instance = new Fechas();
        int expResult = resultado;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);

        assertEquals(expResult, result);

    }

}
