import kotlin.math.exp

fun main(){
/*
    var x = 1
    while (x <= 100){
        println(x)
        x = x + 1
        x++
    }
*/
/*
print("ingrese el valor:")
val valor: Int = readln().toInt()
    var x = 1
    while (x <= valor){
        println(x)
        x++
    }
*/

/*
var x = 1
    var suma = 8

    while (x <= 10){
        print("ingrese el valor $x:")
        val valor = readln().toInt()
        suma = suma + valor
        x++
    }
    println("la suma de los 10 valores ingresados es $suma")
    val promedio = suma / 10
    println("el rpomedio es $promedio")
*/
/*
print("cuantas piezas se van a procesar:")
    val n = readln().toInt()
    var x = 1
    var cantidad = 0
    while (x <= n){
        print("ingrese la medida de la pieza:")
        val largo: Double = readln().toDouble()
        if (largo >= 1.20 && largo <= 1.30){
            cantidad = cantidad + 1
            /*
            cantidad++
            */
        }
        x++
    }
        print("la cantidad de piezas aptas son: $cantidad")
*/
/*
    var x = 1
    var suma = 0
    var mayor = 1
    var menor = 1
    while (x <= 10){
        print("ingrese la nota $x:")
        val nota = readln().toInt()
        suma = suma + nota
        x++

        if (nota >= 7)mayor++
        else
            menor++
        }
    println("la nota es mayor a 7 $mayor")
    println("la nota es mayor a 7 $mayor")
    */


// Se ingresan un conjunto de n alturas de personas por teclado (n se ingresa
//por teclado). Mostrar la altura promedio de las personas

/*print("Ingrese la cantidad de alturas:")
var x = 1
var suma = 0.0
val n = readln().toInt()
while (x <= n) {
    print("Ingrese la altura:")
    val valor = readln().toDouble()
    suma = suma + valor
    x++
}
val promedio = suma / n
println("El promedio de las alturas es: $promedio")
 */
//En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y
//$500, realizar un programa que lea los sueldos que cobra cada empleado e
//informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más
//de $300. Además el programa deberá informar el importe que gasta la
//empresa en sueldos al personal.

/*print("Cantidad de empleados:")
val n = readln().toInt()
var x = 1
var valor1 = 0
var valor2 = 0
var gasto = 0.0
while (x <= n) {
    print("Ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble()
    if (sueldo <= 300)
        valor1 = valor1 + 1
    else
        valor2 = valor2 + 1
    gasto = gasto + sueldo;
    x = x + 1
}
println("Sueldos entre 100 y 300: $valor1")
println("Cobran más de 300: $valor2")
println("Gastos en sueldos: $gasto")
 */

// Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44,
// etc. (No se ingresan valores por teclado)

/*
var x = 1
var termino = 11
while (x <= 25) {
    println(termino)
    termino = termino + 11
    x++
}
*/
//Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16
//- 24, etc


/*var x = 1
var multiplo = 8
while (x <= 62){
    println(multiplo )
multiplo = multiplo + 8
    x ++
 */
    /*
    println("Lista 1 de 5 valores")
    var suma1 = 0
    var x1 = 0
    while (x1 <= 5) {
        print("Ingrese valores: ")
        val valor1 = readln().toInt()
        suma1 = suma1 + valor1
        x1++
    }
    var suma2 = 0
    var x2 = 1
    println("Lista 2 de 5 valores")
    while (x2 <= 5) {
        print("Ingrese valores:")
        val valor2 = readln().toInt()
        suma2 = suma2 + valor2
        x2++
    }
    if (suma1 > suma2)
        println("La lista 1 es mayor")
    else
        if (suma2 > suma1)
            println("La lista 2 es mayor")
        else
            println("Las listas son iguales")
*/

/*
var x = 1
    var par = 0
    var impar = 0
    print("Ingrese la cantidad de numeros deseados:")
    val n = readln().toInt()
    while ( x <= n) {
        println("Ingrese un numero:")
        val valor = readln().toInt()
        x++
        if (valor % 2 == 0)
            par = par + x
        else
            impar = impar + x
    }
    println("La cantidad de numeros pares son: $par")
    println("La cantidad de numeros impar son: $impar")
*/


}




