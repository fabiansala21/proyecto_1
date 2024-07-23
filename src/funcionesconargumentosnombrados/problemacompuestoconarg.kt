
fun tablademultiplicar(valor: Int, termino: Int = 10){
    for (i in 1..termino){
        val resultado = valor * i
        println("$valor x $i = $resultado")
    }


    }
fun main(){

    tablademultiplicar(1, 10  )
    tablademultiplicar(valor = 1, termino = 10)



}