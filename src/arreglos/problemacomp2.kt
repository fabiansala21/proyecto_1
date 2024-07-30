fun main() {
    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val resultado = IntArray(4)


    println("Ingrese los 4 elementos para el primer arreglo:")
    for (i in arreglo1.indices) {
        print("Elemento ${i + 1}: ")
        arreglo1[i] = readLine()?.toIntOrNull() ?: 0
    }


    println("Ingrese los 4 elementos para el segundo arreglo:")
    for (i in arreglo2.indices) {
        print("Elemento ${i + 1}: ")
        arreglo2[i] = readLine()?.toIntOrNull() ?: 0
    }


    for (i in resultado.indices) {
        resultado[i] = arreglo1[i] + arreglo2[i]
    }


    println("El resultado de la suma de los dos arreglos es:")
    for (i in resultado.indices) {
        println("Elemento ${i + 1}: ${resultado[i]}")
    }
}