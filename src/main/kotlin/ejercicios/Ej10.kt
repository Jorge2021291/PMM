package ejercicios

fun main() {

    var a = false
    while (a == false){
        println("introduce un numero mayor o igual a 0: ")
        var num = readln()

        if (num.toInt() >= 0){
            println(num)
            a = true
        }

    }

}