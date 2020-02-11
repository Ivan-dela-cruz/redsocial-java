/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;

/**
 *
 * @author ivan
 */
public class Agenda {

    //atributos de la clase agenda
    private String codigo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String anotacion;
    private String telefono;
    private String telefono_casa;
    private String telefono_movil;
    private String telefono_trabajo;
    private String email;

    //constructor vacio de la clase agenda
    public Agenda() {
    }

    //constructor  con parametros para todos los atributos de la clase agenda
    public Agenda(String codigo, String nombre, String apellido, String direccion, String anotacion, String telefono, String telefono_casa, String telefono_movil, String telefono_trabajo, String email) {

        //inicializacion de los atributos internos dela clase con los valores de los parametros recibidos 
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.anotacion = anotacion;
        this.telefono = telefono;
        this.telefono_casa = telefono_casa;
        this.telefono_movil = telefono_movil;
        this.telefono_trabajo = telefono_trabajo;
        this.email = email;

    }

    //GETTERS Y SETTERS PARA CADA UNO DE LOS ATRIBUTOS DE LA CLASE
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono_casa() {
        return telefono_casa;
    }

    public void setTelefono_casa(String telefono_casa) {
        this.telefono_casa = telefono_casa;
    }

    public String getTelefono_movil() {
        return telefono_movil;
    }

    public void setTelefono_movil(String telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    public String getTelefono_trabajo() {
        return telefono_trabajo;
    }

    public void setTelefono_trabajo(String telefono_trabajo) {
        this.telefono_trabajo = telefono_trabajo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void insertarDatos(ArrayList<Agenda> list_agenda, Agenda agenda) {
        //agregamos a la lista agenda_electronica del main el nuevo objeto agenda recibido por parametro
        list_agenda.add(agenda);
    }

    public boolean actualizarDatos(ArrayList<Agenda> list_agenda, Agenda agenda, String codigo) {
        //variable par controlar que un elemnto exista en la lista
        boolean resultado = false;
        Agenda agenda_Actualizar = null;

        //recorremos la lista de registros de la agenda para buscar si existe y poder actualizar
        for (Agenda agenda_item : list_agenda) {

            //validamos qie el codigo de un item de la lista de agendas sea igual al codigo de la agenda que viene por parametro
            if (agenda_item.getCodigo().equals(codigo)) {
                //igualamos el objeto agenda con el  objeto encontrado en agenada_item
                agenda_Actualizar = agenda_item;
            }

        }

        //si existe se editaran los registros con los metodo setters caso contario devolvera un valor de falso
        if (agenda_Actualizar != null) {

            //actualizamos los campos del item encontrado con la nueva agenda
            agenda_Actualizar.setNombre(agenda.getNombre());
            agenda_Actualizar.setApellido(agenda.getApellido());
            agenda_Actualizar.setDireccion(agenda.getDireccion());
            agenda_Actualizar.setAnotacion(agenda.getAnotacion());

            agenda_Actualizar.setTelefono(agenda.getTelefono());
            agenda_Actualizar.setTelefono_casa(agenda.getTelefono_casa());
            agenda_Actualizar.setTelefono_movil(agenda.getTelefono_movil());
            agenda_Actualizar.setTelefono_trabajo(agenda.getTelefono());
            agenda_Actualizar.setEmail(agenda.getEmail());
            //devolvemos verdaro en el resultado
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

    public boolean eliminarDatos(ArrayList<Agenda> list_agenda, String codigo) {

        //variable par controlar que un elemnto exista en la lista
        boolean resultado = false;
        //declaramos una variable que contendra 
        Agenda agenda = null;

        //recorremos la lista de registros de la agenda para buscar si existe y poder eliminar
        for (Agenda agenda_item : list_agenda) {
            //validamos qie el codigo de un item de la lista de agendas sea igual al codigo de la agenda que viene por parametro
            //si existe se eliminaran los registros de la lista del metodo main caso contario devolvera un valor de falso
            if (agenda_item.getCodigo().equals(codigo)) {
                //igualamos el objeto agenda con el  objeto encontrado en agenada_item
                agenda = agenda_item;
            }
        }

        if (agenda != null) {
            list_agenda.remove(agenda);
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;

    }

    public ArrayList<Agenda> BuscarDatos(ArrayList<Agenda> list_agenda, String codigo) {
//declaramos una variable que contendra 
        ArrayList<Agenda> agenda = new ArrayList<Agenda>();

        //recorremos la lista de registros de la agenda para buscar si existe y poder eliminar
        for (Agenda agenda_item : list_agenda) {
            //validamos qie el codigo de un item de la lista de agendas sea igual al codigo de la agenda que viene por parametro
            //si existe se eliminaran los registros de la lista del metodo main caso contario devolvera un valor de falso
            if (agenda_item.getCodigo().equals(codigo)) {
                //igualamos el objeto agenda con el  objeto encontrado en agenada_item
                agenda.add(agenda_item) ;
            }
        }

        return agenda;
    }

}
