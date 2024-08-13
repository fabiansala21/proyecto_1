class Triangulo1 (var lado1: Int, var lado2: Int, var lado3: Int){

    fun ladomayor(){
        print("lado mayor:")
        when{
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            print("Es un triángulo equilátero")
        else
            print("No es un triángulo equilátero")
    }
}
fun main() {
    val triangulo1 = Triangulo1(12, 45, 24)
    triangulo1.ladomayor()
    triangulo1.esEquilatero()
}

