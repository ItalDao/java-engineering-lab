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
public class EstructuraCiclicaWhile {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int nroTablaMultiplicar=0;
       int nSecuencia=0;
        System.out.println("Indicar nro. de Tabla de Multiplicar: ");
        nroTablaMultiplicar= entrada.nextInt();
        
        while(nSecuencia<13){
            System.out.println(nroTablaMultiplicar +" X "+nSecuencia+" = "+(nroTablaMultiplicar*nSecuencia));
            nSecuencia++;
        }
    }
}
