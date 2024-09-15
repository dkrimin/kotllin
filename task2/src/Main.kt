
import kotlin.math.sin

fun main() {
    println("taask1")
    var qqq: Float = 3.14F
    var www: Float = 42.0F
    var eee: Double
    eee = (qqq + www).toDouble()
    println(eee)
    println("taask2")
    var numberOne = 28
    var numberTwo = 11
    var result = numberOne / numberTwo
    var remainder = numberOne % numberTwo
    println("При делении $numberOne на $numberTwo результат равен $result, остаток равен $remainder")
    println("Результат деления $numberOne на $numberTwo равен $result $remainder/$numberTwo")
    println("taask3")
    var dayOfBirth = 28
    var monthOfBirth = 11
    var yearOfBirth = 1982
    var q = 2024 - 1 - yearOfBirth
    var w = q * 12 + 8
    var e = w * 30 + 11
    var r = e * 24 * 3600
    println("$q years, $w months, $e days and $r seconds have passed since my birth")
    if (monthOfBirth <= 3) {
        println("Я родился в первом квартале")
    } else if (monthOfBirth <= 6) {
        println("Я родился во втором квартале")
    } else if (monthOfBirth <= 9) {
        println("Яродился в третьем квартале")
    } else {
        println("Я родился в четвертом квартале")
    }
    println("task4")
    var ss: Double
    ss = sin(1.0)
    println(String.format("%.3f", ss))


}