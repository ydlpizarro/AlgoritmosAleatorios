
public class ProfesionController {

	IPresentacion Pr;
	public ProfesionController() {
		// TODO Auto-generated constructor stub
	}
	public ProfesionController(IPresentacion pr) {
		//super();
		this.Pr = pr;
	}
public String ObtenerPresentacion() {
	String mensaje="";
	 mensaje = this.Pr.Presentar();
	return mensaje ;
	
}
}
