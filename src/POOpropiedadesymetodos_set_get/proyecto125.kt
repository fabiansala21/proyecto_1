class Personaa{
    var nombre: String =""
        set(valor){
            field = valor.toUpperCase()
        }

        get(){

            return "("+ field +")"
        }
    var edad : Int = 0
        set(valor){
            if (valor >= 0)
                field = valor
            else
                field = 0
        }
}

fun main() {
    val personaa1 = Personaa()
    personaa1.nombre = "juan"
    personaa1.edad = 23
    println(personaa1.nombre) //se imprime (JUAN)
    println(personaa1.edad) // se imprime 23
    personaa1.edad = -50
    println(personaa1.edad) //se imprime 0

}