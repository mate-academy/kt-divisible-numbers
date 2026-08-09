package mate.academy

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val list: MutableList<Int> = mutableListOf()
    var index = 0
    for (i in numbers.indices) {
        if (numbers[i] % divider == 0 && numbers[i] > 0) {
            list.add(index, numbers[i])
            index += 1
        }
    }
return list.toIntArray()
}

