package ejercicios

fun main() {
    val pass = "pito"

    var x = 2
    while (x>=0){
        print("introduce la contraseña: ")
        var intento = readln()
        if(intento == pass){
            println("Enhorabuena, acertaste")
            break
        }
        else{
            println("Has fallado. Te quedan ${x} intentos")
            x--
        }



    }
}