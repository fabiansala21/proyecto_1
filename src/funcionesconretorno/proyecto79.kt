fun retornarsuperficie(lado: Int) : Int {
    val sup = lado * lado
    return sup


}

fun main() {
    print("ingrese el valor del lado del cuadro:")
    val lado = readln().toInt()
    val superficie = retornarsuperficie(lado)
    println("la superficie del cuadro es: $superficie ")



}


