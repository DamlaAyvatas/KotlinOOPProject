package com.dayvatas.kotlinoopproject

class SuperMusician(name: String, instrument: String, age: Int) : Musician(name, instrument, age) {  //Musician classından inheritance al

    fun sing(){
        println("nothing else matters")
    }
}