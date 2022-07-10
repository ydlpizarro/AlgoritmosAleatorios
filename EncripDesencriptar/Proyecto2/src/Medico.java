
public class Medico implements IPresentacion {

	private String nomProfesion;
	private double sueldo;
	private String nomEspecializacion;
	private int numClientes;

	public Medico() {
		// TODO Auto-generated constructor stub
	}

	public Medico(String nomProfesion, double sueldo, String nomEspecializacion, int numClientes) {
		
		this.nomProfesion = nomProfesion;
		this.sueldo = sueldo;
		this.nomEspecializacion = nomEspecializacion;
		this.numClientes = numClientes;
	}

	public String getNomProfesion() {
		return nomProfesion;
	}

	public void setNomProfesion(String nomProfesion) {
		this.nomProfesion = nomProfesion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNomEspecializacion() {
		return nomEspecializacion;
	}

	public void setNomEspecializacion(String nomEspecializacion) {
		this.nomEspecializacion = nomEspecializacion;
	}

	public int getNumClientes() {
		return numClientes;
	}

	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}

	@Override
	public String Presentar() {
		// TODO Auto-generated method stub
		String Contenido = "Resumidamente, soy " + getNomProfesion() + " especializado en " + getNomEspecializacion()
				+ " . En pandemia salvé mas de  " + getNumClientes() + " personas y actualmente gano " + getSueldo()
				+ " soles.";

		return Contenido;
	}

}
