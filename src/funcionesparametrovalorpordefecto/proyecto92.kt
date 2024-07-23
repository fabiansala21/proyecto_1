fun titulosubrayado (titulo: String, caracter: String = "*"){

    println("titulo")
    for (i in 1..titulo.length)
        print("caracter")
    println()


}

fun main() {
    titulosubrayado("sisema de administracion")
    titulosubrayado("ventas, ","-")
}