/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquete
package Logica;
//Importes
import java.util.ArrayList;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Jorge Esteban Rojas Ugalde
 ** @date 2016-10-31- Lunes
 **
 **/
public class Cajas extends Tramites 
{
    //Método atender heredado de la clase Abstract, recibe como parámetro la clase Cliente
    @Override
    public void atender(Cliente cl) 
    {
        if (cl != null) 
        {
            this.cliente = cl;
        }
        //Si el tiempo del tramite más el tiempo desde que el cliente inicio es igual al reloj
        if (this.cliente.tiempoTrami + this.tiempoInicioAtenCli == this.reloj) 
        {
            //la caja esta libre y puede atender
            this.libre = true;
            //Se suma el cliente atendido
            this.atendidos.add(this.cliente);
        } else 
        {
            //La caja sigue atendiendo "no esta libre"
            this.libre = false;
        }
    }//Fin del Método atender
    //Constructor Vacío
    public Cajas() 
    {
        this.atendidos = new ArrayList<>();//Inicializando la lista
    }
    //Método promedioAtencionCliente heredado de la clase Abstract, lo que hace es 
    //dar a conocer el pormedio de cantidad de clientes por Caja
    @Override
    public int promedioAtencionCliente() 
    {
        int sumaPromedio = 0;
        for (int i = 0; i < atendidos.size(); i++) 
        {
            sumaPromedio = sumaPromedio + atendidos.get(i).tiempoTrami;
        }
        sumaPromedio = sumaPromedio / atendidos.size();
        return sumaPromedio;
    }//Fin del Método promedioAtencionCliente
}//Fin de la Clase Cajas