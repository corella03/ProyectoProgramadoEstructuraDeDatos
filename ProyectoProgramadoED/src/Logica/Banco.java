/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.List;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Jorge Esteban Rojas Ugalde
 ** @date 2016-11-05- Sábado
 **/
public class Banco {
    int reloj = 0;
    public int atendidos;
    public int noAtendidos;
    public List <Cliente> fila = new ArrayList <> ();
    public List <Tramites> listaDeTramites = new ArrayList <> ();
    
    public Banco(int totalCli, int numeroCajas, int numeroPlataformas) 
    {
        for (int i = 0; i < totalCli; i++) 
        {
            fila.add(new Cliente(i));
        }
        for (int i = 0; i < numeroCajas; i++) 
        {
            listaDeTramites.add(new Cajas());
        }
        for (int i = 0; i < numeroPlataformas; i++) 
        {
            listaDeTramites.add(new Plataforma());
        }
    }

    public int getReloj() {
        return reloj;
    }

    public int getAtendidos() {
        return atendidos;
    }

    public int getNoAtendidos() {
        return noAtendidos;
    }

    public void setReloj(int reloj) {
        this.reloj = reloj;
    }

    public void setAtendidos(int atendidos) {
        this.atendidos = atendidos;
    }

    public void setNoAtendidos(int noAtendidos) {
        this.noAtendidos = noAtendidos;
    }
}