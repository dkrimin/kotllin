fun main() {
    println("task#1")

    println("Введите Количество товара")
    var x = readLine()!!.toInt()
    var y: Int
    if (x > 0 && x <= 9) {
        y = x * 1000
    } else if (x <= 19) {
        y = x * 800
    } else {
        y = x * 600
    }
    println("Стоимость товаров: $y")

    println("task2")
    println("Введите число")
    var q = readLine()!!.toInt()

    if (q %2 == 0) {
        println(" Число $q чётное.")
    } else { println("Число $q нечётное. ") }

    println("task3")

    println("Введите номер пальца")
    var f = readLine()!!.toInt()
    val finger = listOf("большой", "указательный", "средний", "безымянный", "мизинец")
    println("Ваш палец - ${finger[f - 1]}")



}