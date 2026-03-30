class Triangle{
    var base = 24.0
    var height = 18.0

    fun triangleArea(){
        val area = 0.5 * base * height
        println("The area of a triangle is: $area")
    }

   
}
 fun main () {
        val triangleObject = Triangle()
        triangleObject.triangleArea()
    }