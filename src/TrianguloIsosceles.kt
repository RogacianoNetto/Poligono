import java.lang.Math.*

class TrianguloIsosceles(val l1: Double, val l2: Double, val l3: Double) {
    fun alturaTIl1(): Double {
        val alturaTIl1 = sqrt(l2 * l2 + l1 * l1 / 4)
        return alturaTIl1
    }

    fun areaTIl1(): Double {
        val areaTIL1 = alturaTIl1() * l1 / 2
        return areaTIL1
    }

    fun calculoAngBasel1(): Double {
        val calculoAngBasel1 = acos((l1/2)/ l2) * (180/PI)
        return calculoAngBasel1
    }

    fun alturaTIl2(): Double {
        val alturaTIl2 = sqrt(l1 * l1 + l2 * l2 / 4)
        return alturaTIl2
    }

    fun areaTIl2(): Double {
        val areaTIL2 = alturaTIl2() * l2 / 2
        return areaTIL2
    }

    fun calculoAngBasel2(): Double {
        val calculoAngBasel2 = acos((l2/2)/ l1) * (180/PI)
        return calculoAngBasel2
    }

    fun alturaTIl3(): Double {
        val alturaTIl3 = sqrt(l1 * l1 + l3 * l3 / 4)
        return alturaTIl3
    }

    fun areaTIl3(): Double {
        val areaTIL3 = alturaTIl3() * l3 / 2
        return areaTIL3
    }

    fun calculoAngBasel3(): Double {
        val calculoAngBasel3 = acos((l3/2)/ l1) * (180/PI)
        return calculoAngBasel3
    }
}