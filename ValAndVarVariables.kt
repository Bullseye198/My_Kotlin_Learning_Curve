//Written by Bullseye198

//You can declare the variable outside of enclosing function. For example here, and it works:
//val name:String = "Nate"


fun main(){
    //there are 2 types of variables in kotlin, mutable (Var) and local read only variables (val) they are used only once.
    
    //Kotlin will automatically recognize the value, so no need to type in : String
    val name: String = "Nate"
    
    //name = "" //This gives us an error because val cannot be reassigned. We must use var.
    
    var names: String = "Horse"

    println(name)
    println(names)
    println(greeting)

    //We can also modify that greeting because this is a mutable variable:
    greeting = "hi"
    println(greeting)
}
