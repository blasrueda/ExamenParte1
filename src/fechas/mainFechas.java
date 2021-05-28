/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;

/**
 *
 * @author javie
 */
public class mainFechas {

    /**
     *
     * @param args argumentos por lineas de comandos.
     * @throws ParseException -hpña
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        System.out.println("Inicio");
        Fechas miFecha = new Fechas();

        miFecha.esFacturaCorrectaEnFecha("2001-01-02");

        System.out.println("Fin");

    }
    /*
     *      0 si es el mismo día 
     *      -1 si es una fecha pasada
     *      1 si es una fecha futura
    
    Casos de prueba de equivalencia:
    1_0 -  fecha =  2021-05-28     resultado = 0   Esta fecha es del día de hoy
    1_1 -  fecha =  2001-01-02     resultado = -1
    1_2 -  fecha =  2100-02-07     resultado = 1
    
    Casos de valores borde:
    2_0 - fecha =  2021-05-27      resultado = -1
    2_1 - fecha =  2021-05-28      resultado = 0
    2_2 - fecha =  2021-05-29      resultado = 1
    
    Los valores borde son el dia de ayer, hoy y mañana.
     */
}
