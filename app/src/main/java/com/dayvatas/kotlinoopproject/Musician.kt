package com.dayvatas.kotlinoopproject

open class Musician(name: String, instrument: String, age: Int) {
    var name: String? = name  // encapsulation
        private set
        get

    private var instrument: String? = instrument


    var age: Int? = age
        get
        private set

    private val bandName: String = "Metallica"
    fun returnBandName(password: String?): String {
        if (password == "damla") {
            return bandName
        }else{
            return "Wrong Password"
        }
    }
}