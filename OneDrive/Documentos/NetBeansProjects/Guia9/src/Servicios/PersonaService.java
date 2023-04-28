/*
1- Método crearPersona que pida al usuario Nombre y fecha de nacimiento 
de la persona a crear. Retornar el objeto Persona creado.
2- Método calcularEdad que calcule la edad del usuario utilizando el 
atributo de fecha de nacimiento y la fecha actual.
3- Método menorQue recibe como parámetro una Persona y una edad. 
Retorna true si la persona es menor que la edad consultada o false en 
caso contrario.
4- Método mostrarPersona que muestra la información de la persona 
deseada.

 */
package Servicios;
import Entidades.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    private final Scanner scanner;

    public PersonaService() {
        scanner = new Scanner(System.in);
    }

    public Persona crearPersona() {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento de la persona (dd/mm/aaaa): ");
        String fechaNacimientoStr = scanner.nextLine();

        // Parsear la fecha de nacimiento
        Date fechaNacimiento = null;
        try {
            String[] partesFecha = fechaNacimientoStr.split("/");
            int dia = Integer.parseInt(partesFecha[0]);
            int mes = Integer.parseInt(partesFecha[1]);
            int anio = Integer.parseInt(partesFecha[2]);
            Calendar calendar = Calendar.getInstance();
            calendar.set(anio, mes - 1, dia);
            fechaNacimiento = calendar.getTime();
        } catch (Exception e) {
            System.out.println("Error al ingresar la fecha de nacimiento.");
        }

        return new Persona(nombre, fechaNacimiento);
    }

    public int calcularEdad(Persona persona) {
        Calendar calendarNacimiento = Calendar.getInstance();
        calendarNacimiento.setTime(persona.getFechaNacimiento());

        Calendar calendarActual = Calendar.getInstance();

        int diffAnios = calendarActual.get(Calendar.YEAR) - calendarNacimiento.get(Calendar.YEAR);
        int diffMeses = calendarActual.get(Calendar.MONTH) - calendarNacimiento.get(Calendar.MONTH);
        int diffDias = calendarActual.get(Calendar.DAY_OF_MONTH) - calendarNacimiento.get(Calendar.DAY_OF_MONTH);

        if (diffMeses < 0 || (diffMeses == 0 && diffDias < 0)) {
            diffAnios--;
        }

        return diffAnios;
    }

    public boolean menorQue(Persona persona, int edad) {
        return calcularEdad(persona) < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad(persona));
    }
}