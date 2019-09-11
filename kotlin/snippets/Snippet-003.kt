package fr.o80.kata

import java.io.PrintWriter

fun main() {
    val printWriter = PrintWriter("customer-01")
    put(printWriter, "firstname", "Olivier")
    put(printWriter, "lastname", "PEREZ")
    printWriter.close()
}

fun put(output: PrintWriter, key: String, value: Any) {
    output.write("$key(${value.javaClass})=$value")
}
