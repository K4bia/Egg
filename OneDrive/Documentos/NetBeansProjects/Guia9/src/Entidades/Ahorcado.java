/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author SNC
 */
public class Ahorcado {
    private char [] palabra;
    private int letrasEncon;
    private int intentos;
    
    public Ahorcado(){
    }

    public Ahorcado(char[] palabra, int intentos, int letrasEncon) {
        this.palabra = palabra;
        this.intentos = intentos;
        this.letrasEncon = letrasEncon;
    }
  

    public char[] getPalabra() {
        return palabra;
    }

    public int getLetrasEncon() {
        return letrasEncon;
    }
    
    public void  setLetrasEncon(int letrasEncontradas) {
        this.letrasEncon= letrasEncontradas;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;      
    }
    public int getIntentos() {
        return intentos;
    }

}