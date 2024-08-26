class Socio (val nombre: String, val antiguedad: Int) {
    fun imprimir() {
        println("$nombre tiene una antiguedad de $antiguedad")
    }
}

class Club {
    val socio1 = Socio("Juan", 22)
    val socio2 = Socio("Ana", 34)
    val socio3 = Socio("Carlos", 1)

    fun mayorAntiguedad() {
        socio1.imprimir()
        socio2.imprimir()
        socio3.imprimir()
        print("Socio con mayor antiguedad:")
        when {
            socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad -> print(socio1.nombre)
            socio2.antiguedad > socio3.antiguedad -> print(socio2.nombre)
            else -> print(socio3.nombre)
        }
    }
}

fun main() {
    val club1 = Club()
    club1.mayorAntiguedad()
}








