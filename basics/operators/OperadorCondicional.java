/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author  MATIAS
 */
public class OperadorCondicional {
    public static void main(String[] args) {
        //exp1 ? exp2 : exp3
        
        int Numero1, Numero2;
        String Respuesta="";
        Numero2=10; Numero1=6;
        Respuesta = (Numero1>Numero2) ? "Es Mayor" : "Es menor";
        System.out.println(Respuesta);
    }
}
