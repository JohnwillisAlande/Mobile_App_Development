package org.example
import java.util.*

//fun main(args: Array<String>) {
//    val temperature = 10
//    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK"}."
//    println(message)
//}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change Water: ${shouldChangeWater(day)}")
}

fun main(args: Array<String>) {
    feedTheFish()
    swim()
    swim("slow")
    swim(speed = "turtle-like")
}

fun randomDay() : String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "red worms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun swim(speed: String = "fast"){
    println("Swimming speed")
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}