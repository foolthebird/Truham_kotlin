fun main () {
subtraction (9,8)
 division (42,3)
 multiplictation(34,3)
 modulus (33,2)
 areaCircle(6)
 areaTriangle(54,4)
 simpleInterest(30000,4,3)
 bmi(34,23)
}
fun addition(bz:Int,cx:Int){
    val jibu = bz + cx
    println("The addition is:$jibu")
}

fun subtraction (a:Int,b:Int){
    val answer = a - b
    println("The subtraction is :$answer ")
}
 fun division ( c:Int,d:Int){
    val sub = c - d
    println("The division is: $sub")
 }
 fun multiplictation (e:Int,f:Int){
    val multi = e * f
    println("The multiplication is: $multi")

 }
 fun modulus (g:Int,h:Int){
    val mod = g * h
    println("The modulus is:$mod")
 }
 fun areaCircle (r:Int){
    val area = 22/7 * r * r 
    println("The area of a circle is : $area")
 }
 fun areaTriangle (b1:Int,h1:Int){
    val area = 1/2 * b1 * h1
    println("The area of a triangle is: $area")
 }
 fun simpleInterest (p2:Int,r2:Int,t:Int){
    val intrest = (p2*r2*t)/100
    println("The Interest is: $intrest")
 }
 fun bmi (weight:Int,height:Int){
    val bMi = (weight*height/weight)
    println("Your BMI is: $bMi")
 }

