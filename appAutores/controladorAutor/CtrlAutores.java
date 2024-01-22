package controladorAutor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modeloAutores.Autor;
import modeloAutores.ConsultasAutores;
import vistaAutor.frmAutores;


public class CtrlAutores implements ActionListener {
	
	private Autor mod;
	private ConsultasAutores modC;
	private frmAutores frm;

	public CtrlAutores (Autor mod, ConsultasAutores modC, frmAutores frm)
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
			mod.setCodigo_autor(Integer.parseInt(frm.txtCodigoAutor.getText()));
			mod.setNombres(frm.txtNombresAutor.getText());
			mod.setNacionalidad(frm.txtNacionalidad.getText());
			mod.setFecha_nacimiento(frm.txtFechaNacimiento.getText());
			
			if(modC.registrar(mod))
			{
				JOptionPane.showMessageDialog(null, "Registro Guardado");
				Limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al Guardar");
				Limpiar();
			}
		}
		
		if(e.getSource()== frm.btnModificar)
		{
			
			mod.setCodigo_autor(Integer.parseInt(frm.txtCodigoAutor.getText()));
			mod.setNombres(frm.txtNombresAutor.getText());
			mod.setNacionalidad(frm.txtNacionalidad.getText());
			mod.setFecha_nacimiento(frm.txtFechaNacimiento.getText());
			
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
			mod.setCodigo_autor(Integer.parseInt(frm.txtId.getText()));
			
			
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
			
			mod.setCodigo_autor(Integer.parseInt(frm.txtCodigoAutor.getText()));
			
			if(modC.buscar(mod))
			{
				
				frm.txtCodigoAutor.setText(String.valueOf(mod.getCodigo_autor()));
				frm.txtNombresAutor.setText(mod.getNombres());
				frm.txtNacionalidad.setText(mod.getNacionalidad());
				frm.txtFechaNacimiento.setText(mod.getFecha_nacimiento());
				
				
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
		
		frm.txtCodigoAutor.setText(null);
		frm.txtNombresAutor.setText(null);
		frm.txtNacionalidad.setText(null);
		frm.txtFechaNacimiento.setText(null);
		
			
		
	}


		
		
		
		
		
		
	


}
