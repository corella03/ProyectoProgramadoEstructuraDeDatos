/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Jorge Esteban Rojas Ugalde
 ** @date 2016-10-31- Lunes
 **/
public class Cajas extends Tramites{
    
    @Override
    public void atender(Cliente cl) 
    {
        if(cl != null){
            this.cliente = cl;
        }
        if (this.cliente.tiempoTrami + this.tiempoInicioAtenCli == this.reloj)
        {
            this.libre = true;
            this.atendidos.add(this.cliente);
        }else
        {
            this.libre = false;
        }
    }
    

    public Cajas() 
    {
        this.atendidos = new ArrayList <> ();//Inicializando la lista
    }

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
    }
}
