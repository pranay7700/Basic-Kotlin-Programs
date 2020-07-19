package com.vaagdevi.basickotlin

interface Interface {
    var num : Int
    fun absMethod() : String
    fun hai() {
        println("Welcome to Kotlin!")
    }
}

class DemonstrationInterface : Interface {
    override var num: Int = 7
    override fun absMethod() = "Enjoy Kotlin"
}

fun main(args: Array<String>){
    val obj = DemonstrationInterface()
    println("My Variable is ${obj.num}")
    print("Calling hai(): ")
    obj.hai()

    print("Message From Skillship Foundation ")
    println(obj.absMethod())
}