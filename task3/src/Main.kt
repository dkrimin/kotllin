    fun main() {
    println("task#1")
    println("task#1")


    val collection: Map<String, Any> = mapOf("name" to "Дмитрий", "age" to 41, "fn" to 28)
    for ((key, value) in collection) {
        println("$key: $value")
    }


    /*
        println("task#2")
        println("Введите свой возраст")
        var x = readLine()!!.toInt()
        println("Есть ли у Вас билет? (0 - нет, 1 - да)")
        var y = readLine().equals("1")
        println("Прошли ли Вы регистрацию? (0 - нет, 1 - да)")
        var z = readLine().equals("1")
        println("Есть ли у Вас VIP -статус? (0 - нет, 1 - да)")
        var v = readLine().equals("1")
        if (x >= 18 && y && z) {
            println("Добро пожаловать на наше мероприятие!!")
        } else if (y && v) {
            println("Добро пожаловать на наше мероприятие дорогой гость!!")
        } else {
            println("Свободен холоп!!!")
        }
    */
}