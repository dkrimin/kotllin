fun main() {
    println("task#1")




    println("Введите Количество товара")
    var x = readLine()!!.toInt()
    var y: int
    if (x > 0 && x <= 9) {
        y = x * 1000
    } elseif (x <= 19) { y = x * 800 } else { y = x * 600 }
    println("Стоимость товаров: $x")


}