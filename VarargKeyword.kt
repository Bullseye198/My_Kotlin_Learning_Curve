//Written by Bullseye198

//vararg is a keyword that represents a variable number of arguments

fun sayHello(greeting:String, vararg itemsToGreet: String){
    itemsToGreet.forEach {itemToGreet ->
    println("$greeting $itemToGreet")
    }
}

fun main(){
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    sayHello("Hi", "Kotlin", "Programming", "Comic Books")
    //Now we don't need to pass a second parameter because we have vararg keyword.
    //It is basically treated as an array of whichever type it's used to specify.
    //We eliminated the need to always pass in a value after the initial greeting argument.
    }
