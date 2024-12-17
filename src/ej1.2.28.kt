
fun calculararea(lado1: Float,lado2: Float,lado3: Float) :Float {
    var superficie = (lado1 + lado2 + lado3)/2
    val area = superficie * (superficie - lado1) * (superficie - lado2) * (superficie - lado3)
    return area
}

fun pedirfloat(msj: String, min:Int? = null, max: Int? = null): Float{

    var numero: Float? = null

    do {
        print(msj)
        try {
            numero = readLine()!!.toFloat()

            if (min != null && max != null && (numero < min && numero > max)) {
                throw NumberFormatException("El numero tiene que estar entre -> $min <- y -> $max <-")
            }

        } catch(e: NumberFormatException){
            println("Error, numero introducido no es valido, intente de nuevo.\n")
        }

    }while(numero == null)

    return numero


}


fun main() {

    val lado1 = pedirfloat("Dame un numero para el primer lado: ")
    val lado2 = pedirfloat("Dame un numero para el segundo lado: ")
    val lado3 = pedirfloat("Dame un numero para el tercer lado: ")

    calculararea(lado1,lado2,lado3)
}