/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLogica;

import AClases.Persona;

/**
 * @author djaramillo
 * Logica persona
 */
public class LogPersona {
    public void cambiar (Persona objPer){
        objPer.setNombre(objPer.getNombre().replace("o", "x"));
        objPer.setApellido(objPer.getApellido().replace("o", "x"));
    }
}
