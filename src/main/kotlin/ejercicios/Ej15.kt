package ejercicios
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    var cantFinal:Double = 0.00
    var x = false

    while(!x){

        print("Que cantidad has vendido en la venta?: ")
        var cantidad = readln()
        if (cantidad == "*"){
            x = true
        }else{
            cantFinal += cantidad.toDouble()

        }

    }


    println(BigDecimal(cantFinal).setScale(2, RoundingMode.HALF_EVEN))

}