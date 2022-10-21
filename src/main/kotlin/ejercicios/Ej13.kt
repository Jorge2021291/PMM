package ejercicios

fun main() {
    print("Introduce un dia: ")
    var dia = readln().lowercase()

    var laborables = arrayOf("lunes", "martes", "miercoles", "jueves")


    if(dia in laborables){
        print("El dia ${dia} es laborable ")
    }else{
        println("El dia no es laborable ")
    }
}