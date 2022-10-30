package ejercicios

fun main() {

    print("introduce la frase: ")
    var frase = readln()
    var fraseFIn = ""

    for(i in frase){
        if(i != ' '){
            fraseFIn += i

        } else if(i == ' '){
            fraseFIn += "\n"
        }

        }

    print(fraseFIn)

}