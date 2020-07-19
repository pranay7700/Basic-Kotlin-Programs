package com.vaagdevi.basickotlin

class Outer {

    val a = "Outside Nested class Value is 7"

    class NestedClasses {
        val b = "Inside Nested class value is 2"
        fun callMe() = "Function call from inside Nested class."
    }
}

fun main(args: Array<String>) {
    //println(Outer().a)
    println(Outer.NestedClasses().b)

    val nested = Outer.NestedClasses()
    println(nested.callMe())
}