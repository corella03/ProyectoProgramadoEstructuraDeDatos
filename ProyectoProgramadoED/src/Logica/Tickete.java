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
 ** @date 2016-11-05- Sábado
 **
 **/
public class Tickete 
{
    //Varaibles de la Clase
    public int numero;
    public char tipo;
    char[] prioridades = {'A', 'B', 'C', 'D', 'E', 'F'};
    //Constructor Vacío recibe como parámetro int numero
    public Tickete(int numero) 
    {
        this.tipo = prioridades[(int) (Math.random() * 5)];
        this.numero = numero;
    }
    /**
     * Método get para variable numero
     * @return int numero
     */
    public int getNumero() 
    {
        return numero;
    }
    /**
     * Método get para variable tipo
     * @return char tipo
     */
    public char getTipo() 
    {
        return tipo;
    }
    /**
     * Método set para variable numero
     * @param numero
     */
    public void setNumero(int numero) 
    {
        this.numero = numero;
    }
    /**
     *  Método set para variable tipo
     * @param tipo
     */
    public void setTipo(char tipo) 
    {
        this.tipo = tipo;
    }
}//Fin de la Clase Tickete