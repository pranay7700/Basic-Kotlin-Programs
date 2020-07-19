package com.vaagdevi.basickotlin

import java.util.*

fun main(args: Array<String>) {
    val string1: String
    val string2: String

    print("Enter 1st String : ")
    string1 = readLine().toString()

    print("Enter 2nd String : ")
    string2 = readLine().toString()

    if (string1.contains(string2, false)) {
        print("1st String '$string1' contains 2nd String '$string2'")
    } else {
        print("1st String '$string1' doesn't contain 2nd String '$string2'")
    }
}