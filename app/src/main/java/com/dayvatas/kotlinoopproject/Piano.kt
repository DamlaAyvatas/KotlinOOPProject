package com.dayvatas.kotlinoopproject

class Piano : HouseDecor, Instrument{
    override var roomName: String
        get() = "Kitchen"
        set(value) {  }

    var brand : String? = null
    var digital : Boolean? = null
    /*override fun info() {
        println("instrument info")
    }*/
}