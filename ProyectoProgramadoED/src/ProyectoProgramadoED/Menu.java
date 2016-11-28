/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquete
package ProyectoProgramadoED;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Jorge Esteban Rojas Ugalde
 ** @date 2016-10-31- Lunes
 **/
public class Menu {
        int opc = 0;
    public void menu() {
        boolean varGlobal = true;
        while (varGlobal == true) {
            try {
                boolean volMenu2 = true;
                while (volMenu2 == true) {
                    while (opc != 1) {//Opciones del primer enunciado y si es diferente a los parámetros muestra mensaje 
                        opc = Integer.parseInt(JOptionPane.showInputDialog("Opciones \n1: Para empezar \n2: Para salir"));
                        if (opc >= 3) {
                            JOptionPane.showMessageDialog(null, "Dato inválido");
                        }
                        if (opc == 2) {
                            break;
                        }
                    }
                }
                    } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresaste un dato  inválido o cancelaste");
                int resultado = JOptionPane.showConfirmDialog(null, " Deseas volver a iniciar", "Error", JOptionPane.OK_CANCEL_OPTION);
                if (resultado == JOptionPane.CLOSED_OPTION) {
                    varGlobal = false;
                }
                if (resultado == JOptionPane.CANCEL_OPTION) {
                    varGlobal = false;
                }
                if (resultado == JOptionPane.OK_OPTION) {
                    varGlobal = true;
                }
            }
}
    }
}