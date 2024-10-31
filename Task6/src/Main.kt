fun filterThree(input: MutableList<Int>): MutableList<Int> {
   var output: MutableList<Int> = mutableListOf()
    for (i in input) {
        if (modThree(i) ) {
            output.add(i)
        }
    }
    return output
}


fun filterIntArray(input: MutableList<Int>): MutableList<Int> {
    var output: MutableList<Int> = mutableListOf()
    for (i in input) {
        if (chetnoe(i) == false) {
            output.add(i)
        }
    }
    return output
}

fun createIntArray(x: Int, y: Int): MutableList<Int> {
    var result: MutableList<Int> = mutableListOf(x)
    for (i in x + 1..y) {
        result.add(i)
    }
    return result
}

fun modThree(a: Int): Boolean {
    if (a % 3 == 0) {
        return true
    } else {
        return false
    }
}

fun chetnoe(z: Int): Boolean {
    if (z % 2 == 0) {
        return true
    } else {
        return false
    }


}


fun summa(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    println("Task#1")
    var SKA: Map<String, List<String>> =
        mapOf("Северсталь" to listOf("6:3", "3:1", "5:2"), "Динамо Москва" to listOf("3:1", "6:1", "22:2"))


    for (i in SKA.keys) {
        for (j in SKA.get(i)!!)
    println("Результат игры СКА - $i $j")

    }

    println("Task#2")
    var x: Int = 11
    var y: Int = 33
    println("Сумма x и y: ${summa(x, y)}")
    println("Task#3.1")
    var q = chetnoe(12)
    println(q)
    println("Task#3.2")
    println(modThree(33))
    println("Task3.3")
    println(createIntArray(1, 12))
    println("Task#3.4")
    var intArray = createIntArray(1, 100)
    println("Task#3.5")
    println(filterIntArray(intArray))
    println("Task#3.6")
    println(filterThree(intArray))


}