package TO;

public class Producto {

	// declaracion variables
	private String nombreProducto;
	private double precioUnitario;
	private int cantidad;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(String nombreProducto, double precioUnitario, int cantidad) {
		super();
		this.nombreProducto = nombreProducto;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
