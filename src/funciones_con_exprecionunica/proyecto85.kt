fun retornarSupericie(lado: Int)= lado*lado

fun main() {
    print("ingrese el valor de el lado del cuadrado")
    val  lado = readln().toInt()
    println("la superficie del cuadrado es ${retornarsuperficie(lado)}")
}