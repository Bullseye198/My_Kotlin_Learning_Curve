//Written by Bullseye198
//Kotlin Arrays and For Loops and ForEach Loops

fun main(){
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])  //Prints out first value inside of an array.

    //With for loop we can print out each element in the array:
    //first we define a variable. We called the variable interestingThing:
    for (interestingThing in interestingThings) {
        println(interestingThing)
    }
    //we can do the same thing with forEach loop:
    interestingThings.forEach {
        println(it) //it is the default name for each element in the array.
        
    //or we can iterate it like this:
    interestingThings.forEach { interestingThing -> println (interestingThing) }
    }
}
