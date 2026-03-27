fun main () {
addition()
subtraction() 
multiplication()
division()
modulus ()
bmi ()
simpleInterest () 
areaCircle ()

}

fun addition () {
    val num1 = 6.8 
    val num2 = 6.2 
    val answer = num1 + num2
    println("The sum is: $answer")
}

fun subtraction () {
    val x = 6
    val y = 8
    val sub = x - y 
    println("The answer is: $sub")
}

fun multiplication () {
    val a = 6
    val b = 8
    val mult = a * b
    println("The multiplication answer is: $mult")
}

fun division () {
    val p2 = 10
    val z2 = 2
    val div = p2/z2
    println("The divion is:$div")
}

fun modulus () {
    val g = 5
    val n = 9
    val modu = g % n 
    println("The modulus of the no. is:$modu")
}

fun simpleInterest () {
    val p = 10
    val r= 30
    val t = 45
    val intrest = (p*r*t)/100
    println("The intrest is : $intrest")
}

fun areaCircle () {
    val r3 = 5
    val area = 22/7 * r3 * r3
    println("The area of a circle is : $area")
}

fun bmi () {
    val height = 20
    val weight = 10
    val bMi = height*weight/height
    println("The BMI is : $bMi")

}

fun triangle () {
    val b4 = 20
    val h4 = 5
    val tri = 1/2 * b4 *h4
    println  ("The Area of a triangle is : $tri")


}