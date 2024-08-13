class operaciones {
    var valor1: Int = 0
    var valor2: Int = 0

   fun cargar(){

       print("ingrese el primer valor")
       valor1 = readln().toInt()
       print("ingrese el segundo valor")
       valor2 = readln().toInt()
       sumar()
       restar()
    }

    fun sumar() {
        val suma = valor1 + valor2
        println("\"La suma de $valor1 y $valor2 es $suma")
    }
    fun restar() {
        val resta = valor1 - valor2
        println("La resta de $valor1 y $valor2 es $resta")
    }
}
fun main(parametro: Array<String>) {
    val operaciones1 = operaciones()
    operaciones1.cargar()
}