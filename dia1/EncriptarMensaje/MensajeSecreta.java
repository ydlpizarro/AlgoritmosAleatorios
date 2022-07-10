package dia1.EncriptarMensaje;

public class MensajeSecreta {
    public static void main(String[] args) {
        String mensajeOriginal = "Hola Como Estas";
        String mensajeEncriptada = "Ipmb!Dpnp!Ftubt";

        int llaveCodificar = 1;
        int llaveDecodificar = 1;

        Encriptador encriptador = new Encriptador();

        System.out.println(encriptador.CodificarMensaje(mensajeOriginal, llaveCodificar));
        System.out.println(encriptador.DecodificarMensaje(mensajeEncriptada, llaveDecodificar));
    }
}
