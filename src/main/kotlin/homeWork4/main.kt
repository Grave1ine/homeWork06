package homeWork4

/*
Реализуйте свой дата класс Person
Добавьте в него следующие проперти name:String, surname:String, age:Int
Реализуйте экстеншен функцию на список типизированный Person, которая сортирует список по возрасту в порядке убывания
Реализуйте экстеншен функцию на список типизированный Person, которая сортирует список в алфавитном порядке по имени. Если имена одинаковые, то учитывается фамилия
*/

fun main() {

    val person1 = Person("Tom", "Shelby", 40)
    val person2 = Person("Richard","Zorge", 35)
    val person3 = Person("Tom","Ford", 50)
    val person4 = Person("Nikola","Tesla",70)

    var roster: List<Person> = listOf(person1, person2, person3, person4)

    //var sort = roster.sortedBy { it.age }
    var sort = roster.sort()
    sort.print()

    println()
    println("/////////////////////////////////")
    println()

    var sortHiName = roster.sortName()
    sortHiName.print()

}

fun List<Person>.print(){
    for (i in this) println("${i.name} ${i.surname} age: ${i.age}")
}

fun List<Person>.sort(): List<Person> {
    return this.sortedBy { it.age }
}

fun List<Person>.sortName(): List<Person>{
    return this.sortedWith(compareBy(Person::name, Person::surname))    //вообще хз как это работает
    //return this.sortedBy { it.name }
}