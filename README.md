Para correr este proyecto debe levantar los microservicios siguiendo un orden determinado:

1) Correr Eureka Server
2) Correr Config Service
3) Correr Gateway Service
4) Levantar uno a uno, sin importar el orden, los servicios Chicas Superpoderosas, Bombon, Burbuja y Bellota.

En estas ultimas actualizaciones se incorporó al proyecto las dependencias de Eureka y se implemento un Gateway para que todas las llamadas a las distintas API's que componen el sistema de microservicios puedan centralizarse en el puerto 8080.


// ----- A continuación se deja una explicación breve sobre el concepto del proyecto, extraido de ramas más antiguas. Desesestimar la información no relevante (puertos y endpoints pudieron haber cambiado) ----- //

Para entender qué esperar de este repositorio, vale marcar los siguientes aspectos:

a-. El servicio CSP, que funciona en el puerto 8001, puede crear (POST) chicas superpoderosas con los atributos 'nombre' y 'color'. Por ejemplo, puede crear una chica superpoderosa llamada Alicia, de color Magenta (algo que en el dibujo animado no existe), pero tambien puede crear una chica de nombre Bellota y color Verde (tal como en la serie). En cualquier caso, los atributos son Strings, por el momento no hay lógica de validación para exigir que la creación de chicas superpoderosas deban cumplir con alguna condición específica. También puede traer (GET) a las chicas creadas (persistidas en una base de datos en memoria H2) tanto por id como por lista (se traen todas las chicas creadas).

b-. Los servicios Bombon (puerto 8004), Burbuja (puerto 8003) y Bellota (puerto 8002) son prácticamente iguales entre sí y también muy similares a CSP. La diferencia es que en lugar de nombres tienen 'versiones' (por ejemplo, al crear una Bellota lo que se debe definir no es su nombre, sino su 'version', que podría ser 'malvada', 'robot', 'hjhu4f565f' o cualquier String que se defina) y su 'tonodDeColor' (en el caso de Bellota es su 'tonoDeVerde', con comportamiento similar al de la version). Tambien aquí hay metodos GET y POST.

c-. En la integración de los microservicios mediante Feign, lo que se hizo fue dar al servicio CSP la capacidad de llamar a los metodos GET de cada uno de los otros servicios para poder traer las Bombones, Burjbujas y Bellotas creadas con lllamados realizados desde el puerto 8001.

