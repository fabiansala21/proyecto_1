fun main() {
    val arreglo1: IntArray
    arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val arreglosuma = IntArray(4)

    var verarreglo1 = "arreglo1 :"
    var verarreglo2 = "arreglo2 :"
    var verarreglosuma = "arreglosuma :"
    for (i in 0..arreglo1.size -1){
        verarreglo2 += if (i == arreglo2.lastIndex)
            arreglo2[i] else arreglo2[i].toString() + ","
        verarreglosuma+= if (i == verarreglosuma.lastIndex)
            arreglosuma[i] else arreglosuma[i].toString()
    }

    println(verarreglo1)
    println(verarreglo2)
    println(verarreglosuma)


}