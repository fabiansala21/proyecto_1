fun calcularMayor(num1: Int, num2: Int, num3: Int, num4: Int, num5: Int): Int {
    return maxOf(num1, num2, num3, num4, num5)
}

fun main() {
    print("Ingrese el primer valor:")
    val num1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val num2 = readln().toInt()
    print("Ingrese el tercer valor:")
    val num3 = readln().toInt()
    print("Ingrese el cuarto valor:")
    val num4 = readln().toInt()
    print("Ingrese el quinto valor:")
    val num5 = readln().toInt()
    println("El mayor entre $num1, $num2, $num3, $num4 y $num5 es ${calcularMayor(num1, num2, num3, num4, num5)}")
}