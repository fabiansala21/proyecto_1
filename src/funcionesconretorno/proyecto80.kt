fun retornarmayor(v1: Int, v2: Int): Int{
    if (v1 > v2)
        return v1
    else
        return v2
}

fun main() {
    print("ingrese el primer valor")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor")
    val valor2 = readln().toInt()
    println("el mayor valor entre $valor1 y $valor2 es ${retornarmayor(valor1, valor2)}")

}



