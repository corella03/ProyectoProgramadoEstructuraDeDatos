/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquete
package Logica;
//Importes
import java.util.ArrayList;
import java.util.List;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Jorge Esteban Rojas Ugalde
 ** @date 2016-11-05- Sábado 
 **
 **/
public class Banco 
{
    //Variables y Listas de la clase
    int reloj = 0;
    public int atendidos = -6;
    public int noAtendidos = 0;
    public List<Cliente> fila = new ArrayList<>();
    public List<Tramites> listaDeTramites = new ArrayList<>();
    //Constructor que recibe por parámetros clientes, cajas y plataforma
    public Banco(int totalCli, int numeroCajas, int numeroPlataformas) 
    {
        for (int i = 0; i < totalCli; i++) 
        {
            fila.add(new Cliente(i));
        }
        for (int i = 0; i < numeroCajas; i++) 
        {
            listaDeTramites.add(new Cajas());
        }
        for (int i = 0; i < numeroPlataformas; i++) 
        {
            listaDeTramites.add(new Plataforma());
        }
    }
    /**
     * Método get para variable reloj
     * @return int reloj
     */
    public int getReloj() 
    {
        return reloj;
    }
    /**
     * Método get para variable atendidos
     * @return int atendidos
     */
    public int getAtendidos() 
    {
        return atendidos;
    }
    /**
     * Método get para variable noAtendidos
     * @return int noAtendidos
     */
    public int getNoAtendidos() 
    {
        return noAtendidos;
    }
    /**
     * Método set para variable reloj
     * @param reloj
     */
    public void setReloj(int reloj) 
    {
        this.reloj = reloj;
    }
    /**
     * Método set para variable atendidos
     * @param atendidos
     */
    public void setAtendidos(int atendidos) 
    {
        this.atendidos = atendidos;
    }
    /**
     * Método set para variable noAtendidos
     * @param noAtendidos
     */
    public void setNoAtendidos(int noAtendidos) 
    {
        this.noAtendidos = noAtendidos;
    }
    //Método para  los tipos de prioridades recibe como parametro un tipo
    public Cliente priorizarCola(int tipo)//Tipo 1 = Caja / Tipo 2 = Plataforma
    {
        //Se crean listas para cada prioridad
        List<Cliente> prioridadAlta = new ArrayList<>();
        List<Cliente> prioridadMedia = new ArrayList<>();
        List<Cliente> prioridadBaja = new ArrayList<>();
        List<Cliente> plataforma = new ArrayList<>();
        List<Cliente> otros = new ArrayList<>();
        //Dependiendo de la Letra "prioridad" se agrega a su respectiva lista
        for (int i = 0; i < fila.size(); i++) 
        {
            if (!fila.get(i).atendido) 
            {
                switch (fila.get(i).tickete.tipo) 
                {
                    //Donde 'A' y 'C' van a la lista prioridadAlta
                    case 'A':
                    case 'C':
                        prioridadAlta.add(fila.get(i));
                        break;
                    //'B' va a la lista de prioridadMedia    
                    case 'B':
                        prioridadMedia.add(fila.get(i));
                        break;
                        //'D' va a la lista de prioridadBaja
                    case 'D':
                        prioridadBaja.add(fila.get(i));
                        break;
                        //'E' va a la lista de plataforma
                    case 'E':
                        plataforma.add(fila.get(i));
                        break;
                    default:
                        //y 'F' va la lista de otros
                        otros.add(fila.get(i));
                        break;
                }
            }
        }
        //En los sigientes "if" se atenderan en las cajas las listas según su prioridad de altas como máxima
        //hasta otros como mínima
        if (tipo == 1) //Tipo 1 "cajas"
        {
            if (prioridadAlta.size() > 0) 
            {
                Cliente cl = prioridadAlta.get(0);// para obtener siempre el primero de la
                //prioridad alta que encuentre
                prioridadAlta.get(0).atendido = true;
                Cliente nuevo = new Cliente(fila.size() + 1);
                fila.add(nuevo);
                return cl;//returna un Cliente
            } else if (prioridadMedia.size() > 0) 
            {
                Cliente cl = prioridadMedia.get(0);// para obtener siempre el primero de la 
                //prioridad mrdia que encuentre
                prioridadMedia.get(0).atendido = true;
                Cliente nuevo = new Cliente(fila.size() + 1);
                fila.add(nuevo);
                return cl;//returna un Cliente
            } else if (prioridadBaja.size() > 0) 
            {
                Cliente cl = prioridadBaja.get(0);// para obtener simepre el primero de la 
                //prioridad baja que encuentre
                prioridadBaja.get(0).atendido = true;
                Cliente nuevo = new Cliente(fila.size() + 1);
                fila.add(nuevo);
                return cl;//returna un Cliente
            } else if (otros.size() > 0) 
            {
                Cliente cl = otros.get(0);// para obtener simepre el primero de otros que encuentre
                otros.get(0).atendido = true;
                Cliente nuevo = new Cliente(fila.size() + 1);
                fila.add(nuevo);
                return cl;//returna un Cliente
            }
            return null;//Por si la lista llega a estar vacía
        //Cuando sea tipo 2 "plataforma"
        } else 
        {
            if (plataforma.size() > 0)
            {
                Cliente cl = plataforma.get(0);// para obtener simepre el primero de plataforma que encuentre
                plataforma.get(0).atendido = true;
                Cliente nuevo = new Cliente(fila.size() + 1);
                fila.add(nuevo);
                return cl;//returna un Cliente
            }
            return null;//Por si la lista llega a estar vacía
        }
    }//Fin del Método priorizarCola
    //Método para el tiempo de trabajo recibe como parámetro un int tiempoTrab 
    public void trabajar(int tiempoTrab) 
    {
        //Este while es un ciclo para saber si las cajas estan atendiendo un cliente o estan desocupadas
        while (reloj <= tiempoTrab) {
            for (int i = 0; i < listaDeTramites.size(); i++) 
            {
                //Para asignarle un tiempo a las cajas y plataforma
                listaDeTramites.get(i).reloj = reloj;
                //Cuando las cajas o plataformas  no esten atendiendo un cliente "Libre"
                if (listaDeTramites.get(i).libre) 
                {
                    listaDeTramites.get(i).tiempoInicioAtenCli = reloj;
                    //Instaof para saber si la instancia es de caja o plataforma
                    if (listaDeTramites.get(i) instanceof Cajas) 
                    {
                        Cliente cl = priorizarCola(1);//"(1) es de tipo caja"
                        if (cl != null) 
                        {
                            //Se atiende al cliente
                            listaDeTramites.get(i).atender(cl);
                            //Se van sumando los clientes atendidos
                            atendidos++;
                        } else 
                        {
                            //System.out.println("No mas clientes para caja");
                        }
                    } else 
                    {
                        Cliente cl = priorizarCola(2);//"(1) es de tipo plataforma"
                        if (cl != null) 
                        {
                            //Se van sumando los clientes atendidos
                            listaDeTramites.get(i).atender(cl);
                            //Se van sumando los clientes atendidos
                            atendidos++;
                        } else 
                        {
                            //System.out.println("No mas clientes para plataforma");
                        }
                    }
                } else//Si estan ocupadas 
                {
                    //No atender
                    listaDeTramites.get(i).atender(null);
                }
            }
            clienteSinTiempo(reloj);
            //El tiempo se va sumando
            reloj++;
        }
    }//Fin del Método trabajar
    //Método para los clientes que no tengan tiempoy se vayan recibe como parámetro int minuActual
    public void clienteSinTiempo(int minutActual) 
    {
        for (int i = 0; i < fila.size(); i++) 
        {
            if (fila.get(i).tolerancia == minutActual && !fila.get(i).atendido) 
            {
                noAtendidos++;
                fila.get(i).atendido = true;
                Cliente nuevo = new Cliente(fila.size() + 1);
                fila.add(nuevo);
            }
        }
    }//Fin del Método clienteSinTiempo
}//Fin de la Clase Banco