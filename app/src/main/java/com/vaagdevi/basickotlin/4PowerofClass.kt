package com.vaagdevi.basickotlin

import java.util.*

class PowerOfClass() {

    fun square() {
        val baseSC = Scanner(System.`in`)
        print("Enter the base value : ")
        val base: Int = baseSC.nextInt()

        val exponentSC = Scanner(System.`in`)
        print("Enter the exponent value : ")
        val exponent: Int = exponentSC.nextInt()

        val result = Math.pow(base.toDouble(), exponent.toDouble())

        println("Answer = $result")
    }
}



fun main(args: Array<String>) {
    val obj = PowerOfClass()
    obj.square()
}