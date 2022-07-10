import javax.swing.JOptionPane;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = JOptionPane.showInputDialog("Ingrese una profesion");

		// Llamar metodo mostrar presentacion
		MostrarPresentacion(cadena);
	}

	public static void MostrarPresentacion(String tipo) {
		try {
			String mensaje = "";
			ProfesionController oProfesionController = new ProfesionController();
			switch (tipo) {
			case "Abogado":
				Abogado oAbogado = new Abogado();
				oAbogado.setNomProfesion(tipo);
				oAbogado.setNumClientes(5);
				oAbogado.setSueldo(450.50);

				oProfesionController = new ProfesionController(oAbogado);
				mensaje = oProfesionController.ObtenerPresentacion();

				break;
			case "Medico":
				Medico oMedico = new Medico();

				oMedico.setNomProfesion(tipo);
				oMedico.setNomEspecializacion("Odontologia");
				oMedico.setNumClientes(7);
				oMedico.setSueldo(350.50);

				oProfesionController = new ProfesionController(oMedico);
				mensaje = oProfesionController.ObtenerPresentacion();
				break;
			case "Ingeniero":
				Ingeniero oIngeniero = new Ingeniero();
				oIngeniero.setNomProfesion(tipo);
				oIngeniero.setNumEdificios(6);
				oIngeniero.setSueldo(650.50);
				oIngeniero.setBono(100);
				oIngeniero.setAniosLabor(7);

				oProfesionController = new ProfesionController(oIngeniero);
				mensaje = oProfesionController.ObtenerPresentacion();
				break;
			default:
				if (tipo.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ingrese una profesion");
				} else {
					JOptionPane.showMessageDialog(null, "No se cuenta con informacion de dicha profesion");
				}
				break;
			}
			;
			if (!tipo.isEmpty() && (tipo.equals("Medico") || tipo.equals("Abogado") || tipo.equals("Ingeniero"))) {
				JOptionPane.showMessageDialog(null, mensaje);
			}
		} catch (Exception ex) {
			throw ex;
		}

	}
}
