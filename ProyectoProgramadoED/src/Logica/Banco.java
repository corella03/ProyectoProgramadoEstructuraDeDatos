/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class Banco {
    int reloj = 0;
    public int atendidos;
    public int noAtendidos;
    public List <Cliente> fila = new ArrayList <> ();
    public List <Tramites> listaDeTramites = new ArrayList <> ();
}
