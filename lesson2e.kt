fun main () {
    // when statement in kotlin
    var marks: Int = 10

    when(marks) {
        in 0..20 -> println("You have $marks: You Failed")
        in 21..40 -> println("You have $marks: Below Average")
        in 41..60 -> println("You have $marks: Average")
        in 61..80 -> println("You have $marks: Above Average")
        in 81..100 -> println("You have $marks: You passed")
        else -> println("Invalid Marks")
    }
}