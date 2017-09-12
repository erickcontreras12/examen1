package gt.edu.url.examen1.impl;


import gt.edu.url.examen1.api.Chudnovsky;
import gt.edu.url.examen1.api.FabricaRanger;
import gt.edu.url.examen1.api.Reportero;

/**
 *
 * @author Erick Contreras
 */
public class Main{
    
    public static void main(String[] args) {
        System.out.println("Examen 1");
        
        System.out.println("Chudnovsky: ");
        Chudnovsky pi;
        pi = new DigitoPi();
        System.out.println(pi.calcularPi(2));
        
        
        
        System.out.println("\nFabrica de Monstruos");
        FabricaRanger m1,m2,m3,m4;
        
        m1 = new Monstruo("Charizard","fuego",12,"rojo");
        m2 = new Monstruo("Blastoise","agua",13,"azul");
        m3 = new Monstruo("Pidgeot","aire",20,"blanco");
        m4 = new Monstruo("Geodge","tierra",12,"cafe");
        
        m1.hacerAlgo();
        m2.hacerAlgo();
        m3.hacerAlgo();
        m4.hacerAlgo();
        
        
        System.out.println("\nPartido de Tenis");
        Reportero r1;
        
        r1 = new Tenis();
        System.out.println(r1.calcularGanador(3, 6));
        System.out.println(r1.calcularGanador(3, 5));
        System.out.println(r1.calcularGanador(7, 6));
        System.out.println(r1.calcularGanador(7, 6));
        System.out.println(r1.calcularGanador(3, 6));
        System.out.println(r1.calcularGanador(3, 7));
        System.out.println(r1.calcularGanador(7, 6));
        System.out.println(r1.calcularGanador(3, 6));
        
        
        System.out.println(r1.calcularCampeon());
    }
    
}
