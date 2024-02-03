# Ejercicio 04 - Gestión Personal

## Requisitos
* Clase Base Persona:
  * Propiedades:
    * nombre (String)
    * edad (Int)
  * Métodos:
    * to String(): Devuelve una cadena con información básica sobre la persona (por ejemplo, "Nombre: Julia, Edad: 24").
    * celebrarCumple(): Incrementa la edad en 1 y retorna un mensaje de felicitacion (por ejemplo, "Feliz cumpleaños Julia!, Ahora tienes 25 años.)
* Clase Derivada Gerente (de Ejmpleado):
  * Propiedades:
    * bonus (Double)
    * exentoImpuestos(Boolean) (Por defecto no estará excento de los impuestos)
    * Sobreescribir el porcentaje Impuestos para que los gerentes tengan un porcentaje de impuestos siempre del 33.99%
  * Métodos:
    * calcularSalario(): Devuelve el salarioBase más el bonus aplicando los impuestos solo al salario base o sin aplicar impuestos si excentoimpuestos es true.
    * toString(): Devuelve una cadena que incluye la información de Persona y Empleado, además de detalles específicos del Gerente.
    * administrar(): Retorna un mensaje que indica que el gerente está administrando. (por ejemplo, "Ana está administrando la empresa.")
* Uso en la función main:
  * Crea una persona, un ejmpleado y un gerente. Realizar distintas pruebas... para cada uno mostrar su información y ejecutar los métodos que tienen accesibles.
