package ejercicios

fun main() {
    print("introduce la frase: ")
    var frase = readln()
    var fraseFin = ""

    while (frase != ""){
        fraseFin = fraseFin.plus(frase +"\n")
        print("introduce la siguiente frase: ")

        frase = readln()


    }
    print("\n cadena resultante:  \n" +
            "---------------------------------------------------- \n")
    print(fraseFin)

}//fin del main