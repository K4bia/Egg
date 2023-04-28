/*
En el Main nuevamente: inicializar A, mostrar A, ordenar A, 
inicializar B, mostrar A y B.
 */
package Main;
import Servicios.ArregloService;
/**
 *
 * @author SNC
 */
public class ArregloMain {

    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        ArregloService servicio = new ArregloService();
        
        servicio.inicializarA(arregloA);
        System.out.println("Arreglo A:");
        servicio.mostrar(arregloA);
        servicio.ordenar(arregloA);
        System.out.println("Arreglo A ordenado de mayor a menor:");
        servicio.mostrar(arregloA);
        servicio.inicializarB(arregloA, arregloB);
        System.out.println("Arreglo B:");
        servicio.mostrar(arregloB);
    }

}