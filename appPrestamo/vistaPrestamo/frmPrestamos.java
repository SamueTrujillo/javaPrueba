package vistaPrestamo;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class frmPrestamos extends JFrame {

	 private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    public JTextField txtCodigoPrestamo;
	    public JTextField txtCodigoFCopia;
	    public JTextField txtNombreFLibro;
	    public JTextField txtCodigoFUsuario;
	    public JTextField txtId;
	    public JButton btnGuardar;
	    public JButton btnBuscar;
	    public JButton btnLimpiar;
	    public JButton btnModificar;
	    public JButton btnEliminar;
	    public JTextField txtNombreFUsuario;
	    public JTextField txtEstado;
	    public JTextField txtFechaPrestamo;
	    public JTextField txtFechaDevolucion;

	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    frmPrestamos frame = new frmPrestamos();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }

	    public frmPrestamos() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 600, 422);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        // Agregar un JLabel
	        JLabel lblNewLabel = new JLabel("codigo prestamo");
	        lblNewLabel.setBounds(52, 45, 84, 14);
	        contentPane.add(lblNewLabel);

	        // Agregar un JTextField
	        txtCodigoPrestamo = new JTextField(10);
	        txtCodigoPrestamo.setBounds(151, 42, 86, 20);
	        contentPane.add(txtCodigoPrestamo);

	        // Agregar un JButton
	        
	        btnGuardar = new JButton("Guardar");
	        btnGuardar.setBounds(52, 300, 89, 23);
	        contentPane.add(btnGuardar);
	        
	        JLabel lblNewLabel_1 = new JLabel("codigo copia");
	        lblNewLabel_1.setBounds(52, 82, 71, 14);
	        contentPane.add(lblNewLabel_1);
	        
	        JLabel lblNewLabel_1_1 = new JLabel("nombre libro");
	        lblNewLabel_1_1.setBounds(52, 111, 84, 14);
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
	        
	        txtCodigoFCopia = new JTextField(10);
	        txtCodigoFCopia.setBounds(151, 79, 86, 20);
	        contentPane.add(txtCodigoFCopia);
	        
	        txtNombreFLibro = new JTextField(10);
	        txtNombreFLibro.setBounds(151, 111, 86, 20);
	        contentPane.add(txtNombreFLibro);
	        
	        JLabel lblNewLabel_1_1_1 = new JLabel("codigo usuario");
	        lblNewLabel_1_1_1.setBounds(52, 147, 84, 14);
	        contentPane.add(lblNewLabel_1_1_1);
	        
	        txtCodigoFUsuario = new JTextField(10);
	        txtCodigoFUsuario.setBounds(151, 144, 86, 20);
	        contentPane.add(txtCodigoFUsuario);
	        
	        btnBuscar = new JButton("Buscar");
	        btnBuscar.setBounds(310, 56, 77, 23);
	        contentPane.add(btnBuscar);
	        
	        txtId = new JTextField(10);
	        txtId.setBounds(310, 108, 86, 20);
	        contentPane.add(txtId);
	        
	        JLabel lblNewLabel_1_1_1_1 = new JLabel("Nombre usuario");
	        lblNewLabel_1_1_1_1.setBounds(52, 185, 84, 14);
	        contentPane.add(lblNewLabel_1_1_1_1);
	        
	        txtNombreFUsuario = new JTextField(10);
	        txtNombreFUsuario.setBounds(151, 182, 86, 20);
	        contentPane.add(txtNombreFUsuario);
	        
	        JLabel lblNewLabel_1_1_2 = new JLabel("estado");
	        lblNewLabel_1_1_2.setBounds(310, 163, 44, 14);
	        contentPane.add(lblNewLabel_1_1_2);
	        
	        txtEstado = new JTextField(10);
	        txtEstado.setBounds(310, 185, 86, 20);
	        contentPane.add(txtEstado);
	        
	        JLabel lblNewLabel_1_1_1_1_1 = new JLabel("fecha prestamo");
	        lblNewLabel_1_1_1_1_1.setBounds(52, 222, 84, 14);
	        contentPane.add(lblNewLabel_1_1_1_1_1);
	        
	        JLabel lblNewLabel_1_1_1_1_2 = new JLabel("fecha devolucion");
	        lblNewLabel_1_1_1_1_2.setBounds(52, 258, 84, 14);
	        contentPane.add(lblNewLabel_1_1_1_1_2);
	        
	        txtFechaPrestamo = new JTextField(10);
	        txtFechaPrestamo.setBounds(151, 219, 86, 20);
	        contentPane.add(txtFechaPrestamo);
	        
	        txtFechaDevolucion = new JTextField(10);
	        txtFechaDevolucion.setBounds(151, 255, 86, 20);
	        contentPane.add(txtFechaDevolucion);
	    }
}
