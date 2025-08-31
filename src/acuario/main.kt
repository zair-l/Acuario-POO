package acuario

interface Limpiar {
    fun limpiar()
}

class Esponja : Limpiar {
    override fun limpiar() = println("Limpiando el acuario con esponja suave...")
}

fun demoPropio() {
    println("==== DEMO PROPIO ====")

    val torre = TanqueTorre(diametro = 30, alto = 50)
    torre.imprimirTamano()

    torre.volumen = 120
    println("Tras ajustar volumen a 120 l:")
    torre.imprimirTamano()

    val tibu = Tiburon()
    val payaso = PezPayaso()
    println("Colores -> Tiburón: ${tibu.color}, Payaso: ${payaso.color}")
    tibu.comer()
    payaso.comer()

    val kit = Esponja()
    kit.limpiar()
}

fun main() {
    demoPropio()
}

