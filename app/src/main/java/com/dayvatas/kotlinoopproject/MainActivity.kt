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

        //encapsulation
        var james = Musician("James","Guitar",55)
        //james.age = 60
        println(james.age.toString())

        println(james.returnBandName("damla"))
        println(james.returnBandName("DDD"))

        //inheritance
        var lars = SuperMusician("Lars", "Drums", 65)
        println(lars.name)
        println(lars.returnBandName("damla"))
        lars.sing()

        //polymorphism
        //static polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(1,2))
        println(mathematics.sum(1,2,3))

        //dynamic polymorphism
        val animal = Animal()
        animal.sing()

        val dog = Dog()
        dog.test()
        dog.sing()
    }
}