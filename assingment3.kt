fun main () {
    for(year in 2000..2025){
        println("The yons are: $year")
    }

    for (count in 100 downTo 1 ){
        println("The numbers are: $count")
    }

    for(yons in 2025 downTo 2000 step 2 ) {
        println(yons)
    }
    
    var number = -20
    while ( number <= 20){
        println("The number is : $number ")
        number = number + 1
    }

    var yans = 2000
    while (yans<= 2025){
    println("The even years are : $yans")
    yans = yans + 2
    }

    
    for(num in 1..10 step 1){
       var cal = 10 * num
       println("5 x $num = $cal ")
    }

    val planents = arrayOf("Earth","Mercury","venus","Jupiter","Mars","saturn","Uranus","Neptune")
    for (planent in planents){
        println(planent)
    }
}