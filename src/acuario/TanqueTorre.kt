package acuario

import kotlin.math.PI

class TanqueTorre(override var alto: Int, var diametro: Int)
    : Acuario(alto = alto, ancho = diametro, largo = diametro) {

    override var volumen: Int
        // área circular ≈ π * (r^2) * alto
        get() = ((ancho / 2.0) * (largo / 2.0) * alto / 1000.0 * PI).toInt()
        set(valor) {
            // volumen = π * r^2 * alto  ⇒  alto = volumen / (π * r^2)
            alto = ((valor * 1000.0 / PI) / ((ancho / 2.0) * (largo / 2.0))).toInt()
        }

    override var agua: Double = volumen * 0.8
    override val forma: String = "cilindro"
}