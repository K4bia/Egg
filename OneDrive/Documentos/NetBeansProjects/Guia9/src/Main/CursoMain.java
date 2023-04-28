/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Entidades.Curso;
import java.util.Scanner;
/**
 *
 * @author SNC
 */
public class CursoMain {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    Curso curso = new Curso();
    
        int opc = 0;
        while (opc !=4){
            System.out.println("1. Crear curso");
            System.out.println("2. Calcular ganancia semanal");
            System.out.println("3. Mostrar informacion del curso");
            System.out.println("4. Salir");
            
            System.out.println("Ingrese una opcion: ");
            opc = sc.nextInt();
            
            switch (opc) {
                case 1:
                    curso.crearCurso();
                    System.out.println("Curso creado exitosamente");                    
                    break;
                case 2:
                    System.out.println("La ganancia semanal es: $"+ curso.calcularGananciaSemanal());
                    break;
                case 3:
                    System.out.println("Nombre del curso: " + curso.getNombreCurso());
                    System.out.println("Cantidad de horas por día: " + curso.getCantidadHorasPorDia());
                    System.out.println("Cantidad de días por semana: " + curso.getCantidadDiasPorSemana());
                    System.out.println("Turno: " + curso.getTurno());
                    System.out.println("Precio por hora: $" + curso.getPrecioPorHora());
                    System.out.println("Alumnos:");
                    String[] alumnos = curso.getAlumnos();
                    for (int i = 0; i < 5; i++) {
                        System.out.println((i+1) + ". " + alumnos[i]);
                    }
                    break;
                case 4:
                    System.out.println("Gracias, vuelva prontos.");                    
                    break;
                default:
                    System.out.println("Opcion invalida, por favor intente de nuevo");
            }
        }
        
    }
    
}
