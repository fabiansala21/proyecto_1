class hijos {

    var edad1 : Int = 0
    var edad2 : Int = 0
    var edad3 : Int = 0
    var edad4 : Int = 0
    var edad5 : Int = 0

    fun cargar(){

        print("ingrese la primer edad")
        edad1 = readln().toInt()
        print("ingrese al segundo edad")
        edad2 = readln().toInt()
        print("ingrese al tercera edadr")
        edad3 = readln().toInt()
        print("ingrese al cuarta edad")
        edad4 = readln().toInt()
        print("ingrese al quinta edad")
        edad5 = readln().toInt()
       mayor()
        promedio()
    }
    fun mayor(){
        if (nota >= 4)
            println("tiene mas de 4 $nota")
        else
            println("tiene menos de 4 $nota")
    }


    }

}