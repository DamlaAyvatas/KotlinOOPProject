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

        println(myUser.information())

        //abstract & inheritance

        //var myPeople = People()
        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

        // lambda expressions
        fun printString(myString: String){
            println(myString)
        }
        printString("that is my string")

        val testString = {myString : String -> println(myString) }
        testString("my lambda string")

        val multiplyLambda = {a: Int, b:Int -> a*b}
        println(multiplyLambda(5,4))

        val multiplyLambda2 : (Int, Int) -> Int = {a,b -> a*b}
        println(multiplyLambda2(2,3))

        //asynchronous
        //callback function, listener function, completion function

        fun downloadMusicians(url: String, completion : (Musician) -> Unit){ //completion içinde bir musician objesi alıyor
            //url -> download
            //data
            val kirkHammet = Musician("kirk","guitar", 60)
            completion(kirkHammet)
        }
        downloadMusicians("metallica.com",{
            println(it.name)
        })
        downloadMusicians("metallica.com", {musician ->
            println(musician.name)
        })
    }
}