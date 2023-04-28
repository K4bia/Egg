/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author SNC
 */
public class CadenaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadenaServicio cadenaServicio = new CadenaServicio();

        boolean salir = false;
        while (!salir) {
            System.out.println("===== MENÚ DE OPCIONES =====");
            System.out.println("1. Ingresar una frase");
            System.out.println("2. Mostrar la cantidad de vocales en la frase");
            System.out.println("3. Invertir la frase");
            System.out.println("4. Contabilizar la cantidad de veces que se repite una letra en la frase");
            System.out.println("5. Comparar la longitud de la frase con otra frase ingresada por el usuario");
            System.out.println("6. Unir la frase con otra frase ingresada por el usuario");
            System.out.println("7. Reemplazar todas las letras 'a' por otro carácter seleccionado por el usuario");
            System.out.println("8. Comprobar si la frase contiene una letra ingresada por el usuario");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese una frase:");
                    String frase = scanner.nextLine();
                    cadenaServicio = new CadenaServicio(frase);
                    System.out.println("Frase ingresada correctamente");
                    break;
                case 2:
                    int vocales = cadenaServicio.mostrarVocales();
                    System.out.println("La frase tiene " + vocales + " vocales");
                    break;
                case 3:
                    String fraseInvertida = cadenaServicio.invertirFrase();
                    System.out.println("La frase invertida es: " + fraseInvertida);
                    break;
                case 4:
                    System.out.println("Ingrese la letra que desea contabilizar:");
                    char letra = scanner.nextLine().charAt(0);
                    int repeticiones = cadenaServicio.vecesRepetido(letra);
                    System.out.println("La letra '" + letra + "' se repite " + repeticiones + " veces en la frase");
                    break;
                case 5:
                    System.out.println("Ingrese un nueva frase:");
                    String otraFrase = scanner.nextLine();
                    int comparacion = cadenaServicio.compararLongitud(otraFrase);
                    if (comparacion > 0) {
                        System.out.println("La frase original es más larga que la ingresada por ultimo");
                    } else if (comparacion < 0) {
                        System.out.println("La frase original es más corta que la ingresada por ultimo");
                    } else {
                        System.out.println("Las frases tienen la misma longitud");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese otra frase:");
                    String nuevaFrase = scanner.nextLine();
                    cadenaServicio.unirFrases(nuevaFrase);
                    System.out.println("La frase resultante es: " + cadenaServicio.getFrase());
                    break;
                case 7:
                    System.out.println("Ingrese el carácter por el que desea reemplazar las letras 'a':");
                    char reemplazo = scanner.nextLine().charAt(0);
                    cadenaServicio.reemplazar('a', reemplazo);
                    System.out.println("La frase resultante es: " + cadenaServicio.getFrase());
                    break;
                case 8:
                    System.out.println("Ingrese la letra que desea buscar: ");
                    char buscarL = scanner.nextLine().charAt(0);
                    if (cadenaServicio.contiene(buscarL)){
                    System.out.println("Hemos encontrado la letra " + buscarL+ " en la frase");
                    }else{
                        System.out.println("No hemos encontrado la letra " + buscarL+"en la frase");
                    }break;
                 case 0:
                    salir = true;
                    System.out.println("Gracias, vuelva prontos");
                    break;
        }
        }        
    }
}