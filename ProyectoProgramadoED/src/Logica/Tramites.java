/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquete
package Logica;
//Importes
import java.util.List;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Jorge Esteban Rojas Ugalde
 ** @date 2016-10-31- Lunes
 **/
public abstract class Tramites {
    public int tiempoInicioAtenCli;
    public Cliente cliente;
    public int reloj;
    public boolean libre = true;
    public List <Cliente> atendidos;
    public abstract void atender (Cliente cl);
    public abstract int promedioAtencionCliente();
    //Constructor de Herencia
    public Tramites(int tiempoInicioAtenCli, Cliente cliente, int reloj) 
    {
        this.tiempoInicioAtenCli = tiempoInicioAtenCli;
        this.cliente = cliente;
        this.reloj = reloj;
    }
    //Constructor Vacío
    public Tramites() {
    }
    
    public int getTiempoInicioAtenCli() 
    {
        return tiempoInicioAtenCli;
    }
    public Cliente getCliente() 
    {
        return cliente;
    }
    public int getReloj() 
    {
        return reloj;
    }
    public boolean isLibre() 
    {
        return libre;
    }
    public void setTiempoInicioAtenCli(int tiempoInicioAtenCli) 
    {
        this.tiempoInicioAtenCli = tiempoInicioAtenCli;
    }
    public void setCliente(Cliente cliente) 
    {
        this.cliente = cliente;
    }
    public void setReloj(int reloj) 
    {
        this.reloj = reloj;
    }
    public void setLibre(boolean libre) 
    {
        this.libre = libre;
    }
}