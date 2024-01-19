package Vista;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frmProducto extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public JTextField txtCodigoUsuario;
    public JTextField txtNombres;
    public JTextField txtFechaNacimiento;
    public JTextField txtTelefono;
    public JTextField txtEstado;
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
                    frmProducto frame = new frmProducto();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frmProducto() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 422);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Agregar un JLabel
        JLabel lblNewLabel = new JLabel("codigo usuario");
        lblNewLabel.setBounds(70, 60, 84, 14);
        contentPane.add(lblNewLabel);

        // Agregar un JTextField
        txtCodigoUsuario = new JTextField(10);
        txtCodigoUsuario.setBounds(164, 57, 86, 20);
        contentPane.add(txtCodigoUsuario);

        // Agregar un JButton
        
        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(52, 300, 89, 23);
        contentPane.add(btnGuardar);
        
        JLabel lblNewLabel_1 = new JLabel("nombres");
        lblNewLabel_1.setBounds(70, 111, 44, 14);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("fecha nacimiento");
        lblNewLabel_1_1.setBounds(70, 159, 84, 14);
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
        
        txtNombres = new JTextField(10);
        txtNombres.setBounds(164, 108, 86, 20);
        contentPane.add(txtNombres);
        
        txtFechaNacimiento = new JTextField(10);
        txtFechaNacimiento.setBounds(164, 156, 86, 20);
        contentPane.add(txtFechaNacimiento);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("telefono");
        lblNewLabel_1_1_1.setBounds(70, 201, 44, 14);
        contentPane.add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_1_1_2 = new JLabel("estado");
        lblNewLabel_1_1_2.setBounds(70, 237, 44, 14);
        contentPane.add(lblNewLabel_1_1_2);
        
        txtTelefono = new JTextField(10);
        txtTelefono.setBounds(164, 198, 86, 20);
        contentPane.add(txtTelefono);
        
        txtEstado = new JTextField(10);
        txtEstado.setBounds(164, 234, 86, 20);
        contentPane.add(txtEstado);
        
        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(310, 56, 77, 23);
        contentPane.add(btnBuscar);
        
        txtId = new JTextField(10);
        txtId.setBounds(310, 108, 86, 20);
        contentPane.add(txtId);
    }
}


