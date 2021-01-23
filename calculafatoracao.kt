

fun main() {

    var numero = readLine()?.toLong()

    if (numero != null) {

        print(calculaFatorial(numero))
    }
}

fun calculaFatorial(numero: Long): Long {

    val numeroFatorado = if (numero <= 1) {
        numero
    } else {
        numero * calculaFatorial(numero - 1)

    }

    return numeroFatorado
}