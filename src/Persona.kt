/*
Clase Base Persona:
Propiedades:
nombre (String)
edad (Int)
Métodos:
to String(): Devuelve una cadena con información básica sobre la persona (por ejemplo, "Nombre: Julia, Edad: 24").
celebrarCumple(): Incrementa la edad en 1 y retorna un mensaje de felicitacion (por ejemplo, "Feliz cumpleaños Julia!, Ahora tienes 25 años.)
 */


open class Persona(var nombre: String, var edad: Int) {

    fun celebrarCumple(): String {
        edad++
        return "Feliz cumpleaños $nombre!, Ahora tienes $edad años."
    }

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }

}