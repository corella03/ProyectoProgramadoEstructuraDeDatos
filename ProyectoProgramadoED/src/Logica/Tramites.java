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
 **
 **/
public abstract class Tramites 
{
    //Variables de la clase que heredan a las Clases Cajas y Plataforma
    public int tiempoInicioAtenCli;
    public Cliente cliente;
    public int reloj;
    public boolean libre = true;
    public List<Cliente> atendidos;
    //Método Abstract atender le hereda a las Clases Cajas y Plataforma
    public abstract void atender(Cliente cl);
    //Método Abstract atender le hereda a las Clases Cajas y Plataforma
    public abstract int promedioAtencionCliente();
    //Constructor de Herencia recibe como parámetro tiempoInicialAtenCli, clase Cliente y reloj
    public Tramites(int tiempoInicioAtenCli, Cliente cliente, int reloj) 
    {
        this.tiempoInicioAtenCli = tiempoInicioAtenCli;
        this.cliente = cliente;
        this.reloj = reloj;
    }
    //Constructor Vacío
    public Tramites() 
    {
    }
    /**
     * Método get para variable TiempoInicioAtenCli
     * @return int TiempoInicioAtenCli
     */
    public int getTiempoInicioAtenCli() 
    {
        return tiempoInicioAtenCli;
    }
    /**
     * Método get para variable cliente
     * @return Cliente cliente
     */
    public Cliente getCliente() 
    {
        return cliente;
    }
    /**
     * Método get para variable reloj
     * @return int reloj
     */
    public int getReloj() 
    {
        return reloj;
    }
    /**
     * Método is para variable libre 
     * @return boolean libre
     */
    public boolean isLibre()
    {
        return libre;
    }
    /**
     * Método set para variable tiempoInicioAtenCli
     * @param tiempoInicioAtenCli
     */
    public void setTiempoInicioAtenCli(int tiempoInicioAtenCli)
    {
        this.tiempoInicioAtenCli = tiempoInicioAtenCli;
    }
    /**
     * Método set para variable cliente
     * @param cliente
     */
    public void setCliente(Cliente cliente) 
    {
        this.cliente = cliente;
    }
    /**
     * Método set para variable reloj
     * @param reloj
     */
    public void setReloj(int reloj) {
        
        this.reloj = reloj;
    }
    /**
     * Método set para variable libre
     * @param libre
     */
    public void setLibre(boolean libre) 
    {
        this.libre = libre;
    }
}//Fin de la Clase Abstract Tramites