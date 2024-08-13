class Triangulo (var lado1: Int, var lado2: Int, var lado3: Int){

    constructor():this(0,0,0){

        print("Ingrese primer lado:")
        lado1 = readln().toInt()
        print("Ingrese segundo lado:")
        lado2 = readln().toInt()
        print("Ingrese tercer lado:")
        lado3 = readln().toInt()

    }

    fun ladomayor(){
        print("lado mayor:")
        when{
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }
    fun esequilatero(){
        if (lado1 == lado2 && lado1 == lado3)
            println("es un triangulo equilatero")
        else
            println("no es un triangulo equilatero")
    }
}

fun main() {
    val triangulo = Triangulo()
    triangulo.ladomayor()
    triangulo.esequilatero()
    val triangulo2 = Triangulo(6,6,6)
    triangulo2.ladomayor()
    triangulo2.esequilatero()

}

