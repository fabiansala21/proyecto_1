fun presentacion(){
    println("programa que permite cargar 2 valores por teclado")
    println("efectua la suma de los valores")
    println("muestra el resultado de la suma")
    println("**************************************************")
}

fun cargarSumar() {
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es: $suma")
}
fun finalizacion() {
    println("*******************************")
    println("Gracias por utilizar este programa")
}


fun main() {
presentacion()
    cargarSumar()
    finalizacion()
}