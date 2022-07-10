package dia1;

public class MensajeSecreta {
    public static void main(String[] args) {
        String mensajeOriginal = "Hola Como Estas";
        String mensajeEncriptada = "Ipmb!Dpnp!Ftubt";
        Encriptador encriptador = new Encriptador();
        System.out.println(encriptador.CodificarMensaje(mensajeOriginal, 1));
        System.out.println(encriptador.DecodificarMensaje(mensajeEncriptada, 1));
    }
}
