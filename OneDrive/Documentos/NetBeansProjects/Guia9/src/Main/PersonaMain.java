/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

/**1
 *
 * @author SNC
 */

public class PersonaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaService personaService = new PersonaService();
        Persona persona = new Persona();
        boolean salir = false;
        while (!salir){
            System.out.println("===== MENÚ DE OPCIONES =====");
            System.out.println("1. Ingresar una persona");
            System.out.println("2. Calcular edad");
            System.out.println("3. Comparar edad");
            System.out.println("4. Mostrar persona");
            System.out.println("0. Salir");
//        Persona persona = personaService.crearPersona();
//        personaService.mostrarPersona(persona);
//        System.out.println("La persona es menor que 30 años? " + personaService.menorQue(persona, 30));
        int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    personaService.crearPersona();
                    System.out.println("Nueva persona ingresada correctamente");
                    break;
                case 2:
                    personaService.calcularEdad(persona);
                    System.out.println("La edad de "+persona+"es "+personaService.calcularEdad(persona));
                    break;
                case 3:
                    System.out.println("Ingrese una edad para comparar");
                    int edad = sc.nextInt();
                    if(edad>1){
                        System.out.println("La");
                            System.out.println("La edad ingresada es mayor");
                            }
//                    decicion = (decidir) ? "Auto" : "Moto";
                    break;
                case 4:
                    System.out.println("Visualizar la persona ingresada");
//                  nuevaP.mostrarPersona(Persona);
                    break;
                case 0:
                    System.out.println("Gracias, vuelva prontos");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida por favor intente de nuevo");
                    break;        
        }
    }
    }

}
