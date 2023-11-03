package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase IngresarPersonaForm.
 * Hereda de JFrame y utiliza el layout GridLayout (Por defecto en IntelliJ).
 */
public class IngresarPersonaForm extends JFrame {
    private JPanel pnlPrincipal;
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JButton btnGuardar;
    private JLabel lblCodigo;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblIdioma;
    private JComboBox cmbIdioma;
    private JCheckBox chbTerminos;
    private JLabel lblGenero;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtFemenino;
    private JRadioButton rbtOtro;
    private JRadioButton rbtNoIndicado;

    private String getGenero() {
        return (rbtMasculino.isSelected()) ? "Masculino" :
                (rbtFemenino.isSelected()) ? "Femenino" :
                        (rbtOtro.isSelected()) ? "Otro" :
                                (rbtNoIndicado.isSelected()) ? "Prefiero no decir" :
                                        "No indicado";
    }

    /**
     * Constructor de la clase EjemploGridLayout
     *
     * Complejidad Temporal: O(1) Tiempo Constante.
     */
    public IngresarPersonaForm() {
        // Elimina el proceso cuando se cierra la ventana
        // this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Se asigna el panel principal al JFrame
        this.setContentPane(pnlPrincipal);
        // Se asigna el tamaño por defecto
        this.setSize(500, 300);
        // Se asigna la posición por defecto
        this.setLocation(100, 100);
        // No se permite redimensionar la ventana
        this.setResizable(false);
        // Se muestra la ventana como visible
        this.setVisible(true);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            /**
             * Evento click del botón btnGuardar
             *
             * Complejidad Temporal: O(1) Tiempo Constante.
             */
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma = cmbIdioma.getSelectedItem().toString();
                String aceptaTerminos = (chbTerminos.isSelected() == true) ? "Sí" : "No";
                String genero = getGenero();

                String mensaje = "Tus datos son: \n" +
                                 "Código: " + codigo + "\n" +
                                 "Nombre: " + nombre + "\n" +
                                 "Apellido: " + apellido + "\n" +
                                 "Idioma:" + idioma + "\n" +
                                 "Género: " + genero + "\n" +
                                 "Acepta términos y condiciones: " + aceptaTerminos;

                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}
