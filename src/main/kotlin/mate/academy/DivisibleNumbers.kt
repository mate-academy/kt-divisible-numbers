package mate.academy

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    var array = mutableListOf<Int>()
    numbers.forEach { i -> if (i > 0 && i %divider == 0) array.add(i) }
    return array.toIntArray()
}
