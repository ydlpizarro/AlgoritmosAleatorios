# AlgoritmosAleatorios

### Entrenamiento de Conceptos Básicos en Java y uso de Git Flow

## Dia 1:

### Envio de mensaje encriptado

En la historia de la humanidad, pasamos por guerras internas como externas. Para poder tener ventaja del enemigo tenemos equipos que interceptan cualquier comunicación y crean mensajes encriptadas para que el enemigo no pueda descifrar los mensajes de alta confidencialidad.

Desenvolver un programa que al recibir un texto, cada caracter sea incrementado por un valor definido (**usar tabla ASCII**) y retorne un texto encriptado. Y otro programa que cuando reciba este mensaje y el codigo de desencriptación nos entregue el mensaje inicial.


Pasando el mensaje y el valor definido (también llamado de llave de encriptación) tenemos el mensaje encriptado:
> GeneradorMensajeEncriptado(Mensaje,LLave)=MensajeEncriptado
> Ejemplo:
GeneradorMensajeEncriptado("Hola Como Estas", 1) = "Ipmb!Dpnp!Ftubt"

Caso Inverso, teniendo la mensaje encriptada y la llave de encriptación, mostremos el mensaje original
> DesencriptadorMensajes(Mensaje,LLave)=MensajeDesencriptada
> Ejemplo:
> GeneradorMensajeEncriptado("Ipmb!Dpnp!Ftubt", 1) = "Hola Como Estas"

![](https://3.bp.blogspot.com/-wH80IwdioXc/Vw2IK7BUw1I/AAAAAAAAAC0/xSfv4QYfBEgFioZzBk9Ye5JRvRnYFpkOwCLcB/s1600/Tabla-ASCII.png)