package ejercicios

fun main() {

    var salida = true

    print("Introduce el primer numero: ")
    var n1 = readln().toInt()

    print("Introduce el segundo numero: ")
    var n2 = readln().toInt()



    println("1: suma los operandos.\n" +
            "2: resta los operandos.\n" +
            "3: multiplica los operandos.\n" +
            "4: divide los operandos\n" +
            "5: potencia (1º operando como base y 2º como exponente).\n" +
            "6: módulo , resto de la división entre operando1 y operando2.\n" +
            "7: pedir 2 operandos nuevos\n" +
            "8: Salir")


    print("Que operacion deseas realizar: ")
    var eleccion = readln().toInt()


    while(salida){
        if(eleccion == 1){
            print(n1+n2);
                print("\n" +
                        " Que operacion deseas realizar: ")
                eleccion = readln().toInt()
        } else if(eleccion == 2){
            print(n1-n2)
            print("\n" +
                    " Que operacion deseas realizar: ")
            eleccion = readln().toInt()}
        else if (eleccion == 3){print(n1*n2)
            print("\n" +
                    " Que operacion deseas realizar: ")
            eleccion = readln().toInt()}
        else if (eleccion == 4){print(n1/n2)
            print("\n" +
                    " Que operacion deseas realizar: ")
            eleccion = readln().toInt()}
        else if (eleccion == 5){print(Math.pow(n1.toDouble(), n2.toDouble()))
            print("\n" +
                    " Que operacion deseas realizar: ")
            eleccion = readln().toInt()}
        else if(eleccion == 6){print(n1%n2)
            print("\n" +
                    " Que operacion deseas realizar: ")
            eleccion = readln().toInt()}
        else if(eleccion == 7){
            print("Introduce el primer numero: ")
            n1 = readln().toInt()

            print("Introduce el segundo numero: ")
            n2 = readln().toInt()
            print("\n Que operacion deseas realizar: ")
            eleccion = readln().toInt()
        }
        else if(eleccion == 8){
            salida = false
        }else{
            print("Elige algo dentro de los parametros: ")
            eleccion = readln().toInt()
        }


    }

}