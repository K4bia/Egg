/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Entidades.Ahorcado;
import Servicios.AhorcadoService;

/**
 *
 * @author SNC
 */
public class AhorcadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoService as = new AhorcadoService();
       Ahorcado ahorcado = as.crearJuego();
       as.juego(ahorcado);
    }
    
}
