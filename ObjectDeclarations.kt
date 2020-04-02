//Written by Bullseye198

class Entity constructor(val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}

object EntityFactory {
    fun create()= Entity ("id", "name")
}

fun main () {
    val entity = EntityFactory.create()
    println(entity)
}

//Our program will print out:
//  id:id name:name
