/*Implementar una clase llamada Alumno que tenga como propiedades su
nombre y su nota. Definir los métodos para inicializar sus propiedades por
teclado, imprimirlos y mostrar un mensaje si está regular (nota mayor o igual a
4)
Definir dos objetos de la clase Alumno
 */

class alumno{
    var nombre: String = ""
    var nota: Int = 0
    fun inicializar(nombre: String, nota: Int){
        this.nombre = nombre
        this.nota = nota
    }
    fun imprimir(){
        println("nombre: $nombre y tiene una nota de $nota")
    }
    fun tienemas4() {
        if (nota >= 4)
            println("tiene mas de 4 $nota")
        else
            println("tiene menos de 4 $nota")
    }

}

fun main(parametro: Array<String>) {

    val alumno1: alumno
    alumno1 = alumno()
    alumno1.inicializar("milo", 10)
    alumno1.imprimir()
    alumno1.tienemas4()

    val alumno2: alumno
    alumno2 = alumno()
    alumno2.inicializar("savage", 4)
    alumno2.imprimir()
    alumno2.tienemas4()
}
