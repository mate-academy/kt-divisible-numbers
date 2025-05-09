package mate.academy

const val MIN_POSITIVE = 0

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    return numbers.filter { it > MIN_POSITIVE && it % divider == 0 }.toIntArray()
}
