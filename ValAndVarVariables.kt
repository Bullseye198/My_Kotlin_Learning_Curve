//written by Bullseye198

fun main(){
    //there are 2 types of variables in kotlin, mutable (Var) and local read only variables (val) they are used only once.
    
    val name: String = "Nate"
    
    //name = "" //This gives us an error because val cannot be reassigned. We must use var.
    
    var names: String = "Horse"

    println(name)
    println(names)
}
