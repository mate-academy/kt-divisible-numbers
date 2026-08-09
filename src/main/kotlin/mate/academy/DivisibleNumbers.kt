package mate.academy

const val ZERO = 0
fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {
    return numbers.filter { it > ZERO && it % divider == ZERO }.toIntArray()
}
