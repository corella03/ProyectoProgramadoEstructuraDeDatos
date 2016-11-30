/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquete
package ProyectoProgramadoED;
//Importes
import Logica.Banco;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Jorge Esteban Rojas Ugalde
 ** @date 2016-10-31- Lunes *
 **
 **/
public class Menu 
{
    public boolean menu() 
    {
        //Variable para las opciones del menú
        int opc = 0;
        //boolean para verificar el JOptiona a la hora de escoger opcion al inicio 
        boolean varGlobal = true;
        while (varGlobal == true) 
        {
            try 
            {
                //boolean para poder regresar al programa sin tener qu iniciarlo de nuevo o para salir
                boolean volMenu = true;
                //Cuando sea verdadero regrese si no salir
                while (volMenu == true) 
                {
                    //Opciones del primer enunciado y si es diferente a los parámetros muestra mensaje
                    while (opc != 1) 
                    { 
                        opc = Integer.parseInt(JOptionPane.showInputDialog("Opciones \n1: Para empezar \n2: Para salir"));
                        if (opc >= 3) 
                        {
                            JOptionPane.showMessageDialog(null, "Dato inválido");
                        }
                        if (opc == 2) 
                        {
                            return false;
                        }
                    }
                    //switch para las opciones a ingresar
                    switch (opc) 
                    {
                        //Si la opción es 1 corra el programa
                        case 1: 
                        {
                            //La fila del banco va a tener un maximo de 25 personas, 5 cajas y 1 plataforma
                            Banco bn = new Banco(25, 5, 1);
                            //Se ingresa las horas a trabajar
                            int horasATrabajar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las Horas a Trabajar " + "\n<html><font color=\"red\">Max: (8) horas"));
                            //Solo se aceptan un maximo de 8 horas
                            if (horasATrabajar >= 1 && horasATrabajar <= 8) 
                            {
                                //Convierte el digito ingresado en horas
                                bn.trabajar(horasATrabajar * 60);
                                //Mensajes de Reportes
                                System.out.println("\n\033[34mCantidad de personas en ingresar al banco es: " + (bn.atendidos + bn.noAtendidos) + "\033[34m");
                                System.out.println("\033[32mLa Cantodad de Clientes atendidos en " + horasATrabajar + " horas es de: " + bn.atendidos + "\033[32m");
                                System.out.println("\033[31mLa Cantidad de clientes que se fueron es de: " + bn.noAtendidos + "\033[31m");
                                //Caja1
                                System.out.println("");
                                System.out.println("\033[36mEl tiempo promedio de atencion por cliente de la Caja #1 es de: "
                                        + bn.listaDeTramites.get(0).promedioAtencionCliente() + " minutos\033[36m");
                                System.out.println("\033[32mCantidad de clientes atendios por la Caja #1  son "
                                        + bn.listaDeTramites.get(0).atendidos.size() + "\033[32m");
                                //Caja2
                                System.out.println("");
                                System.out.println("\033[36mEl tiempo promedio de atencion por cliente de la Caja #2 es de: "
                                        + bn.listaDeTramites.get(1).promedioAtencionCliente() + " minutos\033[36m");
                                System.out.println("\033[32mCantidad de clientes atendios por la Caja #2 son "
                                        + bn.listaDeTramites.get(1).atendidos.size() + "\033[32m");
                                //Caja3
                                System.out.println("");
                                System.out.println("\033[36mEl tiempo promedio de atencion por cliente de la Caja #3 es de: "
                                        + bn.listaDeTramites.get(2).promedioAtencionCliente() + " minutos\033[36m");
                                System.out.println("\033[32mCantidad de clientes atendios por la Caja #3 son "
                                        + bn.listaDeTramites.get(2).atendidos.size() + "\033[32m");
                                //Caja4
                                System.out.println("");
                                System.out.println("\033[36mEl tiempo promedio de atencion por cliente de la Caja #4 es: "
                                        + bn.listaDeTramites.get(3).promedioAtencionCliente() + " minutos\033[36m");
                                System.out.println("\033[32mCantidad de clientes atendios por la Caja #4  son "
                                        + bn.listaDeTramites.get(3).atendidos.size() + "\033[32m");
                                //Caja5
                                System.out.println("");
                                System.out.println("\033[36mEl tiempo promedio de atencion por cliente de la Caja #5  es: "
                                        + bn.listaDeTramites.get(4).promedioAtencionCliente() + " minutos\033[36m");
                                System.out.println("\033[32mCantidad de clientes atendios por la Caja #5 son "
                                        + bn.listaDeTramites.get(4).atendidos.size() + "\033[32m");
                                //Plataforma
                                System.out.println("");
                                System.out.println("\033[36mEl tiempo promedio de atencion por cliente de Platafroma es: "
                                        + bn.listaDeTramites.get(5).promedioAtencionCliente() + " minutos\033[36m");
                                System.out.println("\033[32mCantidad de clientes atendios por Plataforma son "
                                        + bn.listaDeTramites.get(5).atendidos.size() + "\033[32m");
                                System.out.println("\n*********-~-~-~-~-*********-~-~-~-~-*********-~-~-~-~-*********");
                                System.out.println("*********-~-~-~-~-*********-~-~-~-~-*********-~-~-~-~-*********");
                                System.out.println("*********-~-~-~-~-*********-~-~-~-~-*********-~-~-~-~-*********");
                                //Si las horas ingresadas es mayor que 8
                            } else if (horasATrabajar > 8) 
                            {
                                JOptionPane.showMessageDialog(null, "Dato inválido");
                            }
                        }
                        break;
                        //Si la opción es 2 salgase del programa 
                        case 2: 
                        {
                            varGlobal = false;
                        }
                        break;
                    }
                    int resultado = JOptionPane.showConfirmDialog(null, "Desea volver al menu", "error", JOptionPane.CANCEL_OPTION);
                    //Funciones para los botones del volver al menú
                    if (resultado == JOptionPane.CLOSED_OPTION) 
                    {
                        volMenu = false;
                    }
                    if (resultado == JOptionPane.CANCEL_OPTION) 
                    {
                        volMenu = false;
                    }
                    if (resultado == JOptionPane.OK_OPTION) 
                    {
                        volMenu = true;
                    }
                }
                break;
            } catch (HeadlessException | NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Ingresaste un dato  inválido o cancelaste");
                //Funciones para los botones del menu
                int resultado = JOptionPane.showConfirmDialog(null, " Deseas volver a iniciar", "Reporte", JOptionPane.OK_CANCEL_OPTION);
                if (resultado == JOptionPane.CLOSED_OPTION) 
                {
                    varGlobal = false;
                }
                if (resultado == JOptionPane.CANCEL_OPTION) 
                {
                    varGlobal = false;
                }
                if (resultado == JOptionPane.OK_OPTION) 
                {
                    varGlobal = true;
                }
            }
        }
        return false;
    }//Fin del metodo
}//Fin de la clase