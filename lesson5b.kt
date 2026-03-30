class Square {
    // creating the variable/properties
    val width = 5.0
    val height = 5.0

    // Behavior/function 
    fun calculateArea () {
        val area = width * height
        println("The area of a square is $area")        
    }
    fun calculatePerimeter () {
        val perimeter = (width + height) * 2
        println("The perimeter is: $perimeter")

    }
}

fun main () {
    val squareObject = Square()
    squareObject.calculateArea()
    squareObject.calculatePerimeter()
}