/*
1- Método fechaNacimiento que pregunte al usuario día, mes 
y año de su nacimiento. Luego los pase por parámetro a un 
nuevo objeto Date. El método debe retornar el objeto Date. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
2- Método fechaActual que cree un objeto fecha con el día 
actual. Para esto usaremos el constructor vacío de la clase Date.
Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
3- Método diferencia que reciba las dos fechas por parámetro 
y retorna la diferencia de años entre una y otra (edad del usuario).

 */
package Servicios;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SNC
 */
public class FechaService {    
       
    public Date fechaNacimiento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia de su nacimiento;");
        int dia =  sc.nextInt();
        System.out.println("Ingrese el mes de su nacimiento;");
        int mes =  sc.nextInt();
        System.out.println("Ingrese el año de su nacimiento;");
        int anio =  sc.nextInt();
        return new Date(anio-1900, mes -1, dia);
    }
    
    public Date fechaActual(){
        return new Date();        
    }
    public int diferencia(Date fecha1, Date fecha2) {
        int anios = (int) ((fecha2.getTime() - fecha1.getTime()) /(1000 * 60 * 60 * 24 * 365L));
        return anios;
    }
    
}
