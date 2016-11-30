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
 ** @date 2016-10-21- Lunes
 **
 **/
public class Plataforma extends Tramites
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
        
        {//la caja esta libre y puede atender
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
    public Plataforma() 
    {
        this.atendidos = new ArrayList<>();//Inicializando la lista
    }
    //Método promedioAtencionCliente heredado de la clase Abstract, lo que hace es 
    //dar a conocer el pormedio de cantidad de clientes en la Plataforma
    @Override
    public int promedioAtencionCliente() 
    {
        int sumaPromedioPlataforma = 0;
        for (int i = 0; i < atendidos.size(); i++) 
        {
            sumaPromedioPlataforma = sumaPromedioPlataforma + atendidos.get(i).tiempoTrami;
        }
        sumaPromedioPlataforma = sumaPromedioPlataforma / atendidos.size();
        return sumaPromedioPlataforma;
    }//Fin del Método promedioAtencionCliente
}//Fin de la Clase Plataforma