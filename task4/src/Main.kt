fun main() {
    println("task#1")




    println("Введите Количество товара")
    var x = readLine()!!.toInt()
    var y: Int
    if (x > 0 && x <= 9) {
        y = x * 1000
    } else if (x <= 19) { y = x * 800 } else { y = x * 600 }
    println("Стоимость товаров: $y")


}