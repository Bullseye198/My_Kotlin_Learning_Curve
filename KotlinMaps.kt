//Written by Bullseye198
//Maps are a collection that holds pairs of objects and supports efficiently retrieving the value corresponding to each key.

fun main() {

val map = mapOf(1 to "a", 2 to "b", 3 to "c")  //we've now defined a map with 3 pairs of values in it.
    //the keys are 1, 2 and 3, and the associated values are a, b and c.

    map.forEach { key, value -> println ("$key -> $value")  }
}
