package mainPrestamo;

import controladorPrestamo.CtrlPrestamos;
import modeloPrestamos.ConsultasPrestamos;
import modeloPrestamos.Prestamo;
import vistaPrestamo.frmPrestamos;

public class CrudPrestamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prestamo mod = new Prestamo();
		ConsultasPrestamos modC = new ConsultasPrestamos();
		frmPrestamos frm = new frmPrestamos();
		
		CtrlPrestamos ctrl = new CtrlPrestamos(mod,modC,frm);
		ctrl.iniciar();
		frm.setVisible(true);
		// TODO Auto-generated method stub

	}

	

}
