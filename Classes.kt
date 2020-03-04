//Written by Bullseye198

//Let's create a new class:
//We will use one function parameter and one object:

class Animal(val _type: String = "Cat") {

    object CatAttributes{
        var size = "big"
        val speed = mutableListOf("fast", "slow")
        //We use a mutable list because we can change that list later depending on our liking, for example we can add
        //in our main function after calling upon the class:
        //in line 23, add: Animal.CatAttributes.speed.add("")

    }
}

fun main() {

//Now let's call that class:

    val animal = Animal()

    println(animal._type)
    println("${Animal.CatAttributes.size}, ${Animal.CatAttributes.speed[0]} ") 
    //We will print out 1st attribute from our cat speed array.
}

//Our small cat program will print out:
//Cat
//big, fast 
