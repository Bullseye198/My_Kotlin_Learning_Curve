//Written by Bullseye198

interface PersonInfoProvider {
    fun printInfo() {
        println("personInfoProvider")

    }
}

//Let's make a class that will implement an interface:
//We must override our function:
class BasicInfoProvider : PersonInfoProvider{
     override fun printInfo() {
        //now we can declare the behaviour of the interface:
        println("basicInfoProvider")

    }
}

fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo()
}

//System will print out: basicInfoProvider
