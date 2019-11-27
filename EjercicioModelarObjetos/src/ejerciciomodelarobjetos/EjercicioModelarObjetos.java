/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciomodelarobjetos;

/**
 *
 * @author udemy
 */
public class EjercicioModelarObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Alumno a = new Alumno();
        a.setNombre("Ion");
        
        System.out.println("Nombre Alumno: " + a.getNombre());
        
        Libro l = new Libro();
        l.abrir();
        
        System.out.println("Nombre Alumno: " + l.isAbierto());
        
    }
    
}
