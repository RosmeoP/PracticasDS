fun main() {
    val numeros = IntArray(4)

    try {

        for (i in 0 until 4) {
            println("Ingresa el número ${i + 1}:")
            numeros[i] = readLine()?.toInt() ?: throw NumberFormatException("Formato de número no válido")
        }

        val mayor = numeros.maxOrNull() ?: throw Exception("No se pudo encontrar el número mayor")
        println("El número mayor es: $mayor")

    } catch (e: NumberFormatException) {
        println("Error: uno de los valores ingresados no es un número válido.")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
