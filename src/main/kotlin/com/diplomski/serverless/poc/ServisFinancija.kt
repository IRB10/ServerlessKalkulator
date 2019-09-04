package com.diplomski.serverless.poc

import org.springframework.stereotype.Service


@Service
class ServisFinancija {

    fun calculate(brojPrvi: Double, brojDrugi: Double, operacija: String): Double? {
        var rezultat: String = when (operacija) {
            "+" -> (brojPrvi + brojDrugi).toString()
            "-" -> (brojPrvi - brojDrugi).toString()
            "*" -> (brojPrvi * brojDrugi).toString()
            "/" -> (brojPrvi / brojDrugi).toString()
            else -> "Operation not supported"
        }
        return if (rezultat == "Operation not supported") {
            null
        } else {
            rezultat.toDouble()
        }
    }
}