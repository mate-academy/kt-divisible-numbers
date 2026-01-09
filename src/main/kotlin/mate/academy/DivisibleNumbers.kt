package mate.academy

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val ar = mutableListOf<Int>()
    numbers.forEach { i ->
        if (i > 0 && i % divider == 0)
            ar.add(i)
    }
    return ar.toIntArray()
}
