fun factorial(n: Int): Int {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}


fun main() {
    println("Task#6")
    var phone: Map<String, List<String>> =
        mapOf(
            "apple" to listOf("iphone 11", "iphone 13", "iphone 15 pro"),
            "samsung" to listOf(" S22", " s23", " s7")
        )
    for (i in phone.keys) {
        for (j in phone.get(i)!!)
            println("$i $j")

    }

    println("Task #4")
    val number = 7
    val factorialResult = factorial(number)
    println("Факториал числа $number = $factorialResult")
    println("Task#3")

    val array = intArrayOf(21, 66, 1, 17, 111, 71, 90)
    println("исходный массив: ${array.joinToString(", ")}")

    val n = array.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - 1 - i) {
            if (array[j] > array[j + 1]) {

                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }


    }

    println("отсортированный массив: ${array.joinToString(", ")}")

}