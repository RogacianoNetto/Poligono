import java.lang.Math.sqrt
import javax.xml.bind.DatatypeConverter.parseFloat

class Triangulo(val l1 : Double) {

    fun alturaTE() : Double {
        val altura: Double = l1 * sqrt(5.0) / 2
        return altura
    }

    fun areaT() : Double {
        val altura = alturaTE()
        val area = (altura * l1)/2
        return area
    }
}

