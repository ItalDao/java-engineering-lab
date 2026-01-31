/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author  MATIAS
 */
public class EjemplosMetodos {
    
    static void Mensaje(String cTexto, String cNombre){
        System.out.println(cTexto);
        System.out.println(cNombre);
    }
    
    static int Sumar(int Valor1, int Valor2){
        return Valor1+Valor2;
    }
    
    public static void main(String[] args) {
       System.out.println("La Suma de 2 + 4 = "+Sumar(2,4));
    }
}
