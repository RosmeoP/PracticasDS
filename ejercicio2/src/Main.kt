fun main(){
    val notas = IntArray(4)

    try {
        println("Please enter your notes (4)")
        println("Enter the first note")
        notas[0] = readLine()?.toInt() ?:  throw NumberFormatException("Invalid format of number")
        println("Please type the second note:")
        notas[1] = readLine()?.toInt() ?:  throw NumberFormatException("Invalid format of number")
        println("Enter the third note:")
        notas[2] = readLine()?.toInt() ?:  throw NumberFormatException("Invalid format of number")
        println("Enter the fourth note:")
        notas[3] = readLine()?.toInt() ?:  throw NumberFormatException("Invalid format of number")

        val promedio = notas.average()
        println("The average of the notes is $promedio")
    }



    catch (e: NumberFormatException) {
        println("Error: one of the values is not a number.")
    }


}