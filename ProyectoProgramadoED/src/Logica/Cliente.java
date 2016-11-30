/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquete
package Logica;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Jorge Esteban Rojas Ugalde
 ** @date 2016-10-21- Lunes
 **
 **/
public class Cliente 
{
    //Variables de la Clase 
    public int tolerancia = (int) (Math.random() * 45 + 3);//Tolerancia del cliente random
    public int tiempoTrami = (int) (Math.random() * 30 + 5);//Tiempo en que dura el Tramite del cliente random
    public Tickete tickete;
    public boolean atendido = false;
    //Constructor Vacío recibe como parámetro int numero
    public Cliente(int numero) 
    {
        this.tickete = new Tickete(numero);//Para que al crear el cliente se le asigne un numero
    }
    /**
     * Método get para variable tolerancia
     * @return int tolerancia
     */
    public int getTolerancia() 
    {
        return tolerancia;
    }
    /**
     * Método get para variable tiempoTrami
     * @return int tiempoTrami
     */
    public int getTiempoTrami() 
    {
        return tiempoTrami;
    }
    /**
     * Método get para variable tickete
     * @return Tickete tickete
     */
    public Tickete getTickete() 
    {
        return tickete;
    }
    /**
     * Método is para variable atendido
     * @return boolean atendido
     */
    public boolean isAtendido() 
    {
        return atendido;
    }
    /**
     * Método set para variable tolerancia
     * @param tolerancia
     */
    public void setTolerancia(int tolerancia) 
    {
        this.tolerancia = tolerancia;
    }
    /**
     * Método set para variable tiempoTrami
     * @param tiempoTrami
     */
    public void setTiempoTrami(int tiempoTrami) 
    {
        this.tiempoTrami = tiempoTrami;
    }
    /**
     * Método set para variable tickete
     * @param tickete
     */
    public void setTickete(Tickete tickete) 
    {
        this.tickete = tickete;
    }
    /**
     * Método set para variable atendido
     * @param atendido
     */
    public void setAtendido(boolean atendido)
    {
        this.atendido = atendido;
    }
}//Fin de la Clase Cliente