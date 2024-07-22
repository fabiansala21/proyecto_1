
/*
fun mostrarMensaje(mensaje: String) {
    println("*****************")
    println(mensaje)
    println("*****************")
}
fun cargarSumar() {
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readln().to
    val suma = valor1 + valor2
    println("La suma de los dos valores es: $suma")
}
fun main(parametro: Array<String>) {
    mostrarMensaje("El programa calcula la suma de dos valores
            ingresados por teclado.")
            cargarSumar()
            mmost
            */
/*
fun mostrarMayor(v1: Int, v2: Int, v3: Int) {
    print("Mayor:")
    if (v1 > v2 && v1 > v3)
        println(v1)
    else
        if (v2 > v3)
            print(v2)
        else
            print(v3)
}
fun main(parametro: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    mostrarMayor(valor1, valor2, valor3)
}
*/


/*
fun mostrarPerimetro(lado: Int) {
    val perimetro = lado * 4
    println("El perímetro es $perimetro")
}
fun mostrarSuperficie(lado: Int) {
    val superficie = lado * lado
    println("La superficie es $superficie")
}
fun main(parametro: Array<String>) {
    print("Ingrese el valor del lado de un cuadrado:")
    val la = readln().toInt()
    print("Quiere calcular el perimetro o la superficie[ingresar texto:
            perimetro/superficie]")
    var respuesta = readln()
    when (respuesta){
        "perimetro" -> mostrarPerimetro(la)
        "superficie" -> mostrarSuperficie(la)
    }
}
*/

//problemas
/*
fun main() {
    // Solicitar la clave dos veces
    println("Por favor, ingresa la clave:")
    val clave1 = leerClave()
    println("Por favor, ingresa la clave nuevamente:")
    val clave2 = leerClave()

    // Verificar si las claves son iguales o distintas
    verificarClaves(clave1, clave2)
}

fun leerClave(): CharArray {
    // Leer la entrada del usuario y convertirla a CharArray
    return readLine()?.toCharArray() ?: CharArray(0)
}

fun verificarClaves(clave1: CharArray, clave2: CharArray) {
    if (clave1.contentEquals(clave2)) {
        println("Las claves son iguales.")
    } else {
        println("Las claves son distintas.")
    }
}

//problema2

un main() {
    // Solicitar la carga de 3 enteros por teclado
    println("Ingrese el primer número entero:")
    val num1 = readLine()?.toIntOrNull() ?: 0
    println("Ingrese el segundo número entero:")
    val num2 = readLine()?.toIntOrNull() ?: 0
    println("Ingrese el tercer número entero:")
    val num3 = readLine()?.toIntOrNull() ?: 0

    // Llamar a la función para ordenar y mostrar los enteros
    mostrarOrdenados(num1, num2, num3)
}

fun mostrarOrdenados(num1: Int, num2: Int, num3: Int) {
    val numeros = intArrayOf(num1, num2, num3)
    numeros.sort()
    println("Los números ordenados de menor a mayor son: ${numeros.joinToString(", ")}")
}
*/




