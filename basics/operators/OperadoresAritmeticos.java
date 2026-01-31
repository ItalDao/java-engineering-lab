/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author  MATIAS
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int Numero1, Numero2;
        int Resultado_sum, Resultado_res, Resultado_mul, Resultado_div1, Resultado_div2;
        Numero1=10;
        Numero2=15;
        
        //SUMA
        Resultado_sum = Numero1 + Numero2;
        System.out.println(Resultado_sum);
        
        //RESTA
        Resultado_res= Numero2 - Numero1;
        System.out.println(Resultado_res);
        
        //MULTIPLICAR
        Resultado_mul= Numero1*Numero2;
        System.out.println(Resultado_mul);
         
        //DIVIDIR 1
        Resultado_div1 = 21 /2;
        System.out.println(Resultado_div1);
        
        //DIVIDIR 2
        Resultado_div2 = 21 % 2;
        System.out.println(Resultado_div2);
        
    }
}
