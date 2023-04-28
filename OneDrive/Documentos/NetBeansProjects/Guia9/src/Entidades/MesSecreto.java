/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author SNC
 */
public class MesSecreto {
    private String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String[] mesSecreto = meses;
    
    public MesSecreto(){
    }

    public MesSecreto(String[] meses, String[] mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String[] getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSectro(String[] mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    public void adivinar(){
       Scanner sc = new Scanner(System.in);
       this.mesSecreto = new String[12];
       for (int i = 0; i < 5; i++) {
       System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
       this.mesSecreto[i] = sc.nextLine();
    }
}
}
