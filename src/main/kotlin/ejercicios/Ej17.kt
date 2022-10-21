package ejercicios

fun main() {

    val voca:Array<Char> = arrayOf('a', 'e', 'i', 'o', 'u')

    var contVoca = 0
    var contnum = 0
    var contconso = 0
    var contspc = 0




    print("Introduce la cadena de caracteres: ")
    val cadenas = readln()

    for(i in cadenas){
        if(i in voca){
            contVoca++
        } else if(i.digitToIntOrNull() is Int){
            contnum++
        }else if(i == ' '){
            contspc++
        }
        else{
            contconso++
        }
    }

    println("hay $contVoca vocales")
    println("hay $contconso consonantes")
    println("hay $contnum numeros")
    println("hay $contspc espacios")




}//fin del main