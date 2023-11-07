package logicaNegocio;

import java.util.LinkedList;

public class BaseDeDatos {
    private LinkedList<Persona> listaDePersonas;

    /**
     * Constructor de la clase ListaDePersonas
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public BaseDeDatos() {
        this.listaDePersonas = new LinkedList<>();
    }

    /**
     * Retorna la lista de personas
     * @return this.listaDePersonas
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public LinkedList<Persona> getListaDePersonas() {
        return listaDePersonas;
    }

    /**
     * Agrega una persona a la lista de personas
     * @param persona Persona a agregar
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void agregarPersona(Persona persona) {
        this.listaDePersonas.add(persona);
    }
}
