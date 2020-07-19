package com.vaagdevi.basickotlin

import java.util.*

fun main(args: Array<String>) {

    val num = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    val sc = Scanner(System.`in`)

    print("Enter the Search Item : ")
    val search: Int = sc.nextInt()

    var found = false

    for (n in num) {
        if (n == search) {
            found = true
            break
        }
    }

    if (found)
        println("Your search item $search is available.")
    else
        println("Your search item $search is not available.")

}
