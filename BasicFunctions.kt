//Written by Bullseye198
//Let's make another function:
//You can make a single title inference from the same function from below:
//This lowers down the amount of code.
fun getGreeting () = "Hello Kotlin"

//First we add this function after the main function:
fun sayHello( /*here we can define function parameters */ ) {
    println(getGreeting())
}

fun main(){

    println ("Hello World")
    //Let's invoke an function from above:
    println(getGreeting())
    sayHello()
}
