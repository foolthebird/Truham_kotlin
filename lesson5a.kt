// object programming in kotlin
// creating an object person
 
class Person {
    // creating properties/variables
    var name = "Johnson"
    var age = 39

    // creating behaviour/functions
    fun speak() {
        println("The person $name can speak ")
    }

    fun eat (){
        println("The person $name can eat  ")
    }
}
fun main () {
    // creating an object person and assinging it to the variable myobject
    val myobject = Person()
    myobject.speak()
    myobject.eat()
}