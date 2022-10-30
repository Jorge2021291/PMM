package ejercicios

fun main() {
    print("introduce el numero: ")
    val num = readln().toInt()
    var fin = 0
    for (i in 1 .. num){
        fin += i
    }
    print(fin)
}