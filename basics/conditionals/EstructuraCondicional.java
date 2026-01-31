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
public class EstructuraCondicional {
    
    static String evaluarEdad(int xEdad){
        String cTexto="";
        
        if (xEdad<15){
            cTexto="Eres un niño";
        }
        else if (xEdad<17){
             cTexto="Eres un joven";
        }
        else {
             cTexto="Eres un adulto";
        }        
        return cTexto;
    }
    
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int nEdad=0;
        System.out.println("Ingresa tu edad:");
        nEdad = Entrada.nextInt();  
        
        System.out.println(evaluarEdad(nEdad)); 
        
        
    }
}
