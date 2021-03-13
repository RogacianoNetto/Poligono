import com.sun.org.apache.xalan.internal.lib.ExsltMath.abs
import sun.invoke.empty.Empty
import javax.xml.bind.DatatypeConverter.parseInt
import javax.xml.bind.DatatypeConverter.parseDouble
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope

fun main() {
    println("Informe o número de lados: ")
    val nL = parseInt(readLine())
    val poligonoRegular = PoligonoRegular(nL)
    when (nL) {
        1 -> {
            println("O número de lados é menor que 3. Digite o número correto (entre 3 e 10).")
        }
        2 -> {
            println("O número de lados é menor que 3. Digite o número correto (entre 3 e 10).")
        }
        3 -> {
            println("Informe o lado 1: ")
            val l1 = parseDouble(readLine())
            println("Informe o lado 2: ")
            val l2 = parseDouble(readLine())
            println("Informe o lado 3: ")
            val l3 = parseDouble(readLine())
            if ((l1 < abs(l2 - l3) && l1 > l2 + l3) && (l2 < abs(l1 - l3) && l2 > l1 + l3) && (l3 < abs(l1 - l2) && l3 > l1 + l2)) {
                println("Os lados não formam um triangulo.")
            } else {
                // Verifica se o triângulo é equilátero.
                if (l1 == l2 && l1 == l3) {
                    val triangulo = Triangulo(l1)
                    println("Os lados formam um triângulo equilátero.")
                    println("A altura do triângulo equilátero é ${triangulo.alturaTE()} cm.")
                    println("A área do triângulo equilátero é ${triangulo.areaT()} cm2.")
                    println("A soma dos ângulos internos do triangulo equilátero é ${poligonoRegular.sAngInternos()} graus.")
                    println("O ângulo externo do triângulo equilátero é ${poligonoRegular.angExterno(nL)} graus.")
                } else {
                    // Verifica se o triângulo é isósceles.
                    if (l1 == l2 || l1 == l3 || l2 == l3) {
                        val trianguloIsosceles = TrianguloIsosceles(l1, l2, l3)
                        if (l1 == l2) {
                            println("Os lados formam um triangulo isósceles com base l3.")
                            println("A altura do triângulo isósceles é ${trianguloIsosceles.alturaTIl3()} cm")
                            println("A área do triangulo isósceles base l3 é igual a ${trianguloIsosceles.areaTIl3()} cm2")
                            println("O angulo da base do triangulo isosceles base l3 é ${trianguloIsosceles.calculoAngBasel3()} graus)")
                        }
                        if (l1 == l3) {
                            println("Os lados formam um triangulo isósceles com base l2.")
                            println("A altura do triângulo isósceles é ${trianguloIsosceles.alturaTIl2()} cm")
                            println("A área do triangulo isósceles base l2 é igual a ${trianguloIsosceles.areaTIl2()} cm2")
                            println("O angulo da base do triangulo isosceles base l2 é ${trianguloIsosceles.calculoAngBasel2()} graus")
                        }
                        if (l2 == l3) {
                            println("Os lados formam um triangulo isósceles com base l1.")
                            println("A altura do triângulo isósceles é ${trianguloIsosceles.alturaTIl1()} cm")
                            println("A área do triangulo isósceles l3 é igual a ${trianguloIsosceles.areaTIl1()}")
                            println("A área do triangulo isósceles base l1 é igual a ${trianguloIsosceles.areaTIl1()} cm2")
                            println("O angulo da base do triangulo isosceles base l1 é ${trianguloIsosceles.calculoAngBasel1()} graus")
                        }
                    } else {
                        // Verifica se o triângulo é retângulo.
                        if ((l1 * l1 == l2 * l2 + l3 * l3) || (l2 * l2 == l1 * l1 + l3 * l3) || (l3 * l3 == l1 * l1 + l2 * l2)) {
                            if (l1 > l2 && l1 > l3) {
                                println("Os lados formam um triângulo retângulo com hipotenusa l1.")
                                println("A hipotenusa do triângulo retângulo é igua a ${l1} cm")
                                println("A área do trinângulo retângulo é igua a ${l2 * l3 / 2}")
                            }
                            if (l2 > l1 && l2 > l3) {
                                println("Os lados formam um triângulo retângulo com hipotenusa l2.")
                                println("A hipotenusa do triângulo retângulo é igua a ${l2} cm")
                                println("A área do trinângulo retângulo é igua a ${l1 * l3 / 2}")
                            }
                            if (l3 > l1 && l3 > l2) {
                                println("Os lados formam um triângulo retângulo com hipotenusa l3.")
                                println("A hipotenusa do triângulo retângulo é igua a ${l3} cm")
                                println("A área do trinângulo retângulo é igua a ${l1 * l2 / 2}")
                            }
                        } else {
                            println("O triângulo é escaleno.")
                        }
                    }
                }
            }
        }
        4 -> {
            println("Informe qual o tipo de quadrilátero: ")
            println("1 - Retângulo")
            println("2 - Quadrado")
            println("3 - Trapézio Retângulo")
            println("4 - Losango")
            println("X - Sair")
            val item = parseInt(readLine())
            val quadrilatero = Quadrilatero()
            when (item) {
                1 -> {
                    println("O quadrilátero é o retângulo.")
                    println("Informe o lado 1 e 3 (opostos) - cm: ")
                    val l1 = parseDouble(readLine())
                    println("Informe o lado 2 e 4 (opostos) - cm: ")
                    val l2 = parseDouble(readLine())
                    println("retangulo de lados ${l1} cm, ${l1} cm, ${l2} cm, ${l2} cm.")
                    println("A área de do retângulo é ${quadrilatero.areaQuad(l1, l2)} cm2.")
                    println("O perímetro do retângulo é ${quadrilatero.perimetro(l1, l2)} cm.")
                    println("A soma dos ángulos internos do retângulo é igual a ${poligonoRegular.sAngInternos()} graus.")
                    println("O ángulo interno do retângulo é igual a ${poligonoRegular.angInternos(nL)} graus.")
                    println("O ángulo externo do retângulo é igual a ${poligonoRegular.angExterno(nL)} graus.")
                    println("O número de diagonais do retângulo é igual a ${poligonoRegular.nDiag(nL)}.")
                    println("O comprimento da diagonal do quadrado é ${quadrilatero.compDiagonal(l1, l2)} cm")
                }
                2 -> {
                    println("O quadrilátero é o quadrado.")
                    println("Informe o lado do quadrdo (cm): ")
                    val l1 = parseDouble(readLine())
                    val l2 = l1
                    println("Quadrado de lado ${l1} cm.")
                    println("A área do quadrado é ${quadrilatero.areaQuad(l1, l2)} cm2.")
                    println("O perímetro do quadrado é ${quadrilatero.perimetro(l1, l2)} cm.")
                    println("A soma dos ángulos internos do quadrado é igual a ${poligonoRegular.sAngInternos()} graus")
                    println("O ángulo interno do quadrado é igual a ${poligonoRegular.angInternos(nL)} graus")
                    println("O ángulo externo do quadrado é igual a ${poligonoRegular.angExterno(nL)} graus")
                    println("O número de diagonais do quadrado é igual a ${poligonoRegular.nDiag(nL)}")
                    println("O comprimento da diagonal do quadrado é ${quadrilatero.compDiagonal(l1, l2)} cm")
                }
                3 -> {
                    println("O quadrilátero é o Trapézio Retângulo.")
                    println("Informe o comprimento da base menor (cm): ")
                    val l1 = parseDouble(readLine())
                    println("Informe o comprimento da base maior (cm): ")
                    val l2 = parseDouble(readLine())
                    println("Informe a altura (cm): ")
                    val l3 = parseDouble(readLine())
                    println("A área do trapézio é igual a ${quadrilatero.areaTrapezio(l1, l2, l3)} cm2")
                    println("O perímetro do trapézio é iguala ${quadrilatero.perimetroTrapezio(l1, l2, l3)} cm")
                }
                4 -> {
                    println("O quadrilátero é o losango.")
                    println("Informe o lado do losando (cm): ")
                    val l1 = parseDouble(readLine())
                    val l2 = l1
                    println("Informe o valor do ângulo interno menor: ")
                    val l3 = parseDouble(readLine())
                    println("Losango de lado ${l1} cm.")
                    println("A área do losango é ${quadrilatero.areaLosango(l1, l3)} cm2.")
                    println("A soma dos ángulos internos do losango é igual a ${poligonoRegular.sAngInternos()} graus")
                    println("O ángulo interno menor do losango é igual a ${l3} graus")
                    println("O ángulo interno maior do losango é igual a ${(poligonoRegular.sAngInternos() - 2 * l3) / 2} graus")
                    println("O número de diagonais do losango é igual a ${poligonoRegular.nDiag(nL)}")
                    println(
                        "O comprimento da diagonal menor do losango é ${
                            quadrilatero.compDiagonalMenorLosango(
                                l1,
                                l3
                            )
                        } cm"
                    )
                    println(
                        "O comprimento da diagonal maior do losango é ${
                            quadrilatero.compDiagonalMaiorLosango(
                                l1,
                                l3
                            )
                        } cm"
                    )
                }
            }
        }
        5 -> {
            println("É o pentágono regular")
            println("Informe o lado do pentágono: ")
            val l1 = parseDouble(readLine())
            println("O lado do pentágono é ${l1} cm")
            println("A soma dos angulos internos de um pentágono regular é ${poligonoRegular.sAngInternos()} graus")
            println("O angulo interno de um pentágono regular mede ${poligonoRegular.angInternos(nL)} graus")
            println("Há ${poligonoRegular.nDiag(nL)} diagonais em um pentágono regular.")
        }
        6 -> {
            println("É o hexágono regular")
            println("Informe o lado do hexágono: ")
            val l1 = parseDouble(readLine())
            println("O lado do hexágono é ${l1} cm")
            println("A soma dos angulos internos de um hexágono regular é ${poligonoRegular.sAngInternos()} graus")
            println("O angulo interno de um hexágono regular mede ${poligonoRegular.angInternos(nL)} graus")
            println("Há ${poligonoRegular.nDiag(nL)} diagonais em um hexágono regular.")
        }
        7 -> {
            println("É o heptágono regular")
            println("Informe o lado do heptágono: ")
            val l1 = parseDouble(readLine())
            println("O lado do heptágono é ${l1} cm")
            println("A soma dos angulos internos de um heptágono regular é ${poligonoRegular.sAngInternos()} graus")
            println("O angulo interno de um heptágono regular mede ${poligonoRegular.angInternos(nL)} graus")
            println("Há ${poligonoRegular.nDiag(nL)} diagonais em um heptágono regular.")
        }
        8 -> {
            println("É o octógono regular")
            println("Informe o lado do octógono: ")
            val l1 = parseDouble(readLine())
            println("O lado do octógono é ${l1} cm")
            println("A soma dos angulos internos de um octógono regular é ${poligonoRegular.sAngInternos()} graus")
            println("O angulo interno de um octógono regular mede ${poligonoRegular.angInternos(nL)} graus")
            println("Há ${poligonoRegular.nDiag(nL)} diagonais em um octógono regular.")
        }
        9 -> {
            println("É o eneágono regular")
            println("Informe o lado do eneágono: ")
            val l1 = parseDouble(readLine())
            println("O lado do eneágono é ${l1} cm")
            println("A soma dos angulos internos de um eneágono regular é ${poligonoRegular.sAngInternos()} graus")
            println("O angulo interno de um eneágono regular mede ${poligonoRegular.angInternos(nL)} graus")
            println("Há ${poligonoRegular.nDiag(nL)} diagonais em um eneágono regular.")
        }
        10 -> {
            println("É o decágono regular")
            println("Informe o lado do decágono: ")
            val l1 = parseDouble(readLine())
            println("O lado do decágono é ${l1} cm")
            println("A soma dos angulos internos de um decágono regular é ${poligonoRegular.sAngInternos()} graus")
            println("O angulo interno de um decágono regular mede ${poligonoRegular.angInternos(nL)} graus")
            println("Há ${poligonoRegular.nDiag(nL)} diagonais em um decágono regular.")
        }
        else -> {
            println("O número de lados está fora do range. Deve estar entre 3 e 10.")
        }
    }
}
