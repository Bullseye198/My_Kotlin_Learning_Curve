//Kotlin collection is by default immutable

fun sayHello(greeting:String, itemsToGreet:List<String>){
    itemsToGreet.forEach {itemToGreet ->
    println("$greeting $itemToGreet")
    }
}

fun main(){
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    sayHello(greeting = "Hi", itemsToGreet = interestingThings)

    }
