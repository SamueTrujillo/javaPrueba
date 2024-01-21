package mainLibro;

import controladorLibro.CtrlLibros;
import modeloLibros.ConsultasLibros;
import modeloLibros.Libro;
import vistaLibro.frmLibros;

public class CrudLibro {



	public static void main(String[] args) {
		Libro mod = new Libro();
		ConsultasLibros modC = new ConsultasLibros();
		frmLibros frm = new frmLibros();
		
		CtrlLibros ctrl = new CtrlLibros(mod,modC,frm);
		ctrl.iniciar();
		frm.setVisible(true);
		// TODO Auto-generated method stub

	}

}
