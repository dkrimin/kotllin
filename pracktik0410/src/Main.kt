fun sumAndStar(numbers: Triple<Int, Int, Int>): Pair<Int, Int> {
    val (a, b, c) = numbers
    val sum = a + b + c
    val star = a * b * c
    return Pair(sum, star)
}


fun countLetters(input: String): Int {
    val letters = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var count = 0

    for (char in input) {
        if (char in letters) {
            count++
        }
    }

    return count
}

fun main() {
    println("Task#4")
    val intArray = mutableListOf<Int>()
    for (i in (1..100)){if (i%2==0){intArray.addLast(i)}}
    println("Массив чётных чисел от 1 до 100: $intArray")
    println("Task#5")
    val test = "sonfwuofbwiufbwiybwybqqqeeeeaaawbgs"
    val x =countLetters(test)
    println("Колитчество гласных в строке: $x")

    println("Task#3")

    val numbers = Triple(11, 22, 33)
    val (sum, star) = sumAndStar(numbers)
    println("Сумма чисел: $sum")
    println("Произведение чисел: $star")



}