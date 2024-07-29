fun main() {

    val elementos = IntArray(8)
    for (i in elementos.indices){
        println("ingrese el valor del numero ${i + 1}:")
        elementos[i] = readln().toIntOrNull() ?: 0
    }

    var acumulado = 0
    var acumuladosmayoresa36 = 0
    var acumuladosmenoresa50 = 0

}