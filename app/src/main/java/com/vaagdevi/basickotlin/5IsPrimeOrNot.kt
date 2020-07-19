package com.vaagdevi.basickotlin

import java.util.*

fun isPrimeNo(num: Int): Boolean {
    if (num < 2)
        return false
    for (i in 2..num / 2) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    print("Enter the number : ")
    val num2: Int = sc.nextInt()

    if (isPrimeNo(num2)) {
        println("$num2 is Prime Number")
    } else {
        println("$num2 is not a Prime Number")

    }
}