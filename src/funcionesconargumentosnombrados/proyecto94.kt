fun calcularsueldo(nombre:String, costoHora: Double, cantidadHoras: Int){

    val sueldo = costoHora * cantidadHoras
    println("$nombre trabajo $cantidadHoras horas , se le pagar por hora $costoHora por lo tanto se le paga $sueldo")

}
fun main() {

    calcularsueldo("pablo", 10.5, 120)

            calcularsueldo(costoHora = 12.0, cantidadHoras = 40, nombre = "ana")
    calcularsueldo(cantidadHoras = 90 ,nombre = "luis", costoHora = 7.25)

}





