/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;
/**
 *
 * @author MATIAS
 */
public class Matriz {
    public static void main(String[] args) {
        String [][] Personas = new String[4][3];
        
        Personas[0][0]="VICTOR";
        Personas[0][1]="RAMOS";
        Personas[0][2]="SARAVIA";
        
        Personas[1][0]="CARLOS";
        Personas[1][1]="ARIAS";
        Personas[1][2]="RIOS";
        
        Personas[2][0]="JUAN";
        Personas[2][1]="MARTINEZ";
        Personas[2][2]="GONZALES";
        
        Personas[3][0]="ANA";
        Personas[3][1]="CÁCERES";
        Personas[3][2]="ARIAS";
        
        
        for (int a = 0; a <=3; a++) {
            
           for (int i = 0; i <= 2; i++) {
            System.out.println(Personas[a][i]);
           } 
            System.out.println("-----*-----");
        } 
    }
}
