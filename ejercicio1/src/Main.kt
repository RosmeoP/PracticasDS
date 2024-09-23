fun main() {
    val numbers = IntArray(3) // Array de 3 números

    try {
        println("Por favor, ingresa el primer número:")
        numbers[0] = readLine()?.toInt() ?: throw NumberFormatException("Número no válido")

        println("Por favor, ingresa el segundo número:")
        numbers[1] = readLine()?.toInt() ?: throw NumberFormatException("Número no válido")

        println("Por favor, ingresa el tercer número:")
        numbers[2] = readLine()?.toInt() ?: throw NumberFormatException("Número no válido")

        // Sumar los números
        val suma = numbers.sum()
        println("La suma de los números es: $suma")

    } catch (e: NumberFormatException) {
        println("Error: uno de los valores ingresados no es un número válido.")
    }
}
