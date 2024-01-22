package vistaAutor;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class frmAutores extends JFrame {


    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public JTextField txtCodigoAutor;
    public JTextField txtNombresAutor;
    public JTextField txtNacionalidad;
    public JTextField txtFechaNacimiento;
    public JTextField txtId;
    public JButton btnGuardar;
    public JButton btnBuscar;
    public JButton btnLimpiar;
    public JButton btnModificar;
    public JButton btnEliminar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmAutores frame = new frmAutores();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frmAutores() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 422);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Agregar un JLabel
        JLabel lblNewLabel = new JLabel("Codigo autor");
        lblNewLabel.setBounds(52, 45, 84, 14);
        contentPane.add(lblNewLabel);

        // Agregar un JTextField
        txtCodigoAutor = new JTextField(10);
        txtCodigoAutor.setBounds(151, 42, 86, 20);
        contentPane.add(txtCodigoAutor);

        // Agregar un JButton
        
        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(52, 300, 89, 23);
        contentPane.add(btnGuardar);
        
        JLabel lblNewLabel_1 = new JLabel("Nombres");
        lblNewLabel_1.setBounds(52, 108, 71, 14);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Nacionalidad");
        lblNewLabel_1_1.setBounds(52, 165, 84, 14);
        contentPane.add(lblNewLabel_1_1);
        
        btnModificar = new JButton("Modificar");
        btnModificar.setBounds(151, 300, 85, 23);
        contentPane.add(btnModificar);
        
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(246, 300, 77, 23);
        contentPane.add(btnEliminar);
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(333, 300, 84, 23);
        contentPane.add(btnLimpiar);
        
        txtNombresAutor = new JTextField(10);
        txtNombresAutor.setBounds(151, 105, 86, 20);
        contentPane.add(txtNombresAutor);
        
        txtNacionalidad = new JTextField(10);
        txtNacionalidad.setBounds(151, 162, 86, 20);
        contentPane.add(txtNacionalidad);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Fecha nacimiento");
        lblNewLabel_1_1_1.setBounds(52, 228, 84, 14);
        contentPane.add(lblNewLabel_1_1_1);
        
        txtFechaNacimiento = new JTextField(10);
        txtFechaNacimiento.setBounds(151, 225, 86, 20);
        contentPane.add(txtFechaNacimiento);
        
        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(310, 56, 77, 23);
        contentPane.add(btnBuscar);
        
        txtId = new JTextField(10);
        txtId.setBounds(310, 108, 86, 20);
        contentPane.add(txtId);
    }
}
