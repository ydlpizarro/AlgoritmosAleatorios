
public class Abogado implements IPresentacion {

	// Declarar variables
	private String nomProfesion;
	private double sueldo;
	private int numClientes;

	public Abogado() {
		// TODO Auto-generated constructor stub
	}
	
	public Abogado(String nomProfesion, double sueldo, int numClientes) {
		
		this.nomProfesion = nomProfesion;
		this.sueldo = sueldo;
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

	public int getNumClientes() {
		return numClientes;
	}

	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}

	@Override
	public String Presentar() {
		// TODO Auto-generated method stub
		String Contenido = "Hola como están soy " + getNomProfesion() + ". Ya defendí a " + getNumClientes()
				+ " de ir injustamente a la cárcel. Atualmente gano " + getSueldo()
				+ " soles y si necesitan de mis servicios, aqui está mi tarjeta.";

		return Contenido;

	}
}
