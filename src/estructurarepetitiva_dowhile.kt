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
    /*
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
*/
    /*
    var sum = 0
    var input: Int

    do {
        println("ingrese un valor (9999 para finalizar)")
        input = readln().toInt()
        if (input != 9999)
            sum += input // += = suma
    }while (input != 9999)

    println("valor acomulado: $sum")
    if (sum > 0)
        println("el valor acomulado es mayor a 0")
    else
        if (sum < 0)
            println("el valor acomulado es menor a 0")
    else
        println("el valor es 0")
*/
    var suma = 0
    do {
        print("numero de cuenta:")
        val valor1 = readln().toInt()
        if (valor1 >= 0) {
            println("digite su saldo:")
            val valor2 = readln().toInt()
            if (valor2 > 0) {
                println("acreedor")
                suma = suma + valor2
            } else {
                if (valor2 < 0)
                    println("deudor")
            }
        }else{
            println("nulo")
        }
    }while (valor1 >= 0)
    println("acreedores en total: $suma")





}















