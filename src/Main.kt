fun clearConsole() {
    val os = System.getProperty("os.name")
    try {
        if (os.contains("win")) {
            // En Windows
            Runtime.getRuntime().exec("cls")
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun main() {
    clearConsole()

    val input  = readLine()
    var opcion = input!!.toInt()

    while (opcion in 1..5) {
        print("Introduce un numero: ")

        println("Menu de ejercicios de la Unidad 1\n\t1. Ejercicio 28\n\t2. Ejercicio 29\n\t3. Ejercicio 30\n\t4. Ejercicio 31\n\t5. Ejercicio 32\n")
        if (opcion == 1) {

        }
        if (opcion == 2) {

        }
        if (opcion == 3) {

        }
        if (opcion == 4) {

        }
        if (opcion == 5) {

        }
    }
}