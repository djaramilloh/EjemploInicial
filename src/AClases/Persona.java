/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AClases;

/**
 * @author djaramillo
 * Modelo: clase persona
 */
public class Persona{
        String Nombre;
        String Apellido;

        public Persona() {
        }
        public String getNombre() {
            return Nombre;
        }
        public String getApellido() {
            return Apellido;
        }       
        public Persona(String nombre, String Apellido) {
            this.Nombre = nombre;
            this.Apellido = Apellido;
        }
        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }
        public void setApellido(String Apellido) {
            this.Apellido = Apellido;
        }       
        @Override
        public String toString() {
            return "persona{" + "Nombre=  " + Nombre + ", Apellido = " + Apellido + '}';
        }
    }
