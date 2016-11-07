/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

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
}
