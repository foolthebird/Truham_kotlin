// inheritance in OOP
// parent object
open class Animal {
    fun eat() {
        println("An animal eats food")
    }
}

// Child object
class Dog : Animal() {
    fun bark (){
        println("A dog barks")
    }
}

fun main () {
    val dogObject = Dog()
    dogObject.bark()
    dogObject.eat()
}