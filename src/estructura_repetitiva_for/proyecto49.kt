package estructura_repetitiva_for

fun main() {
    var aprobados = 0
    var reprobados = 0
    for (index in 1..10) {
        print("ingrese nota $index")

        val nota = readln().toInt()
        if (nota >= 7) {

            aprobados++
    } else {
        reprobados++
    }

}

    println("cantidad de alumnos con totas mayores")
    "iguales a 7: $aprobados"
    println("cantidad de alumnos con totas menores")
    "a 7: $reprobados"
}