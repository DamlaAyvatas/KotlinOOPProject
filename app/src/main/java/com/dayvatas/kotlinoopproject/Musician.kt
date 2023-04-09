package com.dayvatas.kotlinoopproject

class Musician(name: String, instrument: String, age: Int) {
    var name: String? = name  // encapsulation
        private set
        get

    var instrument: String? = instrument
        get
        set

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