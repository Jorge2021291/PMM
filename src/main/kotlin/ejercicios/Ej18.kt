package ejercicios

fun main() {
    var cadena = "La lluvia en Sevilla es una maravilla"

    var x = 0
    for(i in cadena){
        if(i == 'a'){
            //cadena[x] = 'e'
            val sb = StringBuilder(cadena).also { it.setCharAt(x, 'e') }
            cadena = sb.toString()
        }
        x++

    }
    println(cadena)


}