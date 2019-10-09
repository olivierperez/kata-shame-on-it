package fr.o80.kata

import java.io.PrintWriter

fun main() {
    val écrivain = PrintWriter("customer-01")
    écrire(écrivain, "firstname", "Olivier")
    écrire(écrivain, "lastname", "PEREZ")
    écrivain.close()
}

fun écrire(output: PrintWriter, key: String, value: Any) {
    output.write("$key(${value.javaClass})=$value")
}
