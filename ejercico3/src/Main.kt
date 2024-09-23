fun main(){

        val cadenas = Array<String>(5) { "" }


        for (i in 0 until 5) {
            println("Ingresa la cadena ${i + 1}:")
            cadenas[i] = readLine().orEmpty()
        }

        println("\nLas cadenas ingresadas son:")
        for (cadena in cadenas) {
            println(cadena)
        }
}

