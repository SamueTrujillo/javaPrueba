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
			mod.setCodigo_copia(Integer.parseInt(frm.txtCodigoCopia.getText()));
			mod.setNumero_ISBN(frm.txtNumeroISBN.getText());
			mod.setCategoria(frm.txtCategoria.getText());
			//mod.set(frm.txtTelefono.getText());
			mod.setEstado(true);
			mod.setNombre_libro(frm.txtNombreLibro.getText());
			
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
			
			mod.setCodigo_copia(Integer.parseInt(frm.txtCodigoCopia.getText()));
			mod.setNumero_ISBN(frm.txtNumeroISBN.getText());
			mod.setCategoria(frm.txtCategoria.getText());
			//mod.setTelefono(frm.txtTelefono.getText());
			mod.setEstado(false);
			mod.setNombre_libro(frm.txtNombreLibro.getText());
			
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
			mod.setCodigo_copia(Integer.parseInt(frm.txtId.getText()));
			
			
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
			
			mod.setCodigo_copia(Integer.parseInt(frm.txtCodigoCopia.getText()));
			
			if(modC.buscar(mod))
			{
				
				frm.txtCodigoCopia.setText(String.valueOf(mod.getCodigo_copia()));
				frm.txtNumeroISBN.setText(mod.getNumero_ISBN());
				frm.txtCategoria.setText(mod.getCategoria());
				//frm.txtTelefono.setText(mod.getTelefono());	
				frm.txtEstado.setText(String.valueOf(mod.isEstado()));
				frm.txtNombreLibro.setText(mod.getNombre_libro());
				
				
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
		
		frm.txtCodigoCopia.setText(null);
		frm.txtNumeroISBN.setText(null);
		frm.txtCategoria.setText(null);
		//frm.txtTelefono.setText(null);
		frm.txtEstado.setText(null);
		frm.txtNombreLibro.setText(null);
		
			
		
	}


		
		
		
		
		
		
	


}
