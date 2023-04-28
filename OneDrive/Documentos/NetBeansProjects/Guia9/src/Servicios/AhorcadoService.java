/*
a- Metodo crearJuego(): le pide la palabra al usuario y cantidad de 
jugadas máxima. Con la palabra del usuario, pone la longitud de la 
palabra, como la longitud del vector. Después ingresa la palabra en 
el vector, letra por letra, quedando cada letra de la palabra en un 
índice del vector. Y también, guarda la cantidad de jugadas máximas 
y el valor que ingresó el usuario.
b- Método longitud(): muestra la longitud de la palabra que se debe 
encontrar. Nota: buscar como se usa el vector.length.
c- Método buscar(letra):  este método recibe una letra dada por el 
usuario y busca si la letra ingresada es parte de la palabra o no. 
También informará si la letra estaba o no.
d- Método encontradas(letra):  que reciba una letra ingresada por el 
usuario y muestre cuantas letras han sido encontradas y cuántas 
le faltan. Este método además deberá devolver true si la letra estaba
y false si la letra no estaba, ya que, cada vez que se busque una 
letra que no esté, se le restará uno a sus oportunidades.
e- Método intentos(): para mostrar cuántas oportunidades le queda al 
jugador.
f- Método juego(): el método juego se encargará de llamar todos los 
métodos previamente mencionados e informará cuando el usuario 
descubra toda la palabra o se quede sin intentos. Este método se 
llamará en el main.

 */
package Servicios;
import java.util.Scanner;
import Entidades.Ahorcado;
import java.util.Arrays;

/**
 *
 * @author SNC
 */
public class AhorcadoService {
    Scanner sc = new Scanner(System.in);
     int cont = 0, intentosRestantes = 0;
     
    
    public Ahorcado crearJuego() {        
        System.out.println("Ingrese la palabra a adivinar:");
        String palabraStr = sc.nextLine();
                char[] palabra = palabraStr.toCharArray();
        System.out.println("Ingrese la cantidad máxima de intentos:");
        int intentos = sc.nextInt();
        int letrasEncontradas = palabra.length;
        return new Ahorcado(palabra, intentos, letrasEncontradas);

    }
    
    public void  longitud(Ahorcado palabra){
        int longitud = palabra.getPalabra().length;
        System.out.println("La longitud de la palabra es de: "+longitud);        
    }
    
//    c- Método buscar(letra):  este método recibe una letra dada por el 
//usuario y busca si la letra ingresada es parte de la palabra o no. 
//También informará si la letra estaba o no.
//    
//    d- Método encontradas(letra):  que reciba una letra ingresada por el 
//usuario y muestre cuantas letras han sido encontradas y cuántas 
//le faltan. Este método además deberá devolver true si la letra estaba
//y false si la letra no estaba, ya que, cada vez que se busque una 
//letra que no esté, se le restará uno a sus oportunidades.
    
    public boolean encontradas(Ahorcado letra, char str) {
        int cuentaBool=0;
        boolean condicion = false;
        char[] letrasUsadas = letra.getPalabra();
        for (int i = 0; i < letra.getPalabra().length; i++) {
            if (str == letrasUsadas[i]) {
                cont++;
                cuentaBool ++;
                letrasUsadas[i]= ' ';
            }
        }
        letra.setLetrasEncon(letra.getPalabra().length-cont);
        System.out.println("Número de letras (encontradas, faltantes): ("+cont+", "+letra.getLetrasEncon()+")");
        if(cuentaBool>0){
        condicion = true;
    }
    return condicion;
    } 
    
    public void buscar (Ahorcado letra) {        
        do{
        System.out.println("Ingrese una letra: ");
        String  letr = sc.next();
        int cont = 0;
        char str = letr.charAt(0);// Me guarda el primer caracter
        for (int i = 0; i < letra.getPalabra().length; i++) {
            if (str == letra.getPalabra()[i]){
                cont ++;
            }
        }
        if (cont>0){
            System.out.println("La letra esta dentro de la palabra");
        }else{
            System.out.println("La letra no estaba dentro de la palabra");
        }
        boolean condicion = encontradas(letra, str);
        intentosRestantes  = intentos(letra, condicion);
        if(intentosRestantes == 0){
            System.out.println("Se agotaron los intentos");            
        }else{
            System.out.println("Has adivinado la letra");
        }
        }while(intentosRestantes !=0 && letra.getLetrasEncon()!=0);
        if(letra.getLetrasEncon()==0){
            System.out.println("Adivinaste! Has ganado.");
        }else{
                    System.out.println("Lo siento, sera la proxima vez.");           
        }
    }
        
//    e- Método intentos(): para mostrar cuántas oportunidades le queda al 
//jugador.
    
    public int intentos(Ahorcado intento, boolean condicion){
       
        if(condicion== true ){
            System.out.println("Quedan "+intento.getIntentos());            
        }else{
            intento.setIntentos(intento.getIntentos()-1);
             System.out.println("Quedan "+intento.getIntentos());            
        }
         int cantIntentos = intento.getIntentos();
        return cantIntentos;        
    }
    
    public void juego(Ahorcado inicio){
        longitud(inicio);
        buscar(inicio);
    }
    
    
    
}
