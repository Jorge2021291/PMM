package ejercicios

fun main() {
    println("Introduce un numero: ")
    var n1 = readln()
    println("Introduce otro numero: ")
    var n2 = readln()


    if (n1 > n2){
        println("$n1 es mayor que $n2")

    } else if (n2 > n1){
        println("$n2 es mayor que $n1")


    }else{
        println("Son iguales")
    }
}