package vistaLibro;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frmLibros extends JFrame {
	

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public JTextField txtCodigoCopia;
    public JTextField txtNumeroISBN;
    public JTextField txtCategoria;
    public JTextField txtForaneoAutor;
    public JTextField txtEstado;
    public JTextField txtId;
    public JButton btnGuardar;
    public JButton btnBuscar;
    public JButton btnLimpiar;
    public JButton btnModificar;
    public JButton btnEliminar;
    public JTextField txtNombreLibro;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmLibros frame = new frmLibros();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frmLibros() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 422);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Agregar un JLabel
        JLabel lblNewLabel = new JLabel("codigo copia");
        lblNewLabel.setBounds(52, 45, 84, 14);
        contentPane.add(lblNewLabel);

        // Agregar un JTextField
        txtCodigoCopia = new JTextField(10);
        txtCodigoCopia.setBounds(151, 42, 86, 20);
        contentPane.add(txtCodigoCopia);

        // Agregar un JButton
        
        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(52, 300, 89, 23);
        contentPane.add(btnGuardar);
        
        JLabel lblNewLabel_1 = new JLabel("numero ISBN");
        lblNewLabel_1.setBounds(52, 82, 71, 14);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Categoria");
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
        
        txtNumeroISBN = new JTextField(10);
        txtNumeroISBN.setBounds(151, 79, 86, 20);
        contentPane.add(txtNumeroISBN);
        
        txtCategoria = new JTextField(10);
        txtCategoria.setBounds(151, 111, 86, 20);
        contentPane.add(txtCategoria);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Autor");
        lblNewLabel_1_1_1.setBounds(52, 147, 44, 14);
        contentPane.add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_1_1_2 = new JLabel("estado");
        lblNewLabel_1_1_2.setBounds(52, 216, 44, 14);
        contentPane.add(lblNewLabel_1_1_2);
        
        txtForaneoAutor = new JTextField(10);
        txtForaneoAutor.setBounds(151, 144, 86, 20);
        contentPane.add(txtForaneoAutor);
        
        txtEstado = new JTextField(10);
        txtEstado.setBounds(151, 213, 86, 20);
        contentPane.add(txtEstado);
        
        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(310, 56, 77, 23);
        contentPane.add(btnBuscar);
        
        txtId = new JTextField(10);
        txtId.setBounds(310, 108, 86, 20);
        contentPane.add(txtId);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("Nombre libro");
        lblNewLabel_1_1_1_1.setBounds(52, 185, 71, 14);
        contentPane.add(lblNewLabel_1_1_1_1);
        
        txtNombreLibro = new JTextField(10);
        txtNombreLibro.setBounds(151, 182, 86, 20);
        contentPane.add(txtNombreLibro);
    }
}


