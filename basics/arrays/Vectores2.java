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
public class Vectores2 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int nCantNotas=0;  
        
        System.out.println("Ingrese la cantidades de notas/calificaciones:");
        nCantNotas=Entrada.nextInt();
        
        int [] Notas = new int [nCantNotas];
        
        for (int i = 0; i < nCantNotas; i++) {
            System.out.print("Ingresa la nota para la posición #"+i+" = ");
            Notas[i]=Entrada.nextInt();
        }
        
        System.out.println("Impresión de notas ingresadas");
        for (int a = 0; a < nCantNotas; a++) {
            System.out.println(Notas[a]);
        }
    }
}
