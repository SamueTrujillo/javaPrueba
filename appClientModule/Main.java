import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.frmProducto;
import controlador.CtrlProducto;

public class Main {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto mod = new Producto();
		ConsultasProducto modC = new ConsultasProducto();
		frmProducto frm = new frmProducto();
		
		CtrlProducto ctrl = new CtrlProducto(mod,modC,frm);
		ctrl.iniciar();
		frm.setVisible(true);
		
		
	}

	

}