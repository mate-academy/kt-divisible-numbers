package mate.academy

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    return numbers.filter { it % divider == 0 && it > 0 }.toIntArray()
}
