/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;
import java.util.Scanner;


/**
 *
 * @author  MATIAS
 */
public class EntradaDatos {
    public static void main(String[] args) {
       Scanner Entrada = new Scanner(System.in);
       String Nombre;
       String Profesion;
       int Edad;
       double Sueldo;
       
       //Preparar el proceso
       System.out.println("Ingresa tu Nombre:");
       Nombre = Entrada.nextLine();
       
       System.out.println("Ingresa tu Profesion:");
       Profesion = Entrada.nextLine();
       
       System.out.println("Ingresa tu edad:");
       Edad = Entrada.nextInt();
       
       System.out.println("Ingresa tu Sueldo:");
       Sueldo = Entrada.nextDouble();   
       Nombre = Nombre + ((char) Sueldo);
       System.out.println("Hola "+Nombre +" tu profesion es "+Profesion +" siendo tu edad "+ Edad + " y ganando el sueldo "+ Sueldo);
    }
}
