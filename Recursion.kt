//Written by Bullseye198

fun main() {
    println(fact(5))
}

//This function repeates n * n-1 until it reaches 1, and then then return 1, 
//which gives us result 120.

fun fact (n: Int): Int {
    if (n <= 1)
        return 1
    else
        return n * fact(n-1)
}
