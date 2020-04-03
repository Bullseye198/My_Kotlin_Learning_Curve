//Written by Bullseye198

import java.util.*

//We create an enum class:

enum class EntityType {
    EASY, MEDIUM, HARD
}


object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.name
            EntityType.HARD -> type.name
        }
        return Entity(id,name)
    }
}


class Entity constructor(val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}


fun main () {
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)

    val hardEntity = EntityFactory.create(EntityType.HARD)
    println(hardEntity)
}

//It will print out an UUID and the Entity Type Name.
