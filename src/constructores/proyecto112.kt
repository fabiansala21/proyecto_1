class persona constructor(nombre: String, edad: Int){
    var nombre: String = nombre
    var edad: Int = edad

    init {
        if (edad < 0)
            this.edad = 0
    }


    fun imprimir(){
        println("nombre: $nombre y tiene una edad de $edad")
    }


    fun esmayoredad(){
        if (edad >= 18)
            println("es mayor de edad")
        else
            println("no es mayor de edad")
    }
}

fun main() {
    val persona1 = persona("Juan", 12)
    persona1.imprimir()
    persona1.esmayoredad()
}


