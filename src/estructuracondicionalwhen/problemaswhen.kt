fun main() {


    /*
    print("ingrese primer numero:")
    val num = readln().toInt()

    when {
        num <= 0 -> print("negativo")
        num >= 2 -> print("positivo")

        else -> ("nulo")

        }
*/

    /*
        var acumulador = 0

        for (i in 1..5) {
            println("Iteración $i:")
            var maxValor = Int.MIN_VALUE

            for (j in 1..3) {
                print("Introduce el valor $j: ")
                val valor = readLine()!!.toInt()
                if (valor > maxValor) {
                    maxValor = valor
                }
            }

            println("El mayor valor de esta lista es: $maxValor")
            acumulador += maxValor
        }

        println("El acumulador final es: $acumulador")
    }
*/
/*
    print("Ingrese la cantidad de triángulos a evaluar: ")
    val n = readLine()!!.toInt()
    var contadorEquilateros = 0
    var contadorIsosceles = 0
    var contadorEscalenos = 0

    for (i in 1..n) {
        println("Triángulo $i:")


        print("Ingrese el lado 1: ")
        val lado1 = readLine()!!.toDouble()
        print("Ingrese el lado 2: ")
        val lado2 = readLine()!!.toDouble()
        print("Ingrese el lado 3: ")
        val lado3 = readLine()!!.toDouble()


        if (lado1 == lado2 && lado2 == lado3) {
            println("Tipo de triángulo: Equilátero")
            contadorEquilateros++
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            println("Tipo de triángulo: Isósceles")
            contadorIsosceles++
        } else {
            println("Tipo de triángulo: Escaleno")
            contadorEscalenos++
        }
    }


    println(" Cantidad de triángulos:")
    println(" Equiláteros: $contadorEquilateros")
    println(" Isósceles: $contadorIsosceles")
    println("     Escalenos: $contadorEscalenos")
*/

    var hijos1 = 0
    var hijos2 = 0
    var hijos3 = 0
    var mas  = 0
    for (i in 1..10){

        print("ingrese la cantidad de hijos que tiene la familia: ")
        val hijos = readln().toInt()
        when(hijos){

            0 -> hijos1 ++
            1 -> hijos2 ++
            2 -> hijos3 ++
            else -> mas ++


        }

    }
    println("cantidad de hijos de la familia1: $hijos1")
    println("cantidad de hijos de la familia2: $hijos2")
    println("cantidad de hijos de la familia3: $hijos3")











}