package mate.academy

fun getDivisibleNumbers(numbers: IntArray, divider: Int): IntArray {

    if (divider == 0) return IntArray(0)

    return numbers
        .filter { it > 0 && it % divider == 0 }
        .toIntArray()
}
