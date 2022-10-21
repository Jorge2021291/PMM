package ejercicios

fun main() {
    print("Que mes quieres?: ")
    var mes = readln().lowercase()
    var meses30 = arrayOf("abril", "junio", "septiembre", "noviembre")

    if(mes in meses30){
        println("El mes tiene 30 dias")
    }else if(mes == "febrero"){
        println("El mes tiene 28/29 dias")
    }else{
        println("El mes tiene 31 dias")
    }



}