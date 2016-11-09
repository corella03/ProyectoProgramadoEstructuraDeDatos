/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Jorge Esteban Rojas Ugalde
 ** @date 2016-11-05- Sábado
 **/
public class Tickete {
    public int numero;
    public char tipo;
    char[] prioridades  = {'A','B','C','D','E','F'};
    
    public Tickete (int numero)
    {
        this.tipo = prioridades[(int) (Math.random()*5)];
        this.numero = numero;
    }
}
