class Persona{
    var nombre: String = ""
    var edad: Int = 0
    fun inicializar(nombre: String, edad: Int){
        this.nombre = nombre
        this.edad = edad
    }

    fun imprimir(){
        println("nombre: $nombre y tiene una edade de $edad")
    }
    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}
fun main(parametro: Array<String>) {

    val persona1: Persona
    persona1 = Persona()
    persona1.inicializar("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()

    val persona2: Persona
    persona2 = Persona()
    persona2.inicializar("Ana", 50)
    persona2.imprimir()
    persona2.esMayorEdad()
}




