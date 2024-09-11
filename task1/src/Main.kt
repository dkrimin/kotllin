import kotlin.math.sqrt

fun main() {
    val qqq = "i can"
    val www = "code"
    println("task#1")
    println("$qqq $www!")

    println("task#2")
    var myAge = 41
    var myAgeInTenYears = 51
    var daysInYear = 365.25
    var daysPassed:Float
    daysPassed= (daysInYear*myAgeInTenYears).toFloat()
    println("Мой возраст $myAge лет. Через 10 лет, мне будет $myAgeInTenYears лет, с момента моего рождения пройдет $daysPassed дней. ")

    println("task#3")

    var a = 8.0
    var c = a

    var s: Double
    s = 0.5 * a * c
    var p: Double

    p = a + c + sqrt(a * a + c * c)

    println("Площадь треугольника равна $s, периметр равен $p")


}