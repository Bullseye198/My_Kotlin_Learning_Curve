//Written by Bullseye198

//You can declare the variable outside of enclosing function.
//Kotlin will automatically recognize the value, so no need to type in : String

//When statement is very similar with switch statements in Java.
val name = "Nate"
var greeting: String? = null

fun main(){

    //In this block below we can define each value that we can act on differently:
    
    when(greeting) {
        null -> println ("Hi")
        //Else is default if none of the values above are matched:
        else -> println(greeting)

        //What this means: when greeting is null, print. If it's not, then print else.
    }

    println(name)
}
