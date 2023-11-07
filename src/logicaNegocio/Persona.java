package logicaNegocio;

/**
 * Clase Persona
 */
public class Persona {
    private String codigo;
    private String nombre;
    private String apellido;
    private String idioma;
    private boolean aceptaTerminos;
    private String genero;

    /**
     * Constructor de la clase Persona
     * @param codigo Código de la persona
     * @param nombre Nombre de la persona
     * @param apellido Apellido de la persona
     * @param idioma Idioma de la persona
     * @param aceptaTerminos Booleano que indica si acepta los términos y condiciones
     * @param genero Género de la persona
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public Persona(String codigo, String nombre, String apellido, String idioma, boolean aceptaTerminos, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idioma = idioma;
        this.aceptaTerminos = aceptaTerminos;
        this.genero = genero;
    }

    /**
     * Retorna el código de la persona
     * @return this.codigo
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Modifica el código de la persona
     * @param codigo Código de la persona
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Retorna el nombre de la persona
     * @return this.nombre
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la persona
     * @param nombre Nombre de la persona
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el apellido de la persona
     * @return this.apellido
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Modifica el apellido de la persona
     * @param apellido Apellido de la persona
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Retorna el idioma de la persona
     * @return this.idioma
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Modifica el idioma de la persona
     * @param idioma Idioma de la persona
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * Retorna el valor del atributo aceptaTerminos de la persona
     * @return this.aceptaTerminos
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public boolean isAceptaTerminos() {
        return aceptaTerminos;
    }

    /**
     * Modifica el aceptaTerminos de la persona
     * @param aceptaTerminos Booleano que indica si la persona acepta términos
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void setAceptaTerminos(boolean aceptaTerminos) {
        this.aceptaTerminos = aceptaTerminos;
    }

    /**
     * Retorna el genero de la persona
     * @return this.genero
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Modifica el genero de la persona
     * @param genero Género de la persona
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
