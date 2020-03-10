//Written by Bullseye198

class Person(var firstName: String = "Tom", var lastName: String = "Hardy") {

    var nickName: String = "Bane"
       
    fun printInfo() {
        println("$firstName ($nickName) $lastName")
    }

}
fun main() {

    //We call our Person class within our main function:
    val person = Person()
    person.printInfo()

}

//Program will print our: "Tom (Bane) Hardy
