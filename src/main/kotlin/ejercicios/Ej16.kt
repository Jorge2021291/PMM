package ejercicios

fun main() {

    print("introduce el primer numero: ")
    var n1 = readln()
    print("introduce el segundo numero: ")
    var n2 = readln()
    var x = 0

    while (x<10){
        println((n1.toInt()..n2.toInt()).random())
        x++
    }



}