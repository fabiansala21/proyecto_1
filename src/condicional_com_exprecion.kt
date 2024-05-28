fun main(){
    /*
    print("agregue el primer valor")
    val valor1 = readln().toInt()
    print("ingrese el siguiente valor:")
    val valor2 = readln().toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    println("el mayor $valor1 y $valor2 es$mayor")
    */

    /*
    print("ingrese un valor entero:")
    val valor = readln().toInt()
    val resultado = if (valor %2 ==0) {
        print("cuadrado")
        valor * valor
    }else{
        print("cubo")
        valor*valor*valor
    }
    print("resultado")
    */

    print("ingrese un numero entre el 1 y el 99:")
    val numero = readln().toInt()
    val digitos = if (numero >= 10){
        println("el numero contiene un digitos")
    }else{
        println("el numero contiene dos digitos")}


}
