fun main () {
    val points = -10100

    if (points < 0){
        println("Inalid input")
    }
    else if (points <= 100){
        println("You do not Qualify ")
    }
    else if (points <= 400){
        println("You win a smartphone")
    }
    else if (points <= 1000){
        println("you win a laptop")
    }
    else{
        println("You win a Trip to Canada")
    }


    fun isLeapYear(year: Int): Boolean {
    return when {
        year % 400 == 0 -> true
        year % 100 == 0 -> false
        year % 4 == 0 -> true
     
        else -> false

        
    }  
      

    }


var number:Int =23
if(number % 2 == 0){println("even")}
 else println("Odd")
}