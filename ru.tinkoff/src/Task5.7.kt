package src

import kotlin.Comparator

data class Person(
    val lastName: String,
    val firstName: String,
    var age: Int,
    var postIndex: Int,
    var phoneNumber: String
) {
    companion object : Comparator<Person> {
        override fun compare(p0: Person?, p1: Person?): Int {
            p0!!
            p1!!
            val lastNameCompareResult = p0.lastName.compareTo(p1.lastName)
            val firstNameCompareResult = p0.firstName.compareTo(p1.firstName)
            val ageCompareResult = p0.age.compareTo(p1.age)
            val postIndexCompareResult = p0.postIndex.compareTo(p1.postIndex)
            val phoneNumberCompareResult = p0.phoneNumber.compareTo(p1.phoneNumber)
            var personCompareResult = 0
            when {
                lastNameCompareResult != 0 -> personCompareResult = lastNameCompareResult
                firstNameCompareResult != 0 -> personCompareResult = firstNameCompareResult
                ageCompareResult != 0 -> personCompareResult = ageCompareResult
                postIndexCompareResult != 0 -> personCompareResult = postIndexCompareResult
                phoneNumberCompareResult != 0 -> personCompareResult = phoneNumberCompareResult
            }
            return when {
                personCompareResult == 0 -> 0
                personCompareResult > 0 -> 1
                else -> -1
            }
        }
    }
}

object PersonComparator : Comparator<Person> {
    override fun compare(p0: Person?, p1: Person?): Int {
        p0!!
        p1!!
        val lastNameCompareResult = p0.lastName.compareTo(p1.lastName)
        val firstNameCompareResult = p0.firstName.compareTo(p1.firstName)
        val ageCompareResult = p0.age.compareTo(p1.age)
        val postIndexCompareResult = p0.postIndex.compareTo(p1.postIndex)
        val phoneNumberCompareResult = p0.phoneNumber.compareTo(p1.phoneNumber)
        var personCompareResult = 0
        when {
            lastNameCompareResult != 0 -> personCompareResult = lastNameCompareResult
            firstNameCompareResult != 0 -> personCompareResult = firstNameCompareResult
            ageCompareResult != 0 -> personCompareResult = ageCompareResult
            postIndexCompareResult != 0 -> personCompareResult = postIndexCompareResult
            phoneNumberCompareResult != 0 -> personCompareResult = phoneNumberCompareResult
        }
        return when {
            personCompareResult == 0 -> 0
            personCompareResult > 0 -> 1
            else -> -1
        }
    }
}

fun main() {
    val personIvan = Person("Ivanov", "Ivan", 22, 390000, "89000000000")
    val personAnotherIvan = Person("Ivanov", "Ivan", 22, 390000, "89000000000")
    val personOldIvan = Person("Ivanov", "Ivan", 92, 390000, "89000000000")
    val somePerson = Person("Smith", "John", 35, 390040, "89000000098")

    println("First variant")
    println(PersonComparator.compare(personIvan, personAnotherIvan))
    println(PersonComparator.compare(personIvan, somePerson))
    println(PersonComparator.compare(personOldIvan, personAnotherIvan))
    println()
    println("Second variant")
    println(Person.compare(personIvan, personAnotherIvan))
    println(PersonComparator.compare(personIvan, somePerson))
    println(PersonComparator.compare(personOldIvan, personAnotherIvan))
}

fun printPersonCompareResult(first: Person, second: Person) {
    if (first.equals(second))
        println("${first.firstName} идентичен ${second.firstName}")
    else
        println("${first.firstName} не идентичен ${second.firstName}")
}