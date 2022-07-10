
public class Ingeniero implements IPresentacion {
	// declaracion de variables
	private String nomProfesion;
	private double sueldo;
	private int aniosLabor;
	private int numEdificios;
	private int bono;

	public Ingeniero() {
		// TODO Auto-generated constructor stub
	}

	public Ingeniero(String nomProfesion, double sueldo, int aniosLabor, int numEdificios, int bono) {
		
		this.nomProfesion = nomProfesion;
		this.sueldo = sueldo;
		this.aniosLabor = aniosLabor;
		this.numEdificios = numEdificios;
		this.bono = bono;
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

	public int getBono() {
		return bono;
	}

	public void setBono(int bono) {
		this.bono = bono;
	}

	public int getNumEdificios() {
		return numEdificios;
	}

	public void setNumEdificios(int numEdificios) {
		this.numEdificios = numEdificios;
	}

	public int getAniosLabor() {
		return aniosLabor;
	}

	public void setAniosLabor(int aniosLabor) {
		this.aniosLabor = aniosLabor;
	}

	@Override
	public String Presentar() {
		// TODO Auto-generated method stub
		String Contenido = "Soy " + getNomProfesion() + ". tengo " + getAniosLabor()
				+ " años trabajando en la parte de construcción y tengo " + getNumEdificios()
				+ " edificios construido en la constructora que trabajo. Mi sueldo es " + getSueldo()
				+ " soles y gano bonos " + getBono() + " soles.";
		return Contenido;
	}
}
