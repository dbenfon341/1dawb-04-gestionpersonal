/*
Clase Derivada Empleado (de Persona):
Propiedades:
salarioBase(Double) (Intenta permitir también que se pueda construir un empleado con un argumento Int en esta propiedad)
porcentajeImpuestos (Double) (Intenta permitir también que se pueda construir un empleado con u nargumento Int ewn esta propiedad) (El valor por defecto es 10.0)
Métodos:
calcularSalario(): Devuelve el salarioBase aplicando los impuestos.,
toString(): Devuelve una cadena que incluye la información de Persona y detalles adicionales del Empleado
(por ejemplo, "Nombre: Julia, Edad: 24, Salario: 28213.47" con 2 posiciones decimales para el salario)
trabajar(): Retorna un mensaje que indica el empleado está trabajando. (por ejemplo, "Pablo está trabajando en la empresa".)
 */


class Empleado(nombre: String, edad: Int, var salarioBase: Double, porcentajeImpuestos: Double = 10.0) : Persona(nombre, edad) {

}