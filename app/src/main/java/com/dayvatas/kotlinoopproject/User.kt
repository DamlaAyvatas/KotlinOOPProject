package com.dayvatas.kotlinoopproject

class User : People {
    //property
    var name : String? = null
    var age : Int? = null

    //constructor
    constructor(nameInput : String, ageInput : Int){
        this.name = nameInput
        this.age = ageInput

    }
    init{
        println("init")
    }
}