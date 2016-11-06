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
    private String prioridad;
    private int tiemFila;
    private int prioriRandom;
    private int tamañoNum;
    List <String> fila = new ArrayList<>();
    public Cliente(String prioridad, int tiemFila, int prioriRandom) 
    {
        this.prioridad = prioridad;
        this.tiemFila = tiemFila;
        this.prioriRandom = prioriRandom;
    }

    public Cliente() {
    }
    public String getPrioridad() 
    {
        return prioridad;
    }
    public int getTiemFila() 
    {
        return tiemFila;
    }
    public int getPrioriRandom() 
    {
        return prioriRandom;
    }
    public int getTamañoNum() 
    {
        return tamañoNum;
    }
    public void setPrioridad(String prioridad) 
    {
        this.prioridad = prioridad;
    }
    public void setTiemFila(int tiemFila) 
    {
        this.tiemFila = tiemFila;
    }
    public void setPrioriRandom(int prioriRandom) 
    {
        this.prioriRandom = prioriRandom;
    }
    public void setTamañoNum(int tamañoNum) 
    {
        this.tamañoNum = tamañoNum;
    }
    public Object llenarFila ()
    {
        fila.add(prioridad = "A");
        fila.add(prioridad = "B");
        fila.add(prioridad = "C");
        fila.add(prioridad = "D");
        fila.add(prioridad = "E");
        fila.add(prioridad = "F");
        for (int i = 0; i < 25; i++) 
        {
            prioriRandom = (int) (Math.random()*6);
            System.out.println(fila.get(prioriRandom));
        }
        return fila.get(prioriRandom);
    
    }
    public Object Cola()
    {
        if (tamañoNum < 25)
            {
                prioriRandom = (int) (Math.random()*6);
                System.out.println(fila.get(prioriRandom)/*+tamañoNum*/);
                tamañoNum = tamañoNum +1;
            }
        Stack Cola = new Stack();
        Cola.push(this.fila.get(prioriRandom)+tamañoNum);
        System.out.println(Cola);
        return Cola;
    }
}