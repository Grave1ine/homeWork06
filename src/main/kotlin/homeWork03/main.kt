package homeWork03

/*
Создайте список и заполните его целыми числами 0-99
Напишите следующую цепочку операторов
Удаляет из цепочки все нечетные числа
Берет слайс с 10 по 20 элементы
Добавляет к каждому элементу 1
Суммирует все оставшиеся числа и возвращает сумму
*/

fun main() {

    var _numberList: MutableList<Int> = mutableListOf()         //объявление списка

    for (i in 0..99) _numberList.add(i)                   //заролнение значениями
    println(_numberList)

    val size = _numberList.size - 1
    for (i in 0..size){
        if (i % 2 != 0) _numberList.remove(i)                   //убрать не четные элементы
        //val odd = _numberList.filter { it%2 != 0 }
    }
    println(_numberList)

    val transit = _numberList.slice(10..20)        //взять слайс от 10 до 20
    _numberList.clear()
    _numberList = transit as MutableList<Int>
    println(_numberList)

    for (i in _numberList.indices){                             //допавить к элемента м +1
        _numberList[i] += 1
    }
    println(_numberList)

    var sum: Int = 0
    for (i in _numberList){                                     //сложить оставшиеся
        sum += i
    }
    println(sum)
}

