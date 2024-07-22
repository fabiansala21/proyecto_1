/*
fun calcularPerimetro(lado: Double): Double {
    return 4 * lado
}

fun main() {
    print("Ingrese el valor del lado del cuadrado: ")
    val lado = readLine()?.toDoubleOrNull() ?: 0.0
    val perimetro = calcularPerimetro(lado)
    println("El perímetro del cuadrado con lado $lado es $perimetro")
}
*/

/*
fun calcularSuperficie(base: Double, altura: Double): Double {
    return base * altura
}

fun main() {
    val base = 5.0
    val altura = 3.0
    val superficie = calcularSuperficie(base, altura)
    println("La superficie del rectángulo con base $base y altura $altura es $superficie")
}

*/
/*

fun calcularSuperficie(lado1: Double, lado2: Double): Double {
    return lado1 * lado2
}

fun main() {
    print("Ingrese el valor del primer lado del primer rectángulo: ")
    val lado1Rect1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Ingrese el valor del segundo lado del primer rectángulo: ")
    val lado2Rect1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Ingrese el valor del primer lado del segundo rectángulo: ")
    val lado1Rect2 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Ingrese el valor del segundo lado del segundo rectángulo: ")
    val lado2Rect2 = readLine()?.toDoubleOrNull() ?: 0.0

    val superficieRect1 = calcularSuperficie(lado1Rect1, lado2Rect1)
    val superficieRect2 = calcularSuperficie(lado1Rect2, lado2Rect2)

    when {
        superficieRect1 > superficieRect2 -> println("El primer rectángulo tiene una superficie mayor: $superficieRect1")
        superficieRect2 > superficieRect1 -> println("El segundo rectángulo tiene una superficie mayor: $superficieRect2")
        else -> println("Ambos rectángulos tienen la misma superficie: $superficieRect1")
    }
}

 */