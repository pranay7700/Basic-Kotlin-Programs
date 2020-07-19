package com.vaagdevi.basickotlin

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    print("Enter no. of times Hello to be printed : ")
    val num: Int = sc.nextInt()

    repeat(num){
        println("Hello")
    }
    println("Hello is repeated $num times")
}
