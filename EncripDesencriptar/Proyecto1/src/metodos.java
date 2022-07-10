
public class metodos {

	public String Encriptar(String Texto, int llave) {

		String NuevoTexto = "";
		for (int i = 0; i < Texto.length(); i++) {
			// + String.valueOf((char)(
			// NuevoTexto+ Integer.valueOf(
			// )+ llave String.valueOf( .charAt(i)
			NuevoTexto = NuevoTexto + String.valueOf((char) (Integer.valueOf(Texto.charAt(i)) + llave));

		}
		return NuevoTexto;

	}

	public String DesEncriptar(String Texto, int llave) {

		String NuevoTexto = "";
		for (int i = 0; i < Texto.length(); i++) {
			// + String.valueOf((char)(
			// NuevoTexto+ Integer.valueOf(
			// )+ llave String.valueOf( .charAt(i)
			NuevoTexto = NuevoTexto + String.valueOf((char) (Integer.valueOf(Texto.charAt(i)) - llave));

		}
		return NuevoTexto;

	}
}
