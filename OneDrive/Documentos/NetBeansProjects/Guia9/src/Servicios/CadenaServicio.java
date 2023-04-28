/*
a- Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
b- Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: 
Entrada: "casa blanca", Salida: "acnalb asac".
c- Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas 
veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
d- Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con 
otra nueva frase ingresada por el usuario.
e- Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase 
ingresada por el usuario y mostrar la frase resultante.
f- Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
g- Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y 
devuelve verdadero si la contiene y falso si no.


 */
package Servicios;
import Entidades.Cadena;

/**
 *
 * @author SNC
 */
public class CadenaServicio {
    private final Cadena cadena;

    public CadenaServicio() {
        this.cadena = new Cadena();
    }

    public CadenaServicio(String frase) {
        this.cadena = new Cadena(frase);
    }

    public void setFrase(String frase) {
        this.cadena.setFrase(frase);
    }

    public int mostrarVocales() {
        String frase = this.cadena.getFrase();
        int vocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vocales++;
            }
        }
        return vocales;
    }

    public String invertirFrase() {
        String frase = this.cadena.getFrase();
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }
        return fraseInvertida;
    }

    public int vecesRepetido(char letra) {
        String frase = this.cadena.getFrase();
        int repeticiones = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                repeticiones++;
            }
        }
        return repeticiones;
    }

    public boolean contiene(char letra) {
        String frase = this.cadena.getFrase();
        return frase.indexOf(letra) != -1;
    }

    public void reemplazar(char letraOriginal, char letraReemplazo) {
        String frase = this.cadena.getFrase();
        String fraseReemplazada = frase.replace(letraOriginal, letraReemplazo);
        this.cadena.setFrase(fraseReemplazada);
    }

    public void unirFrases(String nuevaFrase) {
        String frase = this.cadena.getFrase();
        frase += " " + nuevaFrase;
        this.cadena.setFrase(frase);
    }

    public int compararLongitud(String otraFrase) {
        int longitudOtraFrase = otraFrase.length();
        int longitudActual = this.cadena.getLongitud();
        if (longitudActual > longitudOtraFrase) {
            return 1;
        } else if (longitudActual < longitudOtraFrase) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getFrase() {
        return this.cadena.getFrase();
    }
}

