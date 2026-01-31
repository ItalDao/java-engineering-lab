/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author  MATIAS
 */
class Persona{
    //Atributos
    String Nombre;
    int Edad;
    String Telefono;
    
    static void Saludo(String cNombre){
        System.out.println("Hola que tal "+cNombre);
    }
}

public class EjemplosClases {
    public static void main(String[] args) {
        Persona oPersona1 = new Persona();
        Persona oPersona2 = new Persona();
        
        oPersona1.Nombre="VICTOR";
        oPersona1.Edad=40;
        oPersona1.Telefono="942366999";
        
        oPersona2.Nombre="Carlos";
        oPersona2.Edad=15;
        oPersona2.Telefono="989898989";
        
        System.out.println(oPersona1.Nombre+" - "+oPersona2.Nombre);
        
        Persona.Saludo(oPersona1.Nombre);
    }
}
