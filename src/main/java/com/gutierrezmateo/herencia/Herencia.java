/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gutierrezmateo.herencia;
import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class Herencia {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        // Circulo
        System.out.println("Ingrese el valor del radio: ");
        double radio; 
        radio=leer.nextDouble();
        Circulo micirculo=new Circulo(radio);
        System.out.println("El area es: "+ micirculo.CalcularArea());
        //Triangulo
        System.out.println("Ingrese el valor de la base: ");
        double base; 
        base=leer.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        double altura; 
        altura=leer.nextDouble();
        Triangulo triangulo1=new Triangulo(base,altura);
        System.out.println("El area es: "+ triangulo1.CalcularArea());
        //Rectangulo
        System.out.println("Ingrese el valor de la base: ");
        base=leer.nextDouble();
        System.out.println("Ingrese el valor de la altura: "); 
        altura=leer.nextDouble();
        Rectangulo rectangulo1=new Rectangulo(base,altura);
        System.out.println("El area es: " + rectangulo1.CalcularArea());
    }
}
