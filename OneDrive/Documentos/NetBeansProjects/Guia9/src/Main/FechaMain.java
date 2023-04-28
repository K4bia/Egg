/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Servicios.FechaService;
import java.util.Date;
/**
 *
 * @author SNC
 */
public class FechaMain {

       public static void main(String[] args) {
        FechaService fecha = new FechaService();
        Date fechaNacimiento = fecha.fechaNacimiento();
        
        Date fechaActual = fecha.fechaActual();
        
        int edad = fecha.diferencia(fechaNacimiento, fechaActual);
        
        System.out.println("Tu fecha de nacimiento es: " + fechaNacimiento);
        System.out.println("La fecha actual es: " + fechaActual);
        System.out.println("Tienes " + edad + " años");
            
    }
    
}
