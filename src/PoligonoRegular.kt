class PoligonoRegular(val nL: Int)  {

        fun sAngInternos(): Int {
            val sAngInternos = (nL - 2) * 180
            return sAngInternos
        }

        fun angInternos(nL: Int): Double {
            val angInternos = sAngInternos() / nL.toDouble()
            return angInternos
        }

        fun angExterno (nL : Int): Double {
            val angExterno = 360 / nL.toDouble()
            return angExterno
        }

        fun nDiag(nL : Int) : Int {
            val nDiag = nL * (nL - 3) / 2
            return nDiag
        }
}