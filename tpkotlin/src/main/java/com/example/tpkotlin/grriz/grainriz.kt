package com.example.tpkotlin.grriz

import java.math.BigInteger

fun main() {
    //8 * 8 = 64
    var result = BigInteger.ONE
    var nbRiz = BigInteger.ONE
    println("Grain de riz à la case 1 : $nbRiz")
    for (index in 2..64){
        nbRiz = nbRiz * BigInteger.TWO
        result += nbRiz
        println("Grain de riz à la case $index : $nbRiz")
    }
    println("Le nobmre total de grain de riz est $result")
}