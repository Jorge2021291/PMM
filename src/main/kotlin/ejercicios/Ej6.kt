package ejercicios

fun main() {
    var a = false
    while (!a){
        println("¿Cual es la capital de colombia?: \n" +
                "a. La paz\n" +
                "b:Buenos aires\n" +
                "c. La Habana\n" +
                "d. Bogotá\n"
        )
        var respuesta = readln()
        println("Respuesta $respuesta")
        if (respuesta == "d"){
            println("Felicitaciones!")
            a = true
        }

    }
}