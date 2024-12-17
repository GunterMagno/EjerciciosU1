
fun calculararea(lado1: Float,lado2: Float,lado3: Float) :Float {
    var superficie = (lado1 + lado2 + lado3)/2
    val area = superficie * (superficie - lado1) * (superficie - lado2) * (superficie - lado3)
    return area
}

fun pedirfloat(msj: String): Float?{
    val input = null
    try {
        print(msj)
        var input :Float = readln().toFloat()
    }

    catch (e: NumberFormatException) {
        println("Error: el numero introducido no es valido.")
        null
    }
    return input
}


fun main() {

    val lado1 = pedirfloat("Dame un numero para el primer lado: ")
    val lado2 = pedirfloat("Dame un numero para el segundo lado: ")
    val lado3 = pedirfloat("Dame un numero para el tercer lado: ")

    calculararea(lado1,lado2,lado3)
}