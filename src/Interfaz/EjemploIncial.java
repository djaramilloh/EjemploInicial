/*
 * Programación por capas
 */
package Interfaz;

import AClases.Persona;
import BLogica.LogPersona;
import java.util.Scanner;

/**
 * @author djaramillo: Danilo jaramillo
 * Marzo 2020
 */
public class EjemploIncial {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 	Scanner myObj = new Scanner(System.in);  // Objeto Scanner  
        Persona objPer = new Persona();
        LogPersona  ObjLogPer = new LogPersona();
	String cadena;
        // entrada
        System.out.print("Nombre  ");
        cadena = myObj.nextLine();  
        objPer.setNombre(cadena);
        System.out.print("Apellido  ");
        cadena = myObj.nextLine();
        objPer.setApellido(cadena);
        // proceso
        ObjLogPer.cambiar(objPer);
        //salida
        System.out.println("Persona: " + objPer.toString());  // presentar  
    }
}
