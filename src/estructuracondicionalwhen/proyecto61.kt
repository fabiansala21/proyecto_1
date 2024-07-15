fun main(){

    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do {
        print("ingrese el peso de la piesa (0 para finalizar):")
        val peso = readln().toDouble()
        when {
            peso > 10.2 -> cant1++
            peso > 9.8 && peso <= 10.2 -> cant2++
            peso > 9.8 && peso > 0 -> cant3++
        }
    }while(peso != 0.0)
    println("piexas aptas: $cant2")
    println("piezas con un peso superior a 10.2: $cant2")
    println("piezas con un peso inferior a 9.8: $cant3")
    val suma = cant1 + cant2 +cant3
    println("cantidad de piezas procesadas: $suma")





}