package logicaNegocio;

import java.util.LinkedList;

public class BaseDeDatos {
    private static LinkedList<Persona> listaDePersonas = new LinkedList<>();

    /**
     * Retorna la lista de personas
     * @return this.listaDePersonas
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public static LinkedList<Persona> getListaDePersonas() {

        return listaDePersonas;
    }

    /**
     * Agrega una persona a la lista de personas
     * @param persona Persona a agregar
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public static void agregarPersona(Persona persona) {

        listaDePersonas.add(persona);
    }
}
