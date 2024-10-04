import java.io.File

fun readFile(ruta: String): String {
    val archivo = File(ruta)
    return archivo.readText()
}
fun writeFile(ruta: String, data: String) {
    val archivo = File(ruta)
    archivo.appendText(data)
}

fun main(args: Array<String>) {
    val route = "/Users/mauricioparada/Documents/PracticasEstructura/practica6/ejercicio1/Documents/example.txt"
    val content = readFile(route)

    /**example 1of readinf files **/
    println(content)

    println("Type whatever you want\n")
    println("This was append")
    val contentWrite = writeFile(route, content)
    println(contentWrite)
}
