package estructura_repetitiva_for

fun main(){

 var mult3 = 0
         var mult5 = 0
                 var mult9 = 0
    for (index in 1..10000){
        if (index % 3 == 0)
            mult3++
        if (index % 5 == 0)
            mult5++
        if (index % 9 == 0)
            mult9++
    }
    println("cantidad de multiplos 3: $mult3")
    println("cantidad de multiplos 5: $mult5")
    println("cantidad de multiplos 9: $mult9")
    

}