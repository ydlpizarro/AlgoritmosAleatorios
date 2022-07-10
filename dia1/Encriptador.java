package dia1;

public class Encriptador {
    public StringBuilder CodificarMensaje(String mensajeOriginal, int llave) {
        StringBuilder output = new StringBuilder();
        int valorCaracter;
        for (int index = 0; index < mensajeOriginal.length(); index++) {
            valorCaracter = mensajeOriginal.charAt(index) + 1;
            output.append((char) valorCaracter);
        }
        return output;
    }

    public StringBuilder DecodificarMensaje(String mensajeEncriptada, int llave) {
        StringBuilder output = new StringBuilder();
        int valorCaracter;
        for (int index = 0; index < mensajeEncriptada.length(); index++) {
            valorCaracter = mensajeEncriptada.charAt(index) - 1;
            output.append((char) valorCaracter);
        }
        return output;
    }
}
