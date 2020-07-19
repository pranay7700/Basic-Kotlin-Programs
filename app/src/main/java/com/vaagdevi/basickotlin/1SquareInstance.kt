package com.vaagdevi.basickotlin

import java.util.*
import kotlin.math.sqrt

class SquareInstance() {

    fun output() {
        val array = arrayOf(1, 2, 3, 4, 5)
        println(array.map { n: Int -> n * n })
    }
}

fun main(args: Array<String>) {
    val obj = SquareInstance()
    obj.output()
}