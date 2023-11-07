package presentacion;

import logicaNegocio.BaseDeDatos;
import logicaNegocio.Persona;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Clase para la ventana de Consultar Personas
 */
public class ConsultarPersonasForm extends JFrame {
    private JPanel pnlPrincipal;
    private JLabel lblMensaje;


    private BaseDeDatos baseDeDatos;

    /**
     * Constructor de la clase ConsultarPersonasForm
     * @param baseDeDatos Objeto que contiene los datos de las personas de la aplicación
     *
     * Complejidad Temporal: O(1) Complejidad Constante.
     */
    public ConsultarPersonasForm(BaseDeDatos baseDeDatos) {
        // Elimina el proceso cuando se cierra la ventana
        // this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Se asigna el panel principal al JFrame
        this.setContentPane(pnlPrincipal);
        // Se asigna el tamaño por defecto
        this.setSize(600, 500);
        // Se asigna la posición por defecto
        this.setLocation(100, 100);
        // No se permite redimensionar la ventana
        this.setResizable(true);
        // Se muestra la ventana como visible
        this.setVisible(true);


        this.baseDeDatos = baseDeDatos;

        if (this.baseDeDatos.getListaDePersonas().size() == 0) {
            this.lblMensaje.setText("No hay personas registradas");
        } else {
            this.lblMensaje.setText("Lista de personas registradas:");
            this.mostrarDatosPersonas();
        }
    }

    /**
     * Método para mostrar los datos de las personas en una tabla
     *
     * Complejidad Temporal: O(N) Complejidad Lineal.
     */
    public void mostrarDatosPersonas() {
        String[] nombresDeColumnas = {"Código", "Nombre", "Apellido", "Idioma", "Acepta Términos", "Género"};

        // Crear un DefaultTableModel con columnas
        DefaultTableModel modelo = new DefaultTableModel();

        // Agregar columnas
        for(String nombreDeColumna : nombresDeColumnas) {
            modelo.addColumn(nombreDeColumna);
        }
        // Agregar filas
        for(Persona persona : baseDeDatos.getListaDePersonas()) {
            modelo.addRow(new Object[]{persona.getCodigo(), persona.getNombre(), persona.getApellido(), persona.getIdioma(), persona.isAceptaTerminos(), persona.getGenero()});
        }

        // Crear la JTable con el modelo
        JTable table = new JTable(modelo);

        // Agregar la JTable a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(500, 300);

        // Agregar el JScrollPane al JFrame
        this.add(scrollPane);
    }
}
