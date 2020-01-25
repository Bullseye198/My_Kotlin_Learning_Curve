//Written by Bullseye198

fun sayHello(itemToGreet:String){
    val msg = "Hello " + itemToGreet
    //we can substitute variable values into a predefined string template with $ sign:
    //val msg = "Hello $itemToGreet

    println(msg)

    //If we want to make the same thing in one line, it would look like this:
    //fun sayHello(itemToGreet:String) = println("Hello $itemToGreet")
}

fun main(){
    sayHello(itemToGreet = "Kotlin")
}
