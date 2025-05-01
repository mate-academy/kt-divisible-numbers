package mate.academy

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    val seen = mutableSetOf<Int>()
    numbers.forEach {
        if (it % divider == 0 && it > 0) {
            seen.add(it)
        }
    }
    return seen.toIntArray()
}
