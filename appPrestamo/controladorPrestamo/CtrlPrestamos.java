package controladorPrestamo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modeloPrestamos.ConsultasPrestamos;
import modeloPrestamos.Prestamo;
import vistaPrestamo.frmPrestamos;



public class CtrlPrestamos implements ActionListener {
	
	private Prestamo mod;
	private ConsultasPrestamos modC;
	private frmPrestamos frm;
	
	public CtrlPrestamos (Prestamo mod, ConsultasPrestamos modC, frmPrestamos frm)
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
			mod.setCodigo_prestamo(Integer.parseInt(frm.txtCodigoPrestamo.getText()));
			mod.setCodigo_foraneo_copia(Integer.parseInt(frm.txtCodigoFCopia.getText()));
			mod.setCodigo_foraneo_usuario(Integer.parseInt(frm.txtCodigoFUsuario.getText()));
			mod.setFecha_prestamo(frm.txtFechaPrestamo.getText());
			mod.setFecha_devolucion(frm.txtFechaDevolucion.getText());
			mod.setEstado(true);
			
			
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
			
			mod.setCodigo_prestamo(Integer.parseInt(frm.txtCodigoPrestamo.getText()));
			mod.setCodigo_foraneo_copia(Integer.parseInt(frm.txtCodigoFCopia.getText()));
			mod.setCodigo_foraneo_usuario(Integer.parseInt(frm.txtCodigoFUsuario.getText()));
			mod.setFecha_prestamo(frm.txtFechaPrestamo.getText());
			mod.setFecha_devolucion(frm.txtFechaDevolucion.getText());
			mod.setEstado(false);
			
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
			mod.setCodigo_prestamo(Integer.parseInt(frm.txtId.getText()));
			
			
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
			
			mod.setCodigo_prestamo(Integer.parseInt(frm.txtCodigoPrestamo.getText()));
			
			if(modC.buscar(mod))
			{
				
				frm.txtCodigoPrestamo.setText(String.valueOf(mod.getCodigo_prestamo()));
				frm.txtCodigoFCopia.setText(String.valueOf(mod.getCodigo_foraneo_usuario()));
				frm.txtCodigoFUsuario.setText(String.valueOf(mod.getCodigo_foraneo_copia()));
				frm.txtFechaPrestamo.setText(mod.getFecha_prestamo());	
				frm.txtFechaDevolucion.setText(mod.getFecha_devolucion());
				frm.txtEstado.setText(String.valueOf(mod.isEstado()));
				
				
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
		
		frm.txtCodigoPrestamo.setText(null);
		frm.txtCodigoFCopia.setText(null);
		frm.txtCodigoFUsuario.setText(null);
		frm.txtFechaPrestamo.setText(null);
		frm.txtFechaDevolucion.setText(null);
		frm.txtEstado.setText(null);
		
			
		
	}



	
}
