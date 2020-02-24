//Written by Bullseye198

//Let's create an object singleton:

object mySingleleton {
    fun doMyStuff(data: String) {
        println("This is my data $data")
    }
    val myConstant: String = "This is my Constant"
}

fun main() {

    mySingleleton.doMyStuff("Hello There " + mySingleleton.myConstant)
}

//prints out:
//This is my data Hello There this is my Constant
