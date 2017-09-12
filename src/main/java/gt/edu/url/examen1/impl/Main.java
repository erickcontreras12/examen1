package gt.edu.url.examen1.impl;


import gt.edu.url.examen1.api.Chudnovsky;

/**
 *
 * @author Erick Contreras
 */
public class Main{
    
    public static void main(String[] args) {
        System.out.println("Examen 1");
        
        Chudnovsky pi;
        
        pi = new DigitoPi();
        
        
        System.out.println(pi.calcularPi(3));
    }
    
}
