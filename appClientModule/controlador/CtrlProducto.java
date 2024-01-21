package controlador;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JOptionPane;

import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.frmProducto;

public class CtrlProducto  implements ActionListener {
	
	private Producto mod;
	private ConsultasProducto modC;
	private frmProducto frm;
	
	public CtrlProducto (Producto mod, ConsultasProducto modC, frmProducto frm)
	{
		
		this.mod = mod;
		this.modC = modC;
		this.frm = frm;
		this.frm.btnGuardar.addActionListener(this);
		this.frm.btnModificar.addActionListener(this);
		this.frm.btnEliminar.addActionListener(this);
		this.frm.btnLimpiar.addActionListener(this);
		this.frm.btnBuscar.addActionListener(this);
	}
	
	
	public void iniciar () {
		
		frm.setTitle("Biblioteca");
		frm.setLocationRelativeTo(null);
		frm.txtId.setVisible(false);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== frm.btnGuardar)
		{
			mod.setCodigo_usuario(Integer.parseInt(frm.txtCodigoUsuario.getText()));
			mod.setNombres(frm.txtNombres.getText());
			mod.setFecha_nacimiento(frm.txtFechaNacimiento.getText());
			mod.setTelefono(frm.txtTelefono.getText());
			mod.setEstado(true);
			
			if(modC.registrar(mod))
			{
				JOptionPane.showMessageDialog(null, "Registro Guardado");
				Limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Eroor al Guardar");
				Limpiar();
			}
		}
		
		if(e.getSource()== frm.btnModificar)
		{
			
			mod.setCodigo_usuario(Integer.parseInt(frm.txtCodigoUsuario.getText()));
			mod.setNombres(frm.txtNombres.getText());
			mod.setFecha_nacimiento(frm.txtFechaNacimiento.getText());
			mod.setTelefono(frm.txtTelefono.getText());
			mod.setEstado(true);
			
			if(modC.modificar(mod))
			{
				JOptionPane.showMessageDialog(null, "Registro Modificado");
				Limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al Modificar");
				Limpiar();
			}
		}
		
		if(e.getSource()== frm.btnEliminar)
		{
			mod.setId(Integer.parseInt(frm.txtId.getText()));
			
			
			if(modC.eliminar(mod))
			{
				JOptionPane.showMessageDialog(null, "Registro Eliminado");
				Limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al Eliminar");
				Limpiar();
			}
		}
		
		
		if(e.getSource()== frm.btnBuscar)
		{
			
			mod.setCodigo_usuario(Integer.parseInt(frm.txtCodigoUsuario.getText()));
			
			if(modC.buscar(mod))
			{
				frm.txtId.setText(String.valueOf(mod.getId()));
				frm.txtCodigoUsuario.setText(String.valueOf(mod.getCodigo_usuario()));
				frm.txtNombres.setText(mod.getNombres());
				frm.txtFechaNacimiento.setText(mod.getFecha_nacimiento());
				frm.txtTelefono.setText(mod.getTelefono());			
				
				
			} else {
				JOptionPane.showMessageDialog(null, "No se encontro el registro");
				Limpiar();
			}
		}
		
		if(e.getSource()== frm.btnLimpiar)
		{
			Limpiar();
		}

		
		


		
	}
	
	public void Limpiar ()
	{
		frm.txtId.setText(null);
		frm.txtCodigoUsuario.setText(null);
		frm.txtNombres.setText(null);
		frm.txtFechaNacimiento.setText(null);
		frm.txtTelefono.setText(null);
		frm.txtEstado.setText(null);
		
			
		
	}




}
