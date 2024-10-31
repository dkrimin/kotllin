import kotlin.random.Random


class Employee() {
    var salary: Int = 0
    lateinit var name: String
    lateinit var surname: String
}


fun main() {
    var qqq = Employee()
    qqq.salary = 1234
    qqq.surname = "Galinov"
qqq.name = "Slava"
    println(qqq.name+" "+qqq.surname+"@@"+qqq.salary)
     val names: List<String> = listOf("John", "Aaron", "Tim", "Ted", "Steven")
    val surnames: List<String> = listOf("Smith", "Dow", "Isaacson", "Pennyworth", "Jankins")
     println(names)
    println(surnames)


}