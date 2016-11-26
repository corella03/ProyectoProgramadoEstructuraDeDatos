/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.util.ArrayList;
import java.util.List;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Jorge Esteban Rojas Ugalde
 ** @date 2016-11-05- Sábado
 **
 **/
public class Banco {
    int reloj = 0;
    public int atendidos = 0;
    public int noAtendidos = 0;
    public List<Cliente> fila = new ArrayList<>();
    public List<Tramites> listaDeTramites = new ArrayList<>();

    public Banco(int totalCli, int numeroCajas, int numeroPlataformas) {
        for (int i = 0; i < totalCli; i++) {
            fila.add(new Cliente(i));
        }
        for (int i = 0; i < numeroCajas; i++) {
            listaDeTramites.add(new Cajas());
        }
        for (int i = 0; i < numeroPlataformas; i++) {
            listaDeTramites.add(new Plataforma());
        }
    }

    public int getReloj() {
        return reloj;
    }

    public int getAtendidos() {
        return atendidos;
    }

    public int getNoAtendidos() {
        return noAtendidos;
    }

    public void setReloj(int reloj) {
        this.reloj = reloj;
    }

    public void setAtendidos(int atendidos) {
        this.atendidos = atendidos;
    }

    public void setNoAtendidos(int noAtendidos) {
        this.noAtendidos = noAtendidos;
    }

    public Cliente priorizarCola(int tipo)//1 Caja - 2 Plataforma
    {
        List<Cliente> prioridadAlta = new ArrayList<>();
        List<Cliente> prioridadMedia = new ArrayList<>();
        List<Cliente> prioridadBaja = new ArrayList<>();
        List<Cliente> plataforma = new ArrayList<>();
        List<Cliente> otros = new ArrayList<>();
        for (int i = 0; i < fila.size(); i++) {
            if (!fila.get(i).atendido) {
                switch (fila.get(i).tickete.tipo) {
                    case 'A':
                    case 'C':
                        prioridadAlta.add(fila.get(i));
                        break;
                    case 'B':
                        prioridadMedia.add(fila.get(i));
                        break;
                    case 'D':
                        prioridadBaja.add(fila.get(i));
                        break;
                    case 'E':
                        plataforma.add(fila.get(i));
                        break;
                    default:
                        otros.add(fila.get(i));
                        break;
                }
            }
        }
        if (tipo == 1) {
            if (prioridadAlta.size() > 0) {
                Cliente cl = prioridadAlta.get(0);// para obtener simepre el primero de la prioridad alta que encunetre
                prioridadAlta.get(0).atendido = true;
                Cliente nuevo = new Cliente(fila.size() + 1);
                fila.add(nuevo);
                return cl;

            } else if (prioridadMedia.size() > 0) {
                Cliente cl = prioridadMedia.get(0);
                prioridadMedia.get(0).atendido = true;
                Cliente nuevo = new Cliente(fila.size() + 1);
                fila.add(nuevo);
                return cl;
            } else if (prioridadBaja.size() > 0) {
                Cliente cl = prioridadBaja.get(0);
                prioridadBaja.get(0).atendido = true;
                Cliente nuevo = new Cliente(fila.size() + 1);
                fila.add(nuevo);
                return cl;
            } else if (otros.size() > 0) {
                Cliente cl = otros.get(0);
                otros.get(0).atendido = true;
                Cliente nuevo = new Cliente(fila.size() + 1);
                fila.add(nuevo);
                return cl;
            }
            return null;//Por si la lista llega a estar vacía
        } else {
            if (plataforma.size() > 0) {
                Cliente cl = plataforma.get(0);
                plataforma.get(0).atendido = true;
                Cliente nuevo = new Cliente(fila.size() + 1);
                fila.add(nuevo);
                return cl;
            }
            return null;
        }
    }

    public void trabajar(int tiempoTrab) {
        while (reloj <= tiempoTrab) {
            for (int i = 0; i < listaDeTramites.size(); i++) {
                listaDeTramites.get(i).reloj = reloj;
                if (listaDeTramites.get(i).libre) {
                    listaDeTramites.get(i).tiempoInicioAtenCli = reloj;
                    if (listaDeTramites.get(i) instanceof Cajas) {//Instaof para saber si la instancia es de caja o plataforma
                        Cliente cl = priorizarCola(1);
                        if (cl != null) {
                            listaDeTramites.get(i).atender(cl);
                            atendidos++;
                        } else {

                            //System.out.println("No mas clientes para caja");
                        }
                    } else {
                        Cliente cl = priorizarCola(2);
                        if (cl != null) {
                            listaDeTramites.get(i).atender(cl);
                            atendidos++;
                        } else {

                            //System.out.println("No mas clientes para plataforma");
                        }
                    }
                } else {
                    listaDeTramites.get(i).atender(null);

                }
            }
            clienteSinTiempo(reloj);
            reloj++;
        }
    }

    public void clienteSinTiempo(int minutActual) {
        for (int i = 0; i < fila.size(); i++) {
            if(fila.get(i).tolerancia == minutActual && !fila.get(i).atendido){
                noAtendidos++;
                fila.get(i).atendido = true;
                Cliente nuevo = new Cliente(fila.size()+1);
                fila.add(nuevo);
            }
        }
    }

}
