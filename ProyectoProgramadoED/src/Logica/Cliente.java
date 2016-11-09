/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
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

    public int getTolerancia() {
        return tolerancia;
    }

    public int getTiempoTrami() {
        return tiempoTrami;
    }

    public Tickete getTickete() {
        return tickete;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
    }

    public void setTiempoTrami(int tiempoTrami) {
        this.tiempoTrami = tiempoTrami;
    }

    public void setTickete(Tickete tickete) {
        this.tickete = tickete;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
    
}