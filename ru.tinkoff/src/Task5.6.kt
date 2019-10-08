package src

data class Person(
    val lastName: String,
    val firstName: String,
    var age: Int,
    var postIndex: Int,
    var phoneNumber: String
)

fun main() {
    val personIvan = Person("Ivanov", "Ivan", 22, 390000, "89000000000")
    val personAnotherIvan = Person("Ivanov", "Ivan", 22, 390000, "89000000000")
    val personOldIvan = Person("Ivanov", "Ivan", 92, 390000, "89000000000")
    val somePerson = Person("Smith", "John", 35, 390040, "89000000098")
    printPersonCompareResult(personIvan, personAnotherIvan)
    printPersonCompareResult(personIvan, somePerson)
    printPersonCompareResult(personOldIvan, personAnotherIvan)
}

fun printPersonCompareResult(first: Person, second: Person) {
    if (first.equals(second))
        println("${first.firstName} идентичен ${second.firstName}")
    else
        println("${first.firstName} не идентичен ${second.firstName}")
}