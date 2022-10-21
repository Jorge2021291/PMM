package ejercicios
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    print("Cuantas ventas se han ralizado en los ultimos 15dias?: ")
    var ventas = readln();
    var cantFinal:Double = 0.00
    var x = 1

    while(x <= ventas.toInt()){
        print("Que cantidad has vendido en la venta ${x} ?: ")
        var cantidad = readln()
        cantFinal += cantidad.toDouble()
        x++
    }


    println(BigDecimal(cantFinal).setScale(2, RoundingMode.HALF_EVEN))

}