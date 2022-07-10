package dia1.EncriptarMensaje;

public class Encriptador {
    public StringBuilder CodificarMensaje(String mensajeOriginal, int llaveCodificarMensaje) {
        StringBuilder output = new StringBuilder();
        int valorCaracter;
        for (int index = 0; index < mensajeOriginal.length(); index++) {
            valorCaracter = mensajeOriginal.charAt(index) + llaveCodificarMensaje;
            output.append((char) valorCaracter);
        }
        return output;
    }

    public StringBuilder DecodificarMensaje(String mensajeEncriptada, int llaveDecodificarMensaje) {
        StringBuilder output = new StringBuilder();
        int valorCaracter;
        for (int index = 0; index < mensajeEncriptada.length(); index++) {
            valorCaracter = mensajeEncriptada.charAt(index) - llaveDecodificarMensaje;
            output.append((char) valorCaracter);
        }
        return output;
    }
}
