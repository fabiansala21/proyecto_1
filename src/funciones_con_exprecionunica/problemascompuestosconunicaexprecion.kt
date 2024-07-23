/*
fun calcularPromedio(num1: Int, num2: Int, num3: Int): Double = (num1 + num2 + num3) / 3.0

fun main() {
    print("ingrese un numero:")
    val num1 = readln().toInt()
    print("ingrese un numero:")
    val num2 = readln().toInt()
    print("ingrese un numero:")
    val num3 = readln().toInt()
    val promedio = calcularPromedio(num1, num2, num3)
    println("El promedio de los números es: $promedio")
}
*/

//Elaborar una función que nos retorne el perímetro de un cuadrado pasando
//como parámetros el valor del lado.
/*
fun calcularPerimetro (lado: Int): Int = (lado * 4)
fun main() {
    print("ingrese un lado:")
    val lado = readln().toInt()
    val perimetro = calcularPerimetro(lado * 4)
    println("El perimetro es: $perimetro")


    }
 */

//Confeccionar una función que calcule la superficie de un rectángulo y la retorne,
//la función recibe como parámetros los valores de dos de sus lados:
//fun retornarSuperficie(lado1: Int,lado2: Int): Int

/*
fun retornarSuperficie(lado1: Int, lado2: Int): Int = lado1 * lado2

fun main() {
    val lado1 = 5
    val lado2 = 8
    val superficie = retornarSuperficie(lado1, lado2)
    println("La superficie del rectángulo con lados $lado1 y $lado2 es: $superficie")
}
 */

//En la función main del programa cargar los lados de dos rectángulos y luego
//mostrar cual de los dos tiene una superficie mayor.
/*
fun calcularsuperficiemayor (lado1: Int, lado2: Int) = if (lado1 > lado2) lado1 else lado2

fun main(parametro: Array<String>) {
    print("Ingrese el primer valor:")
    val lado1 =readln().toInt()
    print("Ingrese el segundo valor:")
    val lado2 =readln().toInt()
    println("El mayor entre $lado1 y $lado2 es ${calcularsuperficiemayor (lado1, lado2)}")
}

 */
//Confeccionar una función que le enviemos como parámetro un String y nos
//retorne la cantidad de caracteres que tiene. En la función main solicitar la
//carga de dos nombres por teclado y llamar a la función dos veces. Imprimir en
//la main cual de las dos palabras tiene más caracteres.
/*
fun contarCaracteres(texto: String): Int = texto.length

fun main() {
    print("Ingrese el primer nombre: ")
    val nombre1 = readLine()!!
    print("Ingrese el segundo nombre: ")
    val nombre2 = readLine()!!

    val masLargo = if (contarCaracteres(nombre1) > contarCaracteres(nombre2)) nombre1 else nombre2

    println("La palabra más larga es: $masLargo")
}



 */ 