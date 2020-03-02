//Written by Bullseye198

fun firstFunction (firstParam: String, paramBook : BookSize) {
    val book = "My book is bigger than $firstParam, and it's ${paramBook.thickness}."
    println(book)
 }

fun secondFunction(secParam: Int, paramBook: BookSize){
    val numPages = "My book has $secParam pages, and it's not ${paramBook.thinness}."
    println(numPages)
}

//We can use our object in different functions:
object BookSize{
    var thickness = "thick"
    var thinness = "thin"
    }


fun main() {

    firstFunction("Harry Potter" , paramBook = BookSize)
    secondFunction(650, paramBook = BookSize)

}

//Our program will print out:
//My book is bigger than Harry Potter, and it's thick.
//My book has 650 pages, and it's not thin.
