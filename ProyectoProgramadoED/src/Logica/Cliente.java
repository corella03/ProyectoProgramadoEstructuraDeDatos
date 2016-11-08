/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Jorge Esteban Rojas Ugalde
 ** @date 2016-10-21- Lunes
 **/
public class Cliente {
    public int tolerancia = (int) (Math.random()*45+3);
    public int tiempoTrami = (int) (Math.random()*30+5);
    public Tickete tickete;
    public boolean atendido = false;
    
    public Cliente (int numero)
    {
        this.tickete = new Tickete (numero);//Para que al crear el clinete se le asigne un numero
    }
}