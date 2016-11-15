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
    public int atendidos = 0;
    public int noAtendidos = 0;
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
    public Cliente priorizarCola (int tipo)//1 Caja - 2 Plataforma
    {
        List <Cliente> prioridadAlta = new ArrayList <> ();
        List <Cliente> prioridadMedia = new ArrayList <> ();
        List <Cliente> prioridadBaja = new ArrayList <> ();
        List <Cliente> plataforma = new ArrayList <> ();
        List <Cliente> otros = new ArrayList <> ();
        for (int i = 0; i < fila.size(); i++) 
        {
            if(!fila.get(i).atendido){
                switch (fila.get(i).tickete.tipo ) {
                    case 'A' :
                    case 'C':
                        prioridadAlta.add(fila.get(i));
                        break;
                    case 'B':
                        prioridadMedia.add(fila.get(i));
                        break;
                    case 'D':
                        prioridadBaja.add(fila.get(i));
                        break;
                    case 'E':
                        plataforma.add(fila.get(i));
                        break;
                    default:
                        otros.add(fila.get(i));
                        break;
                }
            }
        }
        return null;
    }
}