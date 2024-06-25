package estructura_repetitiva_for

fun main(){
    var suma = 0

    for (index in 1 .. 10){
        print("ingrese el valor $index:")
        val valor = readln().toInt()
        suma += valor
    }
            println("la suma de os valores ingresados es $suma")
    val promedio = suma / 10
    println("su peomedio es $promedio")




}
