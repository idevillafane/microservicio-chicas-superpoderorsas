PARA CORRER ESTE PROYECTO SE DEBE ABRIR CADA UNO DE LOS SERVICIOS COMO PROYECTO INDEPENDIENTE Y CORRERLOS. AL ESTAR BASADOS EN SPRINGBOOT LA CONEXIÓN YA ESTÁ CONFIGURADA PARA EJECUTARSE CON TOMCAT, SIN NECESIDAD DE REALIZAR AJUSTES ADICIONALES. PARA SABER QUÉ PUERTOS UTILIZAR A FIN DE PROBAR LA APLICACIÓN, CONTINUAR LEYENDO. PARA CONOCER LOS ENDPOINTS SE DEBE INGRESAR AL CÓDIGO DEL PROYECTO. POR EL MOMENTO NO SUBI DOCUMENTACION AL RESPECTO.

Para este commit se conectaron los servicios de Bombón, Burbuja y Bellota al servicio ChicasSuperPoderosas (en adelante: CSP).

Si bien funcionalmente aun tiene poco sentido -si se trata de entender el funcionamiento del sistema de microservcios en relación al contexto de la serie animada-, operativamente cumple su objetivo, el cual es mostrar un grupo de microservicios interactuando entre sí.

En este caso, el servicio CSP tiene la facultad de llamar a cada una de las chicas (Bombon, Burbuja o Bellota) gracias a la incorporación de la librería Open Feign, desarrollada en un principio por Netflix, sobre el framework de Spring, y luego adoptada por la comunidad.

Para entender qué esperar de este repositorio, vale marcar los siguientes aspectos:

a-. El servicio CSP, que funciona en el puerto 8001, puede crear (POST) chicas superpoderosas con los atributos 'nombre' y 'color'. Por ejemplo, puede crear una chica superpoderosa llamada Alicia, de color Magenta (algo que en el dibujo animado no existe), pero tambien puede crear una chica de nombre Bellota y color Verde (tal como en la serie). En cualquier caso, los atributos son Strings, por el momento no hay lógica de validación para exigir que la creación de chicas superpoderosas deban cumplir con alguna condición específica. También puede traer (GET) a las chicas creadas (persistidas en una base de datos en memoria H2) tanto por id como por lista (se traen todas las chicas creadas).

b-. Los servicios Bombon (puerto 8004), Burbuja (puerto 8003) y Bellota (puerto 8002) son prácticamente iguales entre sí y también muy similares a CSP. La diferencia es que en lugar de nombres tienen 'versiones' (por ejemplo, al crear una Bellota lo que se debe definir no es su nombre, sino su 'version', que podría ser 'malvada', 'robot', 'hjhu4f565f' o cualquier String que se defina) y su 'tonodDeColor' (en el caso de Bellota es su 'tonoDeVerde', con comportamiento similar al de la version). Tambien aquí hay metodos GET y POST.

c-. En la integración de los microservicios mediante Feign, lo que se hizo fue dar al servicio CSP la capacidad de llamar a los metodos GET de cada uno de los otros servicios para poder traer las Bombones, Burjbujas y Bellotas creadas con lllamados realizados desde el puerto 8001.

A FUTURO:

- Se agregará en esta rama la correspondiente colección de Postman para probar los distintos endpoints.
- Se creará una nueva rama en donde se integrará Eureka.
