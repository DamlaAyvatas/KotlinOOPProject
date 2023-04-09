package com.dayvatas.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User("James",50)
      //  myUser.name = "Damla"
      //  myUser.age = 28

        println(myUser.age)
        println(myUser.name)

        var james = Musician("James","Guitar",55)
        //james.age = 60
        println(james.age.toString())

        println(james.returnBandName("damla"))
        println(james.returnBandName("DDD"))

        var lars = SuperMusician("Lars", "Drums", 65)
        println(lars.name)
        println(lars.returnBandName("damla"))
        lars.sing()
    }
}