package mainAutor;

import controladorAutor.CtrlAutores;
import modeloAutores.Autor;
import modeloAutores.ConsultasAutores;
import vistaAutor.frmAutores;

public class CrudAutores {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Autor mod = new Autor();
	ConsultasAutores modC = new ConsultasAutores();
	frmAutores frm = new frmAutores();
	
	CtrlAutores ctrl = new CtrlAutores(mod,modC,frm);
	ctrl.iniciar();
	frm.setVisible(true);

	}

}
