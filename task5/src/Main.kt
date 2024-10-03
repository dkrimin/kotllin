import kotlin.random.Random

fun main() {
    println("Task#1")
    val y = 5
    var vklad: Float = 500000.0F
    var vkladWithPercrnt: Float = 500000.0F
    for (i in (1..y)) {
        vkladWithPercrnt = 1.11F * vkladWithPercrnt
    }
    println("Сумма вклада через $y лет увеличится на ${vkladWithPercrnt - vklad} и составит $vkladWithPercrnt рублей")
    println("Task#2")
    val intArray = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (item in intArray) {
        if (item % 2 == 0) {
            println(item)
        }
    }


    println("Task#3")

    var randomNumber: Int = 0
    for (i in ( 1..11)) {
        randomNumber = Random.nextInt(1, 10)
                if (randomNumber == 5) {
            println("Чтобы выпало число 5 понадобилось $i итераций")
            break
        }
    }

    if (randomNumber != 5) {
        println("За 10 итераций число 5 не выпало.")
    }
println("Task#4")
    var days: Int= 0
    var hS: Int= 0

    while (hS!= 10){
        days+=1
        hS+=2
    if (hS>=10){println("Черепахе понадобится $days дней чтобы забраться на столб.")} else{hS-=1}
    }




}