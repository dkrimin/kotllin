import kotlin.random.Random


data class Employee(val name: String, val surname: String, val salary: Int)

val names = arrayOf("John", "Aaron", "Tim", "Ted", "Steven")
val surnames = arrayOf("Smith", "Dow", "Isaacson", "Pennyworth", "Jankins")

fun main() {

    val employees = mutableListOf<Employee>()
    repeat(10) {
        val name = names.random() // Случайное имя
        val surname = surnames.random() // Случайная фамилия
        val salary = Random.nextInt(1000, 2001) // Случайная зарплата
        employees.add(Employee(name, surname, salary))
    }


    println("Все сотрудники:")
    employees.forEach {
        println("${it.name} ${it.surname}'s salary is $${it.salary}")
    }


    val evenSalaryEmployees = employees.filter { it.salary % 2 == 0 }


    println("\nСотрудники с четной зарплатой:")
    evenSalaryEmployees.forEach {
        println("${it.name} ${it.surname}'s salary is $${it.salary}")
    }
}
