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
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona pavaroti = new Persona();
        hacerCantar(pavaroti);
        
        Canario piolin = new Canario();
        hacerCantar(piolin);
        
        Burro pepe = new Burro();
        hacerCantar(pepe);
        
    }
    
    public static void hacerCantar(PuedeCantar cantor) {
        cantor.cantar();
    }
    
}
