/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Andres Ortega
 */
public class Canario implements PuedeCantar {

    @Override
    public void cantar() {
        System.out.println("pio pio pio");
    }

}
