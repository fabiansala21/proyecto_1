package estructuracondicionalwhen

fun main() {

    print("ingrese la cordenada x del punto:")
    val x = readln().toInt()
    print("ingrese la coordenada y del punto:")
    val y = readln().toInt()
    when {
        x > 0 && y > 0 -> println("primer cuadrante")
        x < 0 && y > 0 -> println("segundo cuadrante")
        x < 0 && y < 0 -> println("tercero cuadrante")
        x > 0 && y < 0 -> println("cuarto cuadrante")
        else -> println("el punto se encuentra en un eje")
    }






}