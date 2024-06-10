fun main() {
    /*
    do {
        print("ingrese un valor entre 0 y 999")
        val valor = readln().toInt()
        if (valor > 10)
            println("el valor tiene un digito")
        else
            if(valor > 100)
                println("el valor ingresado tiene dos digitos")
            else
                println("el valor ingresado tiene tres digitos")
    }while (valor != 0)
    */

    //problema 2

    /*
    var cant = 0
    var suma = 0
    do {
        print("ingrese un valor (0 para finalizar:)")
        val valor = readln().toInt()
        if (valor != 0) {
            suma += valor
            cant++
        }

    } while (valor != 0)
    if (cant != 0) {
        val promedio = suma / cant
        print("el promedio es: $promedio")
    }else{
        print("no se ingresaron valores")
*/

    var cantidad_inferior = 0 // por debajo de 9.8.
    var cantidad_superior = 0 // por debajo de 18.2
    var cantidad_adecuado = 0 // por debajo de 10.2

    do {
        print("ingrese el peso de la pieza (presione 0 para finalizar:)")
        val peso = readln().toDouble()
        if (peso > 10.2)
            cantidad_superior++

        else
            if (peso >= 9.8 && peso <= 10.2)
                cantidad_adecuado++
        else
            cantidad_inferior++

    }while (peso != 0.0)

    println("piezas aptas: $cantidad_adecuado")
    println("piezas peso superior a 10,2: $cantidad_superior")
    println("piezas peso inferior a 9.8: $cantidad_inferior")
    val suma = cantidad_adecuado + cantidad_superior + cantidad_inferior
    println("cantidad total de piezas procesadas: $suma")



}













}