fun fibonacci(n: Int): Int {
    return if (n <= 1) {
        n
    } else {
        fibonacci(n - 1) + fibonacci(n - 2)
    }
}

fun sumaRecursive(n: Int): Int {
    return if (n <= 1) {
        n
    } else {
        n + sumaRecursive(n - 1)
    }
}

fun listaRecursive(list: List<Int>): Int {
    return if (list.isEmpty()) {
        0
    } else {
        list[0] + listaRecursive(list.drop(1))
    }
}

fun main(args: Array<String>) {
    val numero = 10
    val numList = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Fibonacci of $numero is: ${fibonacci(numero)}")
    println("\nExample 2")
    println("The sum of $numero is: ${sumaRecursive(numero)}")
    println("\nExample 3")
    println("The sum of the list is: ${listaRecursive(numList)}")
}
