package ejercicios

fun main() {

    var lista = mutableListOf<Int>()

    var sumP = 0
    var sumR = 0

    while(true){
        print("Introduce el numero: ")
        var n1 = readln().toInt()
        if(n1 == -1){
            break
        }else{
            lista.add(n1)
        }


    }//fin del while
    print("El menor es: " + lista.sorted()[0] + "\n")
    print("El mayor es: " + lista.sorted()[lista.size -1] + "\n")
    print("La suma es: " + lista.sum() + "\n")


    for(i in lista){
        if(i > 0){
            sumP += i

        }else{
            sumR += i
        }
    }


    print("La suma de los positivos es: $sumP \n")
    print("La suma de los negativos es: $sumR \n")




}//fin del main