import java.lang.Math.*

class Quadrilatero () {

    fun areaQuad(l1: Double, l2: Double): Double {
        val areaQuad = l1 * l2
        return areaQuad
    }

    fun compDiagonal(l1: Double, l2: Double): Double {
        val compDiagonal = sqrt(l1 * l1 + l2 * l2)
        return compDiagonal
    }

    fun perimetro(l1: Double, l2: Double): Double {
        val perimetro = 2 * (l1 + l2)
        return perimetro
    }

    fun areaLosango(l1: Double, l3: Double): Double {
        val semiDiagonalMaior = l1 * cos(l3/2 * PI/ 180)
        val semiDiagonalMenor = l1 * sin(l3/2 * PI / 180)
        val areaLosango = 2 * (semiDiagonalMenor * semiDiagonalMaior)
        return areaLosango
    }

    fun compDiagonalMenorLosango(l1: Double, l3: Double): Double {
        val semiDiagonalMenor = l1 * sin(l3/2 * PI / 180)
        val compDiagonalMenor = 2 * semiDiagonalMenor
        return compDiagonalMenor
    }

    fun compDiagonalMaiorLosango(l1: Double, l3: Double): Double {
        val semiDiagonalMaior = l1 * cos(l3/2 * PI/ 180)
        val compDiagonalManor = 2*semiDiagonalMaior
        return compDiagonalManor
    }

    fun areaTrapezio(l1: Double, l2: Double, l3: Double): Double {
        val areaTrapezio = ((l1 + l2) * l3) / 2
        return areaTrapezio
    }

    fun perimetroTrapezio(baseMenor: Double, baseMaior: Double, altura: Double): Double {
        val ladoInclinado = sqrt((altura * altura) + ((baseMaior-baseMaior)*(baseMaior-baseMaior)))
        val perimetroTrapezio = baseMenor + baseMaior + altura + ladoInclinado
        return perimetroTrapezio
    }
}

