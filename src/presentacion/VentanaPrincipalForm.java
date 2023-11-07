package presentacion;

import logicaNegocio.BaseDeDatos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase para la Venta Principal de la aplicación.
 */
public class VentanaPrincipalForm extends JFrame {
    private JPanel pnlPrincipal;
    private BaseDeDatos baseDeDatos;

    /**
     * Método que inicializa el menú con las opciones para el usuario.
     *
     * Complejidad temporal: O(1) Complejidad Constante.
     */
    private void inicializarMenu() {
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu personaMenu = new JMenu("Persona");
        menuBar.add(personaMenu);

        JMenuItem ingresarPersonaItem = new JMenuItem("Ingresar Persona");
        personaMenu.add(ingresarPersonaItem);

        JMenuItem consultarPersonasItem = new JMenuItem("Consultar Personas");
        personaMenu.add(consultarPersonasItem);

        ingresarPersonaItem.addActionListener(new ActionListener() {
            @Override
            /**
             * Evento click en el menú "Ingresar Persona".
             *
             * Complejidad temporal: O(1) Complejidad Constante.
             */
            public void actionPerformed(ActionEvent e) {
                IngresarPersonaForm ingresarPersonaForm = new IngresarPersonaForm(baseDeDatos);
            }
        });

        consultarPersonasItem.addActionListener(new ActionListener() {
            @Override
            /**
             * Evento click en el menú "Consultar Personas".
             *
             * Complejidad temporal: O(1) Complejidad Constante.
             */
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(consultarPersonasItem, "Opción seleccionada: Consultar Personas");
                ConsultarPersonasForm consultarPersonasForm = new ConsultarPersonasForm(baseDeDatos);
            }
        });
    }

    /**
     * Constructor de la clase EjemploGridLayout
     *
     * Complejidad Temporal: O(1) Tiempo Constante.
     */
    public VentanaPrincipalForm() {
        this.baseDeDatos = new BaseDeDatos();


        this.inicializarMenu();

        // Obtener el tamaño de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Asignar el tamaño de la ventana (JFrame actual) con tamaño de la pantalla
        this.setSize(screenSize);

        // Elimina el proceso cuando se cierra la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Se asigna el panel principal al JFrame
        this.setContentPane(pnlPrincipal);


        // No se permite redimensionar la ventana
        this.setResizable(false);
        // Se muestra la ventana como visible
        this.setVisible(true);
    }
}
