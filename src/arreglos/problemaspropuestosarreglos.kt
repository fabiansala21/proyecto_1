fun main() {

    val elementos = IntArray(8)
    for (i in elementos.indices){
        println("ingrese el valor del numero ${i + 1}:")
        elementos[i] = readln().toIntOrNull() ?: 0
    }

    var acumulado = 0
    var acumuladosmayoresa36 = 0
    var acumuladosmenoresa50 = 0

    for (num in elementos){
        acumulado += num
        if (num >= 36 ){
            acumuladosmayoresa36 += num
            if (num >= 50){
                acumuladosmenoresa50++

            }
        }
    }
    println("valor de todos los numero: $acumulado")
    println("valor de todos los numero mayores a 36: $acumuladosmayoresa36")
    println("valor de todos los numero mayores a 50: $acumuladosmenoresa50")



}